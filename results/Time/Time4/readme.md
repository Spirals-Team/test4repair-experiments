
##Human Patch 

```Java
diff --git a/src/main/java/org/joda/time/Partial.java b/src/main/java/org/joda/time/Partial.java
index 8e8e603..0d4edf4 100644
--- a/src/main/java/org/joda/time/Partial.java
+++ b/src/main/java/org/joda/time/Partial.java
@@ -461,7 +461,7 @@ public final class Partial
             System.arraycopy(iValues, i, newValues, i + 1, newValues.length - i - 1);
             // use public constructor to ensure full validation
             // this isn't overly efficient, but is safe
+            Partial newPartial = new Partial(newTypes, newValues, iChronology);
-            Partial newPartial = new Partial(iChronology, newTypes, newValues);
             iChronology.validate(newPartial, newValues);
             return newPartial;
         }
```


## Patch Original jGenProg 

org.joda.time.field.ZeroIsMaxDateTimeField:138

Patch type: ReplaceOp 
 
```Java
return (getWrappedField().getMaximumValue()) + 1
```

Execution Time: 0:01 (hh:mm)



--- 


## Patch 1 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 1

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 2 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 1

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 3 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 1

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 4 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 1

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 5 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 1

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 6 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 1

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 7 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 1

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 8 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 1

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 9 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 1

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 10 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 1

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 11 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 1

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 12 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 2

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 13 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 2

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 14 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 2

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 15 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 2

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 16 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 2

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 17 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 2

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 18 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 2

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 19 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 2

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 20 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 2

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2



## Patch 21 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 2

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 22 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 3

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 23 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 3

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 24 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 3

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 25 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 3

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 26 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 3

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 27 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 3

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 28 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 3

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 29 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 3

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 30 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 3

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 31 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 3

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 32 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 4

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 0



## Patch 33 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 4

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 0



## Patch 34 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 4

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 1



## Patch 35 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 4

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 1



## Patch 36 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 4

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 1



## Patch 37 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 4

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 1



## Patch 38 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 4

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 1



## Patch 39 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 4

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 1



## Patch 40 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 4

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 1



## Patch 41 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 4

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 60

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 42 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 5

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0



## Patch 43 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 5

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0



## Patch 44 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 5

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0



## Patch 45 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 5

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 46 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 5

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 47 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 5

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 48 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 5

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 49 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 5

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 50 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 5

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 51 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 5

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 52 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 5

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 53 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 5

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 54 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 6

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 55 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 6

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 56 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 6

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 57 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 6

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 58 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 6

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 59 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 6

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 60 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 6

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 61 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 6

Execution Time: 0:35 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 62 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 6

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 63 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 6

Execution Time: 1:15 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 64 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 6

Execution Time: 1:26 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 65 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 7

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0



## Patch 66 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 7

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 67 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 7

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 68 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 7

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 69 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 7

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 70 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 7

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 71 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 7

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 72 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 7

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2



## Patch 73 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 7

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 2


--- 


## Patch 74 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 8

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 75 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 8

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 76 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 8

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 77 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 8

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 78 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 8

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 79 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 8

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 80 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 8

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 81 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 8

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 82 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 8

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 83 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 8

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 84 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 9

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 85 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 9

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 86 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 9

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 87 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 9

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 88 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 9

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 89 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 9

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 90 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 9

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 91 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 9

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 92 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 9

Execution Time: 0:40 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 93 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 9

Execution Time: 0:41 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 94 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 10

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0



## Patch 95 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 10

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0



## Patch 96 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 10

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 97 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 10

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 98 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 10

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 99 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 10

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 100 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 10

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 101 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 10

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 102 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 10

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 103 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 10

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 104 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 10

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 105 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 11

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 106 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 11

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 107 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 11

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 108 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 11

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 109 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 11

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 110 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 11

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 111 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 11

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 112 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 11

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 113 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 11

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 114 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 11

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 115 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 11

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 116 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 11

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 117 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 12

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 0



## Patch 118 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 12

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 0



## Patch 119 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 12

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 0



## Patch 120 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 12

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 0



## Patch 121 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 12

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 0



## Patch 122 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 12

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 0



## Patch 123 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 12

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 124 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 12

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 125 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 12

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 126 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 12

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 127 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 12

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 128 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 12

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 129 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 13

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 130 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 13

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 131 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 13

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 132 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 13

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 133 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 13

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 134 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 13

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 135 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 13

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 136 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 13

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 137 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 13

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 138 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 13

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 139 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 13

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 140 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 14

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 141 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 14

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 142 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 14

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 143 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 14

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 144 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 14

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 145 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 14

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 146 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 14

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 147 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 14

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 148 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 14

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 149 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 14

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1



## Patch 150 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 14

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 55

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 151 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 15

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 152 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 15

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 153 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 15

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 154 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 15

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 155 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 15

