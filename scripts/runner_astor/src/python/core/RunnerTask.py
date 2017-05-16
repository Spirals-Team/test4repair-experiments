import os
import json
import collections

class RunnerTask(object):
	"""docstring for NodeHandler"""
	def __init__(self, tool, project, id, scope,seed):
		self.tool = tool
		self.project = project
		self.id = id
		self.scope = scope
		self.seed=seed
