#Bug /Users/matias/develop/results/test4Repair/test4repair-experiments/results//math/ project math
##Original Patch 

```Java
diff --git a/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java b/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java
index cff5bfd..b6ce68e 100644
--- a/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java
+++ b/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java
@@ -227,7 +227,7 @@ public class BrentOptimizer extends BaseAbstractUnivariateOptimizer {
 
                 if (checker != null) {
                     if (checker.converged(iter, previous, current)) {
-                        return best(current, previous, isMinim);
+                        return current;
                     }
                 }
 
@@ -264,7 +264,7 @@ public class BrentOptimizer extends BaseAbstractUnivariateOptimizer {
                     }
                 }
             } else { // Default termination (Brent's criterion).
-                return best(current, previous, isMinim);
+                return current;
             }
             ++iter;
         }
```

--- 
#Seed: 3

## Patch 1 #  jGenProg+MinImpact With Seed 3

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.univariate.BrentOptimizer : 244

Patch type: InsertAfterOp

```Java

if (((p > (q * (a - x))) && (p < (q * (b - x)))) && ((org.apache.commons.math3.util.FastMath.abs(p)) < (org.apache.commons.math3.util.FastMath.abs(((0.5 * q) * r))))) {
	d = p / q;
	u = x + d;
	if (((u - a) < tol2) || ((b - u) < tol2)) {
		if (x <= m) {
			d = tol1;
		} else {
			d = -tol1;
		}
	} 
} else {
	if (x < m) {
		e = b - x;
	} else {
		e = a - x;
	}
	d = (org.apache.commons.math3.optimization.univariate.BrentOptimizer.GOLDEN_SECTION) * e;
}

```


Execution Time: 0:44 (hh:mm) 

Nb of EvoSuite Tests: 13

Nb of Failing EvoSuite Tests: 1


--- 
#Seed: 7

## Patch 2 #  jGenProg+MinImpact With Seed 7

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.univariate.BrentOptimizer : 244

Patch type: InsertBeforeOp

```Java

if (((p > (q * (a - x))) && (p < (q * (b - x)))) && ((org.apache.commons.math3.util.FastMath.abs(p)) < (org.apache.commons.math3.util.FastMath.abs(((0.5 * q) * r))))) {
	d = p / q;
	u = x + d;
	if (((u - a) < tol2) || ((b - u) < tol2)) {
		if (x <= m) {
			d = tol1;
		} else {
			d = -tol1;
		}
	} 
} else {
	if (x < m) {
		e = b - x;
	} else {
		e = a - x;
	}
	d = (org.apache.commons.math3.optimization.univariate.BrentOptimizer.GOLDEN_SECTION) * e;
}

```


Execution Time: 1:33 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 8

## Patch 3 #  jGenProg+MinImpact With Seed 8

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.univariate.BrentOptimizer : 245

Patch type: InsertBeforeOp

```Java

if (((p > (q * (a - x))) && (p < (q * (b - x)))) && ((org.apache.commons.math3.util.FastMath.abs(p)) < (org.apache.commons.math3.util.FastMath.abs(((0.5 * q) * r))))) {
	d = p / q;
	u = x + d;
	if (((u - a) < tol2) || ((b - u) < tol2)) {
		if (x <= m) {
			d = tol1;
		} else {
			d = -tol1;
		}
	} 
} else {
	if (x < m) {
		e = b - x;
	} else {
		e = a - x;
	}
	d = (org.apache.commons.math3.optimization.univariate.BrentOptimizer.GOLDEN_SECTION) * e;
}

```


Execution Time: 1:01 (hh:mm) 

Nb of EvoSuite Tests: 12

Nb of Failing EvoSuite Tests: 0


--- 
#Seed: 17

## Patch 4 #  jGenProg+MinImpact With Seed 17

jGenProg+MinImpact returns this patch in the first place

org.apache.commons.math3.optimization.univariate.BrentOptimizer : 245

Patch type: InsertBeforeOp

```Java

if (((p > (q * (a - x))) && (p < (q * (b - x)))) && ((org.apache.commons.math3.util.FastMath.abs(p)) < (org.apache.commons.math3.util.FastMath.abs(((0.5 * q) * r))))) {
	d = p / q;
	u = x + d;
	if (((u - a) < tol2) || ((b - u) < tol2)) {
		if (x <= m) {
			d = tol1;
		} else {
			d = -tol1;
		}
	} 
} else {
	if (x < m) {
		e = b - x;
	} else {
		e = a - x;
	}
	d = (org.apache.commons.math3.optimization.univariate.BrentOptimizer.GOLDEN_SECTION) * e;
}

```


Execution Time: 1:20 (hh:mm) 

Nb of EvoSuite Tests: 14

Nb of Failing EvoSuite Tests: 0


---
## Summary an Analysis

Average Nb of EvoSuite Tests: 12.75

Average Nb of Failing EvoSuite Tests: 0.25

Average Nb of Test-adequate patches: 1

---