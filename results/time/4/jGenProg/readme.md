#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//time/ project time
##Original Patch 

```Java
diff --git a/src/main/java/org/joda/time/Partial.java b/src/main/java/org/joda/time/Partial.java
index 8e8e603..0d4edf4 100644
--- a/src/main/java/org/joda/time/Partial.java
+++ b/src/main/java/org/joda/time/Partial.java
@@ -461,7 +461,7 @@ public final class Partial
             System.arraycopy(iValues, i, newValues, i + 1, newValues.length - i - 1);
             // use public constructor to ensure full validation
             // this isn't overly efficient, but is safe
-            Partial newPartial = new Partial(newTypes, newValues, iChronology);
+            Partial newPartial = new Partial(iChronology, newTypes, newValues);
             iChronology.validate(newPartial, newValues);
             return newPartial;
         }
```

--- 
#Seed: 1

## Patch 1 #  jGenProg+MinImpact With Seed 1

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 57


--- 
#Seed: 2

## Patch 2 #  jGenProg+MinImpact With Seed 2

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 59


--- 
#Seed: 3

## Patch 3 #  jGenProg+MinImpact With Seed 3

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 55


--- 
#Seed: 4

## Patch 4 #  jGenProg+MinImpact With Seed 4

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 60


--- 
#Seed: 5

## Patch 5 #  jGenProg+MinImpact With Seed 5

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 57


--- 
#Seed: 6

## Patch 6 #  jGenProg+MinImpact With Seed 6

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 56


--- 
#Seed: 7

## Patch 7 #  jGenProg+MinImpact With Seed 7

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 57


--- 
#Seed: 8

## Patch 8 #  jGenProg+MinImpact With Seed 8

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 56


--- 
#Seed: 9

## Patch 9 #  jGenProg+MinImpact With Seed 9

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 55


--- 
#Seed: 10

## Patch 10 #  jGenProg+MinImpact With Seed 10

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 57


--- 
#Seed: 11

## Patch 11 #  jGenProg+MinImpact With Seed 11

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 55


--- 
#Seed: 12

## Patch 12 #  jGenProg+MinImpact With Seed 12

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 55


--- 
#Seed: 13

## Patch 13 #  jGenProg+MinImpact With Seed 13

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 55


--- 
#Seed: 14

## Patch 14 #  jGenProg+MinImpact With Seed 14

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 55


--- 
#Seed: 15

## Patch 15 #  jGenProg+MinImpact With Seed 15

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 57


--- 
#Seed: 16

## Patch 16 #  jGenProg+MinImpact With Seed 16

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 56


--- 
#Seed: 17

## Patch 17 #  jGenProg+MinImpact With Seed 17

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 57


--- 
#Seed: 18

## Patch 18 #  jGenProg+MinImpact With Seed 18

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 54


--- 
#Seed: 19

## Patch 19 #  jGenProg+MinImpact With Seed 19

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 56


--- 
#Seed: 20

## Patch 20 #  jGenProg+MinImpact With Seed 20

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 56


--- 
#Seed: 21

## Patch 21 #  jGenProg+MinImpact With Seed 21

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 57


--- 
#Seed: 22

## Patch 22 #  jGenProg+MinImpact With Seed 22

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 57


--- 
#Seed: 23

## Patch 23 #  jGenProg+MinImpact With Seed 23

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 56


--- 
#Seed: 24

## Patch 24 #  jGenProg+MinImpact With Seed 24

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 59


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 56.83

Average Nb of Failing EvoSuite Tests: 0.92

---