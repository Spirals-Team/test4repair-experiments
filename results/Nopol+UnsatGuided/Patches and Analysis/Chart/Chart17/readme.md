
## Human Patch 

```Java
diff --git a/source/org/jfree/data/time/TimeSeries.java b/source/org/jfree/data/time/TimeSeries.java
index 907fc20..ffd1dff 100644
--- a/source/org/jfree/data/time/TimeSeries.java
+++ b/source/org/jfree/data/time/TimeSeries.java
@@ -854,8 +854,7 @@ public class TimeSeries extends Series implements Cloneable, Serializable {
      *         subclasses may differ.
      */
     public Object clone() throws CloneNotSupportedException {
+        TimeSeries clone = (TimeSeries) super.clone();
+        clone.data = (List) ObjectUtilities.deepClone(this.data);
-        Object clone = createCopy(0, getItemCount() - 1);
         return clone;
     }
 

```


## Original Patch # Nopol 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 4

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:98

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 12

Execution Time: 01:14 (hh:mm)

Nb of EvoSuite Tests:114

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 18

Execution Time: 01:22 (hh:mm)

Nb of EvoSuite Tests:118

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 26

Execution Time: 00:34 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 28

Execution Time: 01:20 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 35

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:116

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 41

Execution Time: 01:03 (hh:mm)

Nb of EvoSuite Tests:111

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 54

Execution Time: 01:32 (hh:mm)

Nb of EvoSuite Tests:122

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 60

Execution Time: 01:06 (hh:mm)

Nb of EvoSuite Tests:108

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 66

Execution Time: 00:05 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Removed Tests:27


## Patch 11 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 75

Execution Time: 00:40 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 83

Execution Time: 00:38 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 98

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 100

Execution Time: 01:00 (hh:mm)

Nb of EvoSuite Tests:119

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 104

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:113

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 111

Execution Time: 01:09 (hh:mm)

Nb of EvoSuite Tests:126

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 113

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 120

Execution Time: 00:51 (hh:mm)

Nb of EvoSuite Tests:108

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 128

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 135

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:106

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 143

Execution Time: 00:16 (hh:mm)

Nb of EvoSuite Tests:96

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 150

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 153

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:114

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 161

Execution Time: 00:32 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 166

Execution Time: 00:21 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 173

Execution Time: 00:30 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 180

Execution Time: 00:34 (hh:mm)

Nb of EvoSuite Tests:118

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 181

Execution Time: 00:57 (hh:mm)

Nb of EvoSuite Tests:115

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 186

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 880

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 193

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:48 (hh:mm)

Average Nb of EvoSuite Tests:108.27

Average Nb of Removed Tests:0.9

Running Nopol+UnsatGuided does not change the original patch for any of the seeds. The human patch uses the clone method of its parent and uses an utility class to copy the other specific data, the generated patch adds a precondition before a statement and we think it does not fix the clone problem. We observe failing EvoSuite tests for programs patched with the original Nopol patch, which verifies our analysis.
