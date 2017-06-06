import json
import os

def parseTBetJSONFile(dir):
    """Parses a json file and returns a dictionary with key Project_Id, and value the json content"""
    results = {}

    for item in os.listdir(dir):
        fbug = os.path.join(dir, item)
        if os.path.isfile(fbug) and item.endswith(".json"):
            json_data = open(fbug).read()
            data = json.loads(json_data)
            results[item.replace(".json", "").lower()] = data

    return results