Execution Time: 0:11 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 156 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 15

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 157 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 15

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 158 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 15

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 159 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 15

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 160 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 15

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 161 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 15

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 4


--- 


## Patch 162 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 16

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 0



## Patch 163 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 16

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 164 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 16

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 165 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 16

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 166 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 16

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 167 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 16

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 168 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 16

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 169 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 16

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 170 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 16

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 171 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 16

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 172 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 16

Execution Time: 0:31 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 173 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 17

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 174 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 17

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 175 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 17

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 176 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 17

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 177 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 17

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 178 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 17

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 179 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 17

Execution Time: 0:22 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 180 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 17

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 181 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 17

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 182 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 17

Execution Time: 0:29 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 183 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 17

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 184 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 18

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 185 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 18

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 186 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 18

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 187 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 18

Execution Time: 0:13 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 188 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 18

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 189 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 18

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 190 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 18

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 191 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 18

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 192 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 18

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 193 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 18

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1



## Patch 194 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 18

Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 54

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 195 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 19

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 196 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 19

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 197 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 19

Execution Time: 0:10 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 198 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 19

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 199 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 19

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 200 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 19

Execution Time: 0:19 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 201 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 19

Execution Time: 0:21 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 202 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 19

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 203 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 19

Execution Time: 0:24 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 204 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 19

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 205 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 20

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 0



## Patch 206 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 20

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 207 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 20

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 208 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 20

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 209 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 20

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 210 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 20

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 211 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 20

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 212 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 20

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 213 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 20

Execution Time: 0:26 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 214 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 20

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 215 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 20

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 216 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 20

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 217 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 21

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 0



## Patch 218 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 21

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 219 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 21

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 220 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 21

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 221 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 21

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 222 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 21

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 223 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 21

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 224 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 21

Execution Time: 0:17 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 225 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 21

Execution Time: 0:23 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 226 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 21

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 227 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 21

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 228 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 22

Execution Time: 0:03 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 229 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 22

Execution Time: 0:06 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 230 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 22

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 231 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 22

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 232 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 22

Execution Time: 0:30 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 233 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 22

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 234 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 22

Execution Time: 0:34 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 235 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 22

Execution Time: 0:38 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 236 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 22

Execution Time: 1:04 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1



## Patch 237 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 22

Execution Time: 1:06 (hh:mm) 

Nb of EvoSuite Tests: 57

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 238 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 23

Execution Time: 0:02 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 239 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 23

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 240 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 23

Execution Time: 0:08 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 241 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 23

Execution Time: 0:09 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 242 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 23

Execution Time: 0:12 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 243 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 23

Execution Time: 0:15 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 244 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 23

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 245 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 23

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 246 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 23

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 247 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 23

Execution Time: 0:27 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 248 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 23

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1



## Patch 249 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 23

Execution Time: 0:32 (hh:mm) 

Nb of EvoSuite Tests: 56

Nb of Failing EvoSuite Tests: 1


--- 


## Patch 250 #  jGenProg+MinImpact 

jGenProg+MinImpact returns this patch in the first place

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getMaximumValue()

```


Seed: 24

Execution Time: 0:16 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 0



## Patch 251 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue(instant)

```


Seed: 24

Execution Time: 0:04 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 252 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue(instant, values)) + 1

```


Seed: 24

Execution Time: 0:05 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 253 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return (getWrappedField().getMaximumValue()) + 1

```


Seed: 24

Execution Time: 0:07 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 254 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 138

Patch type: ReplaceOp

```Java

return getMaximumValue(instant)

```


Seed: 24

Execution Time: 0:14 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 255 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 3

```


Seed: 24

Execution Time: 0:18 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 256 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 111

Patch type: ReplaceOp

```Java

return getName().hashCode()

```


Seed: 24

Execution Time: 0:20 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 257 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 0

```


Seed: 24

Execution Time: 0:25 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 258 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return getMinimumValue()

```


Seed: 24

Execution Time: 0:28 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 259 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return -1

```


Seed: 24

Execution Time: 0:33 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 260 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 1

```


Seed: 24

Execution Time: 0:36 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1



## Patch 261 #  jGenProg+MinImpact 

org.joda.time.field.ZeroIsMaxDateTimeField : 178

Patch type: ReplaceOp

```Java

return 2

```


Seed: 24

Execution Time: 0:42 (hh:mm) 

Nb of EvoSuite Tests: 59

Nb of Failing EvoSuite Tests: 1


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 56.4

Average Nb of Failing EvoSuite Tests: 1.02

Average Nb of Test-adequate patches: 10.88

Running jGenProg + MinImpact changes the original patch for 26 of the 30 seeds. The human patch uses a different constructor of the class Partial, the orginal patch and the newly generated patches by running jGenProg + MinImpact seem to be irrevlant to the human change, we think they just make the failing test pass and are incorrect. 

---
