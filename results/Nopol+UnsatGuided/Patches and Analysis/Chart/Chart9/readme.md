
## Human Patch 

```Java
diff --git a/source/org/jfree/data/time/TimeSeries.java b/source/org/jfree/data/time/TimeSeries.java
index d16d447..4067e3e 100644
--- a/source/org/jfree/data/time/TimeSeries.java
+++ b/source/org/jfree/data/time/TimeSeries.java
@@ -941,7 +941,7 @@ public class TimeSeries extends Series implements Cloneable, Serializable {
             endIndex = -(endIndex + 1); // this is first item AFTER end period
             endIndex = endIndex - 1;    // so this is last item BEFORE end
         }
+        if ((endIndex < 0)  || (endIndex < startIndex)) {
-        if (endIndex < 0) {
             emptyRange = true;
         }
         if (emptyRange) {

```


## Original Patch # Nopol 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Execution Time: 00:01 (hh:mm)


## Patch 1 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 4

Execution Time: 01:10 (hh:mm)

Nb of EvoSuite Tests:110

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 2 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 12

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:83

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 3 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 18

Execution Time: 00:34 (hh:mm)

Nb of EvoSuite Tests:106

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 4 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 26

Execution Time: 00:24 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 5 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 28

Execution Time: 01:28 (hh:mm)

Nb of EvoSuite Tests:121

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 6 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 35

Execution Time: 00:27 (hh:mm)

Nb of EvoSuite Tests:118

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 7 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 41

Execution Time: 00:45 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 8 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 54

Execution Time: 00:49 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 9 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 60

Execution Time: 01:09 (hh:mm)

Nb of EvoSuite Tests:117

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 10 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 66

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:94

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 11 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 75

Execution Time: 01:09 (hh:mm)

Nb of EvoSuite Tests:106

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 12 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 83

Execution Time: 01:09 (hh:mm)

Nb of EvoSuite Tests:106

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 13 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 98

Execution Time: 01:08 (hh:mm)

Nb of EvoSuite Tests:104

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 14 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 100

Execution Time: 01:18 (hh:mm)

Nb of EvoSuite Tests:119

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 15 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 104

Execution Time: 01:16 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 16 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 111

Execution Time: 00:46 (hh:mm)

Nb of EvoSuite Tests:101

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 17 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 113

Execution Time: 01:08 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 18 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 120

Execution Time: 00:48 (hh:mm)

Nb of EvoSuite Tests:98

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 19 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 128

Execution Time: 01:15 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 20 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 135

Execution Time: 00:52 (hh:mm)

Nb of EvoSuite Tests:97

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 21 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 143

Execution Time: 00:12 (hh:mm)

Nb of EvoSuite Tests:100

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 22 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 150

Execution Time: 01:06 (hh:mm)

Nb of EvoSuite Tests:106

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 23 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 153

Execution Time: 00:58 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 24 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 161

Execution Time: 00:33 (hh:mm)

Nb of EvoSuite Tests:103

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 25 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 166

Execution Time: 01:12 (hh:mm)

Nb of EvoSuite Tests:114

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 26 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 173

Execution Time: 00:53 (hh:mm)

Nb of EvoSuite Tests:93

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 27 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 180

Execution Time: 01:08 (hh:mm)

Nb of EvoSuite Tests:107

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 28 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 181

Execution Time: 01:09 (hh:mm)

Nb of EvoSuite Tests:102

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 29 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 186

Execution Time: 01:38 (hh:mm)

Nb of EvoSuite Tests:129

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Patch 30 # Nopol+UnsatGuided 

org.jfree.data.time.TimeSeries : 883

Patch type: PRECONDITION

```Java
org.jfree.data.time.TimeSeries.this.data.size() == org.jfree.data.time.TimeSeries.this.range.length()
```

Seed: 193

Execution Time: 00:19 (hh:mm)

Nb of EvoSuite Tests:105

Nb of Contradiction Tests:0

Nb of Removed Tests:0


## Summary an Analysis 

Average Execution Time of Running Nopol+UnsatGuided: 00:57 (hh:mm)

Average Nb of EvoSuite Tests:105.47

 Average Nb of Contradiction Tests:0

Average Nb of Removed Tests:0

Running Nopol+UnsatGuided does not change the original patch for any of the seeds. The human patch checks whether the end index is smaller than the start index and sets the result to be empty if so, the generated patch adds a precondition to a statement, we think it is incorrect.