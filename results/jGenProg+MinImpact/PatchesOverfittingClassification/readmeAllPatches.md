# Overfitting Classification of All Patches

|Bug Id| Patch Id | A-Overfitting NrTC (NrSeeds)|B-Overfitting NrTC(NrSeeds)|Both Overfitting|
| ----- | ----- | ----- | ----- | ----- |
|Math2|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math2|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math28|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math28|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math40|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math40|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math40|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math49|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math49|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math49|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math49|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math49|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math49|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math49|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math49|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math49|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math49|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math49|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math5|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math5|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math5|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math5|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math5|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math50|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math50|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math50|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math50|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math50|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math50|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math50|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math50|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math50|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math50|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math50|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math50|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math50|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math53|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math53|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math53|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math53|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math53|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math53|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math53|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math53|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math53|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math53|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math53|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math53|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math53|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math53|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math53|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math53|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math53|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math70|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math70|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math70|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math70|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math70|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math70|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math70|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math70|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math70|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math70|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math70|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math70|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math70|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math70|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math70|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math70|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math70|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math70|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math71|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math71|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math71|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math71|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math71|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math71|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math71|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math71|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math71|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math71|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math71|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math71|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math71|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math71|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math71|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math71|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math71|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math71|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math73|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math73|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math73|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math73|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math73|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math73|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math73|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math73|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math73|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math73|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math73|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math73|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math73|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math73|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math73|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math73|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math73|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math73|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math78|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math78|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math78|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math78|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math78|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math78|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math78|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math78|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math78|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math78|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math78|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math78|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math78|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math78|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math78|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math78|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math78|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math78|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math8|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math8|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math8|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math8|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math8|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math8|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math8|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math8|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math8|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math8|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math8|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math8|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math8|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math8|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math8|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math8|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math8|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math8|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math8|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math8|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math8|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math8|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math80|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math80|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math80|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math80|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math80|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math80|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math80|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math80|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Math80|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math80|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math80|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math80|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math80|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math80|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math80|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math80|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math80|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math80|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math80|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math80|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math80|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math80|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math80|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math81|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math81|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math81|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math81|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math81|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math81|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math81|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math81|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math81|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math81|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math81|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math81|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math81|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math81|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math81|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Math81|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math82|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math82|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math82|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math82|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math82|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math82|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math82|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math82|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math82|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math82|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math82|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math82|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math82|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math82|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math82|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math82|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Math82|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math84|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math84|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math84|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math84|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math84|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math84|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math84|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math84|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math84|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math84|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math84|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math84|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math84|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math84|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math84|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math84|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Math84|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math85|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math85|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math85|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math85|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math85|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math85|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math85|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math85|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Math85|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math85|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math85|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math85|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math85|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math85|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math85|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math85|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Math85|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Math85|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math95|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math95|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Math95|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math95|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Math95|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Math95|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math95|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math95|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Math95|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Math95|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Math95|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Math95|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Math95|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Math95|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Math95|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Math95|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Math95|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Math95|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Math95|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart1|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Chart1|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart1|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Chart1|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart1|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart1|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart1|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart1|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Chart1|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart1|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart1|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart1|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Chart1|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart1|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart1|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart1|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Chart1|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Chart1|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart1|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart13|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Chart13|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart13|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Chart13|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart13|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart13|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart13|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart13|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Chart13|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart13|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart13|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart13|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Chart13|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart13|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart13|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart13|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Chart13|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Chart13|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart13|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_308_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_297_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart13|```org.jfree.chart.block.AbstractBlock_476_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart13|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_h[2] = ((constraint.getHeight()..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_443_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.AbstractBlock_475_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.AbstractBlock_492_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_427_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_w[0] = constraint.getWidth()_Re..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_444_remove_RemoveOp```|-|1 (2)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_w[1] = w[0]_ReplaceOp```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_322_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_h[4] = h[2]_ReplaceOp```|-|1 (2)|False|
|Chart13|```org.jfree.chart.block.AbstractBlock_474_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_453_remove_RemoveOp```|-|1 (2)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_323_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.AbstractBlock_477_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_312_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_remove_RemoveOp```|-|1 (2)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_h[3] = h[2]_ReplaceOp```|-|1 (1)|False|
|Chart13|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart15|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart15|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Chart15|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart15|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Chart15|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart15|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart15|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart15|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart15|```org.jfree.chart.plot.PiePlot3D_268_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart15|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart15|```org.jfree.chart.plot.PiePlot3D_266_if (org.jfree.data.general.DatasetUtilit..```|3 (2)|-|False|
|Chart15|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|-|False|
|Chart15|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart15|```org.jfree.chart.plot.PiePlot3D_246_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart15|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart15|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart15|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart15|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart15|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Chart15|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart15|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart15|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart15|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Chart15|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart15|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart15|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart15|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Chart15|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Chart15|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart15|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_308_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_297_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart15|```org.jfree.chart.block.AbstractBlock_476_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart15|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_h[2] = ((constraint.getHeight()..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_443_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.AbstractBlock_475_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.AbstractBlock_492_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_427_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_w[0] = constraint.getWidth()_Re..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_444_remove_RemoveOp```|-|1 (2)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_w[1] = w[0]_ReplaceOp```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_322_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_h[4] = h[2]_ReplaceOp```|-|1 (2)|False|
|Chart15|```org.jfree.chart.block.AbstractBlock_474_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_453_remove_RemoveOp```|-|1 (2)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_323_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.AbstractBlock_477_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_312_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_remove_RemoveOp```|-|1 (2)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_h[3] = h[2]_ReplaceOp```|-|1 (1)|False|
|Chart15|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart15|```org.jfree.chart.JFreeChart_1207_return _InsertAfterOp```|-|2 (1)|False|
|Chart15|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_g2.clip(chartArea)_ReplaceOp```|-|2 (1)|False|
|Chart15|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart15|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.c..```|-|2 (1)|False|
|Chart15|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart15|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart25|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart25|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Chart25|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart25|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Chart25|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart25|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart25|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart25|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart25|```org.jfree.chart.plot.PiePlot3D_268_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart25|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart25|```org.jfree.chart.plot.PiePlot3D_266_if (org.jfree.data.general.DatasetUtilit..```|3 (2)|-|False|
|Chart25|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|-|False|
|Chart25|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart25|```org.jfree.chart.plot.PiePlot3D_246_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart25|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart25|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart25|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart25|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart25|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Chart25|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart25|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart25|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart25|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Chart25|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart25|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart25|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart25|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Chart25|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Chart25|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart25|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_308_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_297_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart25|```org.jfree.chart.block.AbstractBlock_476_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart25|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_h[2] = ((constraint.getHeight()..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_443_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.AbstractBlock_475_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.AbstractBlock_492_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_427_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_w[0] = constraint.getWidth()_Re..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_444_remove_RemoveOp```|-|1 (2)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_w[1] = w[0]_ReplaceOp```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_322_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_h[4] = h[2]_ReplaceOp```|-|1 (2)|False|
|Chart25|```org.jfree.chart.block.AbstractBlock_474_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_453_remove_RemoveOp```|-|1 (2)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_323_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.AbstractBlock_477_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_312_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_remove_RemoveOp```|-|1 (2)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_h[3] = h[2]_ReplaceOp```|-|1 (1)|False|
|Chart25|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.JFreeChart_1207_return _InsertAfterOp```|-|2 (1)|False|
|Chart25|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_g2.clip(chartArea)_ReplaceOp```|-|2 (1)|False|
|Chart25|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart25|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.c..```|-|2 (1)|False|
|Chart25|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart25|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart25|```org.jfree.data.KeyedObjects2D_239_org.jfree.data.KeyedObjects2D.this.column..```|-|10 (1)|False|
|Chart25|```org.jfree.chart.plot.CategoryPlot_2867_remove_RemoveOp```|-|1 (1)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_95_return 1_ReplaceOp```|-|4.5 (2)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_113_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|3.5 (2)|False|
|Chart25|```org.jfree.chart.plot.CategoryPlot_2960_org.jfree.chart.plot.CategoryPlot.th..```|-|1 (1)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_110_remove_RemoveOp```|-|4 (2)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_86_return -1_ReplaceOp```|-|7 (1)|False|
|Chart25|```org.jfree.data.general.DatasetUtilities_577_remove_RemoveOp```|-|1 (5)|False|
|Chart25|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if ((org.jfree..```|-|2 (1)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_113_remove_RemoveOp```|-|4 (7)|False|
|Chart25|```org.jfree.data.general.DatasetUtilities_575_remove_RemoveOp```|-|1 (3)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_remove_Remo..```|-|10 (8)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_238_remove_RemoveOp```|-|10 (8)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return -1_R..```|-|2 (1)|False|
|Chart25|```org.jfree.data.general.DatasetUtilities_574_remove_RemoveOp```|-|1 (7)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_remove_Remo..```|-|3.5 (4)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_return null..```|-|3.5 (2)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_239_remove_RemoveOp```|-|10 (6)|False|
|Chart25|```org.jfree.chart.plot.CategoryPlot_2855_remove_RemoveOp```|-|1 (1)|False|
|Chart25|```org.jfree.data.statistics.MeanAndStandardDeviation_95_return null_ReplaceOp```|-|2.5 (2)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_318_org.jfree.d..```|-|10 (1)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_126_return null..```|-|4 (2)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_112_remove_RemoveOp```|-|4 (4)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_112_if (columnKey == null) { 	throw new java...```|-|6 (1)|False|
|Chart25|```org.jfree.chart.JFreeChart_1393_remove_RemoveOp```|-|6 (5)|False|
|Chart25|```org.jfree.data.general.DatasetUtilities_576_remove_RemoveOp```|-|1 (9)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|10 (1)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_113_return null..```|-|10 (1)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return 0_Re..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.plot.CategoryPlot_1756_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_236_org.jfree.data.KeyedObjects2D.this.rows.a..```|-|2 (1)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_236_remove_RemoveOp```|-|10 (4)|False|
|Chart25|```org.jfree.chart.plot.CategoryPlot_2000_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Chart25|```org.jfree.chart.plot.CategoryPlot_2672_remove_RemoveOp```|-|2 (1)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (1)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_110_remove_Remo..```|-|4 (8)|False|
|Chart25|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_remove_RemoveO..```|-|2 (4)|False|
|Chart25|```org.jfree.data.KeyedObjects2D_111_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|1 (1)|False|
|Chart25|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (plot == nu..```|-|2.5 (2)|False|
|Chart25|```org.jfree.data.general.DatasetUtilities_576_if ((rowCount == 0) || (columnC..```|-|1 (3)|False|
|Chart25|```org.jfree.chart.JFreeChart_1393_notifyListeners(new org.jfree.chart.event.C..```|-|5 (1)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_325_org.jfree.d..```|-|10 (1)|False|
|Chart25|```org.jfree.data.general.DatasetUtilities_577_return true_ReplaceOp```|-|1 (1)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (2)|False|
|Chart25|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_fireDataset..```|-|10 (2)|False|
|Chart25|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (!(data ins..```|-|1 (2)|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart3|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart3|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Chart3|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart3|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Chart3|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart3|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart3|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart3|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart3|```org.jfree.chart.plot.PiePlot3D_268_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart3|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart3|```org.jfree.chart.plot.PiePlot3D_266_if (org.jfree.data.general.DatasetUtilit..```|3 (2)|-|False|
|Chart3|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|-|False|
|Chart3|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart3|```org.jfree.chart.plot.PiePlot3D_246_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart3|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart3|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart3|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart3|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart3|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Chart3|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart3|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart3|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart3|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Chart3|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart3|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart3|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart3|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Chart3|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Chart3|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart3|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_308_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_297_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart3|```org.jfree.chart.block.AbstractBlock_476_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart3|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_h[2] = ((constraint.getHeight()..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_443_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.AbstractBlock_475_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.AbstractBlock_492_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_427_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_w[0] = constraint.getWidth()_Re..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_444_remove_RemoveOp```|-|1 (2)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_w[1] = w[0]_ReplaceOp```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_322_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_h[4] = h[2]_ReplaceOp```|-|1 (2)|False|
|Chart3|```org.jfree.chart.block.AbstractBlock_474_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_453_remove_RemoveOp```|-|1 (2)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_323_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.AbstractBlock_477_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_312_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_remove_RemoveOp```|-|1 (2)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_h[3] = h[2]_ReplaceOp```|-|1 (1)|False|
|Chart3|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.JFreeChart_1207_return _InsertAfterOp```|-|2 (1)|False|
|Chart3|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_g2.clip(chartArea)_ReplaceOp```|-|2 (1)|False|
|Chart3|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart3|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.c..```|-|2 (1)|False|
|Chart3|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart3|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart3|```org.jfree.data.KeyedObjects2D_239_org.jfree.data.KeyedObjects2D.this.column..```|-|10 (1)|False|
|Chart3|```org.jfree.chart.plot.CategoryPlot_2867_remove_RemoveOp```|-|1 (1)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_95_return 1_ReplaceOp```|-|4.5 (2)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_113_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|3.5 (2)|False|
|Chart3|```org.jfree.chart.plot.CategoryPlot_2960_org.jfree.chart.plot.CategoryPlot.th..```|-|1 (1)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_110_remove_RemoveOp```|-|4 (2)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_86_return -1_ReplaceOp```|-|7 (1)|False|
|Chart3|```org.jfree.data.general.DatasetUtilities_577_remove_RemoveOp```|-|1 (5)|False|
|Chart3|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if ((org.jfree..```|-|2 (1)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_113_remove_RemoveOp```|-|4 (7)|False|
|Chart3|```org.jfree.data.general.DatasetUtilities_575_remove_RemoveOp```|-|1 (3)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_remove_Remo..```|-|10 (8)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_238_remove_RemoveOp```|-|10 (8)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return -1_R..```|-|2 (1)|False|
|Chart3|```org.jfree.data.general.DatasetUtilities_574_remove_RemoveOp```|-|1 (7)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_remove_Remo..```|-|3.5 (4)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_return null..```|-|3.5 (2)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_239_remove_RemoveOp```|-|10 (6)|False|
|Chart3|```org.jfree.chart.plot.CategoryPlot_2855_remove_RemoveOp```|-|1 (1)|False|
|Chart3|```org.jfree.data.statistics.MeanAndStandardDeviation_95_return null_ReplaceOp```|-|2.5 (2)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_318_org.jfree.d..```|-|10 (1)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_126_return null..```|-|4 (2)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_112_remove_RemoveOp```|-|4 (4)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_112_if (columnKey == null) { 	throw new java...```|-|6 (1)|False|
|Chart3|```org.jfree.chart.JFreeChart_1393_remove_RemoveOp```|-|6 (5)|False|
|Chart3|```org.jfree.data.general.DatasetUtilities_576_remove_RemoveOp```|-|1 (9)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|10 (1)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_113_return null..```|-|10 (1)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return 0_Re..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.plot.CategoryPlot_1756_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_236_org.jfree.data.KeyedObjects2D.this.rows.a..```|-|2 (1)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_236_remove_RemoveOp```|-|10 (4)|False|
|Chart3|```org.jfree.chart.plot.CategoryPlot_2000_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Chart3|```org.jfree.chart.plot.CategoryPlot_2672_remove_RemoveOp```|-|2 (1)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (1)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_110_remove_Remo..```|-|4 (8)|False|
|Chart3|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_remove_RemoveO..```|-|2 (4)|False|
|Chart3|```org.jfree.data.KeyedObjects2D_111_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|1 (1)|False|
|Chart3|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (plot == nu..```|-|2.5 (2)|False|
|Chart3|```org.jfree.data.general.DatasetUtilities_576_if ((rowCount == 0) || (columnC..```|-|1 (3)|False|
|Chart3|```org.jfree.chart.JFreeChart_1393_notifyListeners(new org.jfree.chart.event.C..```|-|5 (1)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_325_org.jfree.d..```|-|10 (1)|False|
|Chart3|```org.jfree.data.general.DatasetUtilities_577_return true_ReplaceOp```|-|1 (1)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (2)|False|
|Chart3|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_fireDataset..```|-|10 (2)|False|
|Chart3|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (!(data ins..```|-|1 (2)|False|
|Chart3|```org.jfree.data.time.TimeSeries_254_findBoundsByIteration()_InsertBeforeOp```|-|1 (1)|False|
|Chart3|```org.jfree.data.time.TimeSeries_576_updateBoundsForRemovedItem(item)_InsertB..```|-|2 (2)|False|
|Chart3|```org.jfree.data.time.TimeSeries_564_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (3)|False|
|Chart3|```org.jfree.data.time.TimeSeries_581_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart5|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart5|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Chart5|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart5|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Chart5|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart5|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart5|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart5|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart5|```org.jfree.chart.plot.PiePlot3D_268_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart5|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart5|```org.jfree.chart.plot.PiePlot3D_266_if (org.jfree.data.general.DatasetUtilit..```|3 (2)|-|False|
|Chart5|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|-|False|
|Chart5|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart5|```org.jfree.chart.plot.PiePlot3D_246_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart5|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart5|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart5|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart5|```org.jfree.data.xy.XYSeries_564_org.jfree.data.xy.XYSeries.this.data.add(new..```|2 (22)|1 (3)|True|
|Chart5|```org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp```|2 (22)|2 (1)|True|
|Chart5|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Chart5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart5|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart5|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart5|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Chart5|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart5|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart5|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart5|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Chart5|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Chart5|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart5|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_308_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_297_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart5|```org.jfree.chart.block.AbstractBlock_476_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart5|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_h[2] = ((constraint.getHeight()..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_443_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.AbstractBlock_475_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.AbstractBlock_492_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_427_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_w[0] = constraint.getWidth()_Re..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_444_remove_RemoveOp```|-|1 (2)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_w[1] = w[0]_ReplaceOp```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_322_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_h[4] = h[2]_ReplaceOp```|-|1 (2)|False|
|Chart5|```org.jfree.chart.block.AbstractBlock_474_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_453_remove_RemoveOp```|-|1 (2)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_323_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.AbstractBlock_477_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_312_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_remove_RemoveOp```|-|1 (2)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_h[3] = h[2]_ReplaceOp```|-|1 (1)|False|
|Chart5|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.JFreeChart_1207_return _InsertAfterOp```|-|2 (1)|False|
|Chart5|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_g2.clip(chartArea)_ReplaceOp```|-|2 (1)|False|
|Chart5|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart5|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.c..```|-|2 (1)|False|
|Chart5|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart5|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart5|```org.jfree.data.KeyedObjects2D_239_org.jfree.data.KeyedObjects2D.this.column..```|-|10 (1)|False|
|Chart5|```org.jfree.chart.plot.CategoryPlot_2867_remove_RemoveOp```|-|1 (1)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_95_return 1_ReplaceOp```|-|4.5 (2)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_113_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|3.5 (2)|False|
|Chart5|```org.jfree.chart.plot.CategoryPlot_2960_org.jfree.chart.plot.CategoryPlot.th..```|-|1 (1)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_110_remove_RemoveOp```|-|4 (2)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_86_return -1_ReplaceOp```|-|7 (1)|False|
|Chart5|```org.jfree.data.general.DatasetUtilities_577_remove_RemoveOp```|-|1 (5)|False|
|Chart5|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if ((org.jfree..```|-|2 (1)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_113_remove_RemoveOp```|-|4 (7)|False|
|Chart5|```org.jfree.data.general.DatasetUtilities_575_remove_RemoveOp```|-|1 (3)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_remove_Remo..```|-|10 (8)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_238_remove_RemoveOp```|-|10 (8)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return -1_R..```|-|2 (1)|False|
|Chart5|```org.jfree.data.general.DatasetUtilities_574_remove_RemoveOp```|-|1 (7)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_remove_Remo..```|-|3.5 (4)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_return null..```|-|3.5 (2)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_239_remove_RemoveOp```|-|10 (6)|False|
|Chart5|```org.jfree.chart.plot.CategoryPlot_2855_remove_RemoveOp```|-|1 (1)|False|
|Chart5|```org.jfree.data.statistics.MeanAndStandardDeviation_95_return null_ReplaceOp```|-|2.5 (2)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_318_org.jfree.d..```|-|10 (1)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_126_return null..```|-|4 (2)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_112_remove_RemoveOp```|-|4 (4)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_112_if (columnKey == null) { 	throw new java...```|-|6 (1)|False|
|Chart5|```org.jfree.chart.JFreeChart_1393_remove_RemoveOp```|-|6 (5)|False|
|Chart5|```org.jfree.data.general.DatasetUtilities_576_remove_RemoveOp```|-|1 (9)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|10 (1)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_113_return null..```|-|10 (1)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return 0_Re..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.plot.CategoryPlot_1756_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_236_org.jfree.data.KeyedObjects2D.this.rows.a..```|-|2 (1)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_236_remove_RemoveOp```|-|10 (4)|False|
|Chart5|```org.jfree.chart.plot.CategoryPlot_2000_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Chart5|```org.jfree.chart.plot.CategoryPlot_2672_remove_RemoveOp```|-|2 (1)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (1)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_110_remove_Remo..```|-|4 (8)|False|
|Chart5|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_remove_RemoveO..```|-|2 (4)|False|
|Chart5|```org.jfree.data.KeyedObjects2D_111_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|1 (1)|False|
|Chart5|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (plot == nu..```|-|2.5 (2)|False|
|Chart5|```org.jfree.data.general.DatasetUtilities_576_if ((rowCount == 0) || (columnC..```|-|1 (3)|False|
|Chart5|```org.jfree.chart.JFreeChart_1393_notifyListeners(new org.jfree.chart.event.C..```|-|5 (1)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_325_org.jfree.d..```|-|10 (1)|False|
|Chart5|```org.jfree.data.general.DatasetUtilities_577_return true_ReplaceOp```|-|1 (1)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (2)|False|
|Chart5|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_fireDataset..```|-|10 (2)|False|
|Chart5|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (!(data ins..```|-|1 (2)|False|
|Chart5|```org.jfree.data.time.TimeSeries_254_findBoundsByIteration()_InsertBeforeOp```|-|1 (1)|False|
|Chart5|```org.jfree.data.time.TimeSeries_576_updateBoundsForRemovedItem(item)_InsertB..```|-|2 (2)|False|
|Chart5|```org.jfree.data.time.TimeSeries_564_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (3)|False|
|Chart5|```org.jfree.data.time.TimeSeries_581_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (1)|False|
|Chart5|```org.jfree.data.xy.XYSeries_564_org.jfree.data.xy.XYSeries.this.data.add(new..```|2 (22)|1 (3)|True|
|Chart5|```org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp```|2 (22)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart7|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart7|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Chart7|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart7|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Chart7|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart7|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart7|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart7|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart7|```org.jfree.chart.plot.PiePlot3D_268_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart7|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart7|```org.jfree.chart.plot.PiePlot3D_266_if (org.jfree.data.general.DatasetUtilit..```|3 (2)|-|False|
|Chart7|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|-|False|
|Chart7|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart7|```org.jfree.chart.plot.PiePlot3D_246_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Chart7|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart7|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart7|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart7|```org.jfree.data.xy.XYSeries_564_org.jfree.data.xy.XYSeries.this.data.add(new..```|2 (22)|1 (3)|True|
|Chart7|```org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp```|2 (22)|2 (1)|True|
|Chart7|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (2)|True|
|Chart7|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Chart7|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Chart7|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Chart7|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Chart7|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Chart7|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Chart7|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Chart7|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Chart7|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Chart7|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Chart7|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Chart7|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Chart7|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_308_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_297_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart7|```org.jfree.chart.block.AbstractBlock_476_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart7|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_h[2] = ((constraint.getHeight()..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_443_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.AbstractBlock_475_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.AbstractBlock_492_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_427_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_w[0] = constraint.getWidth()_Re..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_444_remove_RemoveOp```|-|1 (2)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_w[1] = w[0]_ReplaceOp```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_322_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_h[4] = h[2]_ReplaceOp```|-|1 (2)|False|
|Chart7|```org.jfree.chart.block.AbstractBlock_474_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_453_remove_RemoveOp```|-|1 (2)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_323_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.AbstractBlock_477_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_312_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_remove_RemoveOp```|-|1 (2)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_h[3] = h[2]_ReplaceOp```|-|1 (1)|False|
|Chart7|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.JFreeChart_1207_return _InsertAfterOp```|-|2 (1)|False|
|Chart7|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_g2.clip(chartArea)_ReplaceOp```|-|2 (1)|False|
|Chart7|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Chart7|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.c..```|-|2 (1)|False|
|Chart7|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Chart7|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Chart7|```org.jfree.data.KeyedObjects2D_239_org.jfree.data.KeyedObjects2D.this.column..```|-|10 (1)|False|
|Chart7|```org.jfree.chart.plot.CategoryPlot_2867_remove_RemoveOp```|-|1 (1)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_95_return 1_ReplaceOp```|-|4.5 (2)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_113_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|3.5 (2)|False|
|Chart7|```org.jfree.chart.plot.CategoryPlot_2960_org.jfree.chart.plot.CategoryPlot.th..```|-|1 (1)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_110_remove_RemoveOp```|-|4 (2)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_86_return -1_ReplaceOp```|-|7 (1)|False|
|Chart7|```org.jfree.data.general.DatasetUtilities_577_remove_RemoveOp```|-|1 (5)|False|
|Chart7|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if ((org.jfree..```|-|2 (1)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_113_remove_RemoveOp```|-|4 (7)|False|
|Chart7|```org.jfree.data.general.DatasetUtilities_575_remove_RemoveOp```|-|1 (3)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_remove_Remo..```|-|10 (8)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_238_remove_RemoveOp```|-|10 (8)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return -1_R..```|-|2 (1)|False|
|Chart7|```org.jfree.data.general.DatasetUtilities_574_remove_RemoveOp```|-|1 (7)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_remove_Remo..```|-|3.5 (4)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_return null..```|-|3.5 (2)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_239_remove_RemoveOp```|-|10 (6)|False|
|Chart7|```org.jfree.chart.plot.CategoryPlot_2855_remove_RemoveOp```|-|1 (1)|False|
|Chart7|```org.jfree.data.statistics.MeanAndStandardDeviation_95_return null_ReplaceOp```|-|2.5 (2)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_318_org.jfree.d..```|-|10 (1)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_126_return null..```|-|4 (2)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_112_remove_RemoveOp```|-|4 (4)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_112_if (columnKey == null) { 	throw new java...```|-|6 (1)|False|
|Chart7|```org.jfree.chart.JFreeChart_1393_remove_RemoveOp```|-|6 (5)|False|
|Chart7|```org.jfree.data.general.DatasetUtilities_576_remove_RemoveOp```|-|1 (9)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|10 (1)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_113_return null..```|-|10 (1)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return 0_Re..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.plot.CategoryPlot_1756_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_236_org.jfree.data.KeyedObjects2D.this.rows.a..```|-|2 (1)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_236_remove_RemoveOp```|-|10 (4)|False|
|Chart7|```org.jfree.chart.plot.CategoryPlot_2000_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Chart7|```org.jfree.chart.plot.CategoryPlot_2672_remove_RemoveOp```|-|2 (1)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (1)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_110_remove_Remo..```|-|4 (8)|False|
|Chart7|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_remove_RemoveO..```|-|2 (4)|False|
|Chart7|```org.jfree.data.KeyedObjects2D_111_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|1 (1)|False|
|Chart7|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (plot == nu..```|-|2.5 (2)|False|
|Chart7|```org.jfree.data.general.DatasetUtilities_576_if ((rowCount == 0) || (columnC..```|-|1 (3)|False|
|Chart7|```org.jfree.chart.JFreeChart_1393_notifyListeners(new org.jfree.chart.event.C..```|-|5 (1)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_325_org.jfree.d..```|-|10 (1)|False|
|Chart7|```org.jfree.data.general.DatasetUtilities_577_return true_ReplaceOp```|-|1 (1)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (2)|False|
|Chart7|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_fireDataset..```|-|10 (2)|False|
|Chart7|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (!(data ins..```|-|1 (2)|False|
|Chart7|```org.jfree.data.time.TimeSeries_254_findBoundsByIteration()_InsertBeforeOp```|-|1 (1)|False|
|Chart7|```org.jfree.data.time.TimeSeries_576_updateBoundsForRemovedItem(item)_InsertB..```|-|2 (2)|False|
|Chart7|```org.jfree.data.time.TimeSeries_564_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (3)|False|
|Chart7|```org.jfree.data.time.TimeSeries_581_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (1)|False|
|Chart7|```org.jfree.data.xy.XYSeries_564_org.jfree.data.xy.XYSeries.this.data.add(new..```|2 (22)|1 (3)|True|
|Chart7|```org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp```|2 (22)|2 (1)|True|
|Chart7|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (2)|True|
|Chart7|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Time11|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Time11|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Time11|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Time11|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Time11|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Time11|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Time11|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Time11|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Time11|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Time11|```org.jfree.chart.plot.PiePlot3D_268_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Time11|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Time11|```org.jfree.chart.plot.PiePlot3D_266_if (org.jfree.data.general.DatasetUtilit..```|3 (2)|-|False|
|Time11|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|-|False|
|Time11|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Time11|```org.jfree.chart.plot.PiePlot3D_246_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Time11|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Time11|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Time11|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Time11|```org.jfree.data.xy.XYSeries_564_org.jfree.data.xy.XYSeries.this.data.add(new..```|2 (22)|1 (3)|True|
|Time11|```org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp```|2 (22)|2 (1)|True|
|Time11|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (2)|True|
|Time11|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Time11|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Time11|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Time11|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Time11|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Time11|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Time11|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Time11|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Time11|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Time11|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Time11|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Time11|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Time11|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Time11|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Time11|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_308_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_297_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Time11|```org.jfree.chart.block.AbstractBlock_476_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Time11|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_h[2] = ((constraint.getHeight()..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_443_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.AbstractBlock_475_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.AbstractBlock_492_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_427_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_w[0] = constraint.getWidth()_Re..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_444_remove_RemoveOp```|-|1 (2)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_w[1] = w[0]_ReplaceOp```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_322_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_h[4] = h[2]_ReplaceOp```|-|1 (2)|False|
|Time11|```org.jfree.chart.block.AbstractBlock_474_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_453_remove_RemoveOp```|-|1 (2)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_323_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.AbstractBlock_477_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_312_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_remove_RemoveOp```|-|1 (2)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_h[3] = h[2]_ReplaceOp```|-|1 (1)|False|
|Time11|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time11|```org.jfree.chart.JFreeChart_1207_return _InsertAfterOp```|-|2 (1)|False|
|Time11|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_g2.clip(chartArea)_ReplaceOp```|-|2 (1)|False|
|Time11|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Time11|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.c..```|-|2 (1)|False|
|Time11|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Time11|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Time11|```org.jfree.data.KeyedObjects2D_239_org.jfree.data.KeyedObjects2D.this.column..```|-|10 (1)|False|
|Time11|```org.jfree.chart.plot.CategoryPlot_2867_remove_RemoveOp```|-|1 (1)|False|
|Time11|```org.jfree.data.KeyedObjects2D_95_return 1_ReplaceOp```|-|4.5 (2)|False|
|Time11|```org.jfree.data.KeyedObjects2D_113_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|3.5 (2)|False|
|Time11|```org.jfree.chart.plot.CategoryPlot_2960_org.jfree.chart.plot.CategoryPlot.th..```|-|1 (1)|False|
|Time11|```org.jfree.data.KeyedObjects2D_110_remove_RemoveOp```|-|4 (2)|False|
|Time11|```org.jfree.data.KeyedObjects2D_86_return -1_ReplaceOp```|-|7 (1)|False|
|Time11|```org.jfree.data.general.DatasetUtilities_577_remove_RemoveOp```|-|1 (5)|False|
|Time11|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if ((org.jfree..```|-|2 (1)|False|
|Time11|```org.jfree.data.KeyedObjects2D_113_remove_RemoveOp```|-|4 (7)|False|
|Time11|```org.jfree.data.general.DatasetUtilities_575_remove_RemoveOp```|-|1 (3)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_remove_Remo..```|-|10 (8)|False|
|Time11|```org.jfree.data.KeyedObjects2D_238_remove_RemoveOp```|-|10 (8)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return -1_R..```|-|2 (1)|False|
|Time11|```org.jfree.data.general.DatasetUtilities_574_remove_RemoveOp```|-|1 (7)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_remove_Remo..```|-|3.5 (4)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_return null..```|-|3.5 (2)|False|
|Time11|```org.jfree.data.KeyedObjects2D_239_remove_RemoveOp```|-|10 (6)|False|
|Time11|```org.jfree.chart.plot.CategoryPlot_2855_remove_RemoveOp```|-|1 (1)|False|
|Time11|```org.jfree.data.statistics.MeanAndStandardDeviation_95_return null_ReplaceOp```|-|2.5 (2)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_318_org.jfree.d..```|-|10 (1)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_126_return null..```|-|4 (2)|False|
|Time11|```org.jfree.data.KeyedObjects2D_112_remove_RemoveOp```|-|4 (4)|False|
|Time11|```org.jfree.data.KeyedObjects2D_112_if (columnKey == null) { 	throw new java...```|-|6 (1)|False|
|Time11|```org.jfree.chart.JFreeChart_1393_remove_RemoveOp```|-|6 (5)|False|
|Time11|```org.jfree.data.general.DatasetUtilities_576_remove_RemoveOp```|-|1 (9)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|10 (1)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_113_return null..```|-|10 (1)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return 0_Re..```|-|1 (1)|False|
|Time11|```org.jfree.chart.plot.CategoryPlot_1756_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Time11|```org.jfree.data.KeyedObjects2D_236_org.jfree.data.KeyedObjects2D.this.rows.a..```|-|2 (1)|False|
|Time11|```org.jfree.data.KeyedObjects2D_236_remove_RemoveOp```|-|10 (4)|False|
|Time11|```org.jfree.chart.plot.CategoryPlot_2000_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Time11|```org.jfree.chart.plot.CategoryPlot_2672_remove_RemoveOp```|-|2 (1)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (1)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_110_remove_Remo..```|-|4 (8)|False|
|Time11|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_remove_RemoveO..```|-|2 (4)|False|
|Time11|```org.jfree.data.KeyedObjects2D_111_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|1 (1)|False|
|Time11|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (plot == nu..```|-|2.5 (2)|False|
|Time11|```org.jfree.data.general.DatasetUtilities_576_if ((rowCount == 0) || (columnC..```|-|1 (3)|False|
|Time11|```org.jfree.chart.JFreeChart_1393_notifyListeners(new org.jfree.chart.event.C..```|-|5 (1)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_325_org.jfree.d..```|-|10 (1)|False|
|Time11|```org.jfree.data.general.DatasetUtilities_577_return true_ReplaceOp```|-|1 (1)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (2)|False|
|Time11|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_fireDataset..```|-|10 (2)|False|
|Time11|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (!(data ins..```|-|1 (2)|False|
|Time11|```org.jfree.data.time.TimeSeries_254_findBoundsByIteration()_InsertBeforeOp```|-|1 (1)|False|
|Time11|```org.jfree.data.time.TimeSeries_576_updateBoundsForRemovedItem(item)_InsertB..```|-|2 (2)|False|
|Time11|```org.jfree.data.time.TimeSeries_564_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (3)|False|
|Time11|```org.jfree.data.time.TimeSeries_581_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (1)|False|
|Time11|```org.jfree.data.xy.XYSeries_564_org.jfree.data.xy.XYSeries.this.data.add(new..```|2 (22)|1 (3)|True|
|Time11|```org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp```|2 (22)|2 (1)|True|
|Time11|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (2)|True|
|Time11|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (1)|True|
|Time11|```org.joda.time.tz.ZoneInfoCompiler_78_return true_ReplaceOp```|-|1.5 (4)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_320_org.joda.time.tz.ZoneInfoCompiler...```|-|6 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1458_if (size == 0) { 	throw new java...```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_371_remove_RemoveOp```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1458_if ((org.joda.time.tz.ZoneInfoCom..```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_372_remove_RemoveOp```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_371_if (tailZone != null) { 	return ta..```|-|1 (1)|False|
|Time11|```org.joda.time.tz.ZoneInfoCompiler_78_return false_ReplaceOp```|-|2 (2)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1144_if (id == null) { 	return null; }..```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_428_org.joda.time.tz.ZoneInfoCompiler...```|-|2 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1426_org.joda.time.tz.ZoneInfoCompiler..```|-|2 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1434_org.joda.time.tz.ZoneInfoCompiler..```|-|2 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1043_org.joda.time.tz.ZoneInfoCompiler..```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_846_org.joda.time.tz.ZoneInfoCompiler...```|-|2 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1460_remove_RemoveOp```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1460_if ((org.joda.time.tz.ZoneInfoCom..```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1457_remove_RemoveOp```|-|1 (1)|False|
|Time11|```org.joda.time.tz.DateTimeZoneBuilder_1417_org.joda.time.tz.ZoneInfoCompiler..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_235_..```|2 (1)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_299_..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_327_..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_205_..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_269_..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_329_..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Time4|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Time4|```org.apache.commons.math3.complex.Complex_305_return org.apache.commons.math..```|1 (21)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Repla..```|1 (16)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_return doSolv..```|1 (5)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_x1 = x_Replac..```|1 (17)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = computeO..```|1 (16)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f1 = fx_Repla..```|1 (17)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_remove_Remove..```|1 (17)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_189_f0 = f1_Inser..```|1.5 (4)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_f0 = f1_Repla..```|1 (17)|-|False|
|Time4|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Time4|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (19)|-|False|
|Time4|```org.apache.commons.math.complex.Complex_153_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (21)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|-|False|
|Time4|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Time4|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Time4|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -9_Repla..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = -(dMin)_Re..```|2 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((dMin1) > 0...```|2 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = java.lang..```|3 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_qMax = java.lang..```|5 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_remove_RemoveOp```|2 (15)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1135_for (int i = 0 ;..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1217_pingPong = 1 - (..```|2 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_org.apache.commo..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3.5 (2)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_840_remove_RemoveOp```|2 (5)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1137_remove_RemoveOp```|2 (19)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin1 = dMin_Rep..```|2 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedVt = null_..```|2 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -7_Repla..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_squaredSecondary..```|3 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_remove_RemoveOp```|3 (4)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1262_flipIfWarranted(..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedV = org.ap..```|3 (2)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|2 (11)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.25 * (dM..```|3 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1133_if ((tType) == (..```|6 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1136_for (int i = 0 ;..```|3 (9)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dN2 = 0_ReplaceO..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_remove_RemoveOp```|2 (18)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_dMin = dN1_Repla..```|5 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tau = 0.0_Replac..```|2 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_pingPong = 1 - (..```|3 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_cachedD = org.ap..```|2 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_tType = -5_Repla..```|3 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1139_g = 0.25_Replace..```|3 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dMin = -0.0_Repl..```|1 (1)|-|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Time4|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Time4|```org.jfree.chart.plot.PiePlot3D_268_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Time4|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Time4|```org.jfree.chart.plot.PiePlot3D_266_if (org.jfree.data.general.DatasetUtilit..```|3 (2)|-|False|
|Time4|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|-|False|
|Time4|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Time4|```org.jfree.chart.plot.PiePlot3D_246_if (org.jfree.data.general.DatasetUtilit..```|1 (1)|-|False|
|Time4|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Time4|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Time4|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Time4|```org.jfree.data.xy.XYSeries_564_org.jfree.data.xy.XYSeries.this.data.add(new..```|2 (22)|1 (3)|True|
|Time4|```org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp```|2 (22)|2 (1)|True|
|Time4|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (2)|True|
|Time4|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math3.distribution.HypergeometricDistribution_308_numeri..```|-|1 (1)|False|
|Time4|```org.apache.commons.math3.distribution.HypergeometricDistribution_321_numeri..```|-|1 (2)|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (5)|1.5 (6)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (3)|3 (3)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_202_..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_213_..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_200_..```|1 (1)|2 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_323_..```|2.5 (2)|1.5 (2)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|2 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_204_..```|1 (1)|2 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_246_..```|4 (1)|2 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_265_..```|1 (1)|2 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_241_..```|1 (1)|3 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_326_..```|1 (1)|3 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_260_..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver_295_..```|2 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.util.OpenIntToDoubleHashMap_397_int count = 1_Inser..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.OpenMapRealVector_667_entries.put(index, val..```|3 (8)|7 (23)|True|
|Time4|```org.apache.commons.math.util.OpenIntToDoubleHashMap_399_remove_RemoveOp```|-|1 (13)|False|
|Time4|```org.apache.commons.math.util.OpenIntToDoubleHashMap_394_int count = 1_Inser..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.util.OpenIntToDoubleHashMap_398_int count = 1_Inser..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.util.OpenIntToDoubleHashMap_396_int count = 1_Inser..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.util.OpenIntToDoubleHashMap_395_int count = 1_Inser..```|-|1.5 (2)|False|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_org.apache.co..```|1 (10)|1 (4)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BaseSecantSolver_188_inverted = !i..```|1 (16)|1 (2)|True|
|Time4|```org.apache.commons.math.complex.Complex_152_if ((isNaN) || (rhs.isNaN)) { 	..```|1 (20)|1 (26)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BisectionSolver_72_return solve(f,..```|1 (27)|2 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (29)|2 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_138_verifyBracketing(m..```|2 (28)|1 (19)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (26)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|2 (18)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, in..```|2 (29)|1 (26)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (25)|2 (24)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_138_return solve(f, mi..```|2 (29)|1 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2.5 (26)|5 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_125_verifyBracketing(m..```|2 (27)|2 (26)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_114_verifyBracketing(m..```|2 (28)|3 (27)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_132_verifyBracketing(m..```|2.5 (26)|1 (17)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_113_verifyBracketing(m..```|3 (27)|5 (28)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|2 (27)|3 (25)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_126_verifyBracketing(m..```|3 (25)|2 (17)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_107_verifyBracketing(m..```|2.5 (28)|5 (29)|True|
|Time4|```org.apache.commons.math.analysis.solvers.BrentSolver_120_verifyBracketing(m..```|2 (25)|3.5 (24)|True|
|Time4|```org.apache.commons.math3.distribution.DiscreteDistribution_189_remove_Remov..```|1 (18)|1 (10)|True|
|Time4|```org.apache.commons.math3.distribution.DiscreteDistribution_190_remove_Remov..```|1 (18)|1 (10)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_601_findEigenvalues()..```|1 (1)|3 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((dMin1) == (..```|-|7 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_np = nn - 13_Rep..```|-|5 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((tType) < (-..```|-|5 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = 0.25 * (dM..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_org.apache.commo..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -8_Repla..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1540_for (int i4 = ((..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_eigenvectors = n..```|-|5 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -2_Repla..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = dN1_Repla..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -6_Repla..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1043_dMin = dN_Insert..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 != 0.0) {..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = (work[(nn -..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_lowerSpectra = j..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dN) > b1) {..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -9_Repla..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_cachedD = org.ap..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_b2 = (work[(nn -..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_upperSpectra = j..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1689_dMin = 0.0_Inser..```|-|6 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1485_b2 = (work[(nn -..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (a2 > (b1 + b..```|-|10 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin) <= 0...```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_tType = -4_Repla..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tType = -2_Repla..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_if (a2 > (b1 + b..```|-|5 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|7 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = (gam * (1 ..```|1 (1)|4 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b1 = b2_ReplaceO..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if (((100 * (jav..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tType = 0_Replac..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_b2 = (work[(nn -..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = java.lang...```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dMin = dN_Insert..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_imagEigenvalues ..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_org.apache.commo..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = -(dMin)_Re..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_cachedVt = null_..```|-|7 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_remove_RemoveOp```|-|2.5 (8)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_if ((work[(nn - ..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1682_dMin = dN_Insert..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin = 0.0_Repla..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -8_Repla..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tType = -3_Repla..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_imagEigenvalues ..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((dMin1) > 0...```|-|2 (2)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_b2 = b2 + b1_Rep..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_a2 = cnst3 * a2_..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_if (b2 != 0.0) {..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1313_dMin = dN1_Inser..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1536_b2 = (work[(nn -..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((100 * b1) <..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = 0_Replac..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_828_initialSplits(n)_..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((dMin1) == (..```|-|2.5 (2)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_remove_RemoveOp```|2 (2)|1.5 (6)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_remove_RemoveOp```|2 (1)|2 (5)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_org.apache.commo..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_if ((work[(nn - ..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1526_remove_RemoveOp```|1 (3)|3.5 (4)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_remove_RemoveOp```|1 (3)|2 (9)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_dMin2 = dMin_Rep..```|1 (1)|7 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1003_dN2 = 0_InsertAf..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_tau = ((tau) + (..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_s = java.lang.Ma..```|-|10 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_s = (gam * (1 - ..```|1 (1)|1 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_tau = (gam * (1 ..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (((work[(np -..```|-|1 (2)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_tau = java.lang...```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1484_dMin = java.lang..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1052_work[(((4 * defl..```|3 (1)|6 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_np = nn - 9_Repl..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if (b2 == 0.0) {..```|-|4.5 (2)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_remove_RemoveOp```|1 (1)|2 (7)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1521_cachedD = null_R..```|-|2 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1520_remove_RemoveOp```|-|4 (7)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_org.apache.commo..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25 * 0.333..```|-|4 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1543_if ((cachedD) ==..```|2 (1)|3 (1)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1544_dN = 0_ReplaceOp```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_g = 0.25_Replace..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_squaredSecondary..```|-|3 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_dMin2 = dMin_Rep..```|2 (1)|7 (2)|True|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1438_dMin = dN_Insert..```|-|1 (1)|False|
|Time4|```org.apache.commons.math.linear.EigenDecompositionImpl_1480_sigmaLow = 0_Rep..```|1 (1)|4 (1)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (20)|2 (20)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_remo..```|1 (29)|2 (29)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (28)|2 (28)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_199_remo..```|1 (30)|2 (30)|True|
|Time4|```org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils_198_if (..```|1 (22)|2 (22)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Insert..```|1 (5)|1 (10)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1_Replace..```|1 (12)|1 (3)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return denominat..```|1 (4)|1 (11)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.0_Replac..```|1 (10)|1 (22)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return p_Replace..```|1 (6)|1 (15)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return java.lang..```|1 (7)|1 (17)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0.0_Repla..```|1 (5)|1 (11)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 1.0_Insert..```|1 (10)|1 (3)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Insert..```|2 (13)|1 (2)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.0_Insert..```|1 (4)|1 (12)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return numerator..```|1 (7)|1 (17)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Replac..```|1 (24)|1 (22)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_ret = 0.5_Insert..```|1 (10)|1 (10)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 0.5_Insert..```|1 (12)|1 (11)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return 0_Replace..```|1 (8)|1 (16)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_148_return 1.0_Repla..```|1 (17)|1 (3)|True|
|Time4|```org.apache.commons.math.distribution.FDistributionImpl_147_ret = 1.0_Replac..```|1 (24)|1 (4)|True|
|Time4|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1798_remove_..```|-|3 (1)|False|
|Time4|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|-|3 (1)|False|
|Time4|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_if (dat..```|1 (1)|3 (1)|True|
|Time4|```org.jfree.chart.renderer.category.AbstractCategoryItemRenderer_1797_remove_..```|-|2 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_308_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_297_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Time4|```org.jfree.chart.block.AbstractBlock_476_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Time4|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_h[2] = ((constraint.getHeight()..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (2)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_298_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_443_org.jfree.chart.block.BorderArr..```|-|1 (2)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_444_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.AbstractBlock_475_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.AbstractBlock_489_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.AbstractBlock_492_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_427_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_w[0] = constraint.getWidth()_Re..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_444_remove_RemoveOp```|-|1 (2)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_w[1] = w[0]_ReplaceOp```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_322_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_453_if ((org.jfree.chart.block.Bord..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_h[4] = h[2]_ReplaceOp```|-|1 (2)|False|
|Time4|```org.jfree.chart.block.AbstractBlock_474_org.jfree.chart.block.AbstractBlock..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_453_remove_RemoveOp```|-|1 (2)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_323_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.AbstractBlock_477_org.jfree.chart.block.AbstractBlock..```|-|2 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_312_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_remove_RemoveOp```|-|1 (2)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_h[3] = h[2]_ReplaceOp```|-|1 (1)|False|
|Time4|```org.jfree.chart.block.BorderArrangement_450_org.jfree.chart.block.BorderArr..```|-|1 (1)|False|
|Time4|```org.jfree.chart.JFreeChart_1207_return _InsertAfterOp```|-|2 (1)|False|
|Time4|```org.jfree.chart.JFreeChart_1219_removeSubtitle(getLegend())_ReplaceOp```|1 (1)|1 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_g2.setXORMode(java.awt.Color.orange)_Replac..```|2 (1)|1 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_g2.setPaintMode()_ReplaceOp```|2 (1)|1 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_setTextAntiAlias(java.awt.RenderingHints.VA..```|1 (1)|2 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.r..```|1 (1)|2 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_g2.clip(chartArea)_ReplaceOp```|-|2 (1)|False|
|Time4|```org.jfree.chart.plot.PiePlot3D_252_if (org.jfree.data.general.DatasetUtilit..```|2 (1)|1 (1)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_remove_RemoveOp```|1 (6)|2 (8)|True|
|Time4|```org.jfree.chart.JFreeChart_1219_org.jfree.chart.JFreeChart.this.subtitles.c..```|-|2 (1)|False|
|Time4|```org.jfree.chart.plot.PiePlot3D_272_if (org.jfree.data.general.DatasetUtilit..```|1 (4)|1 (1)|True|
|Time4|```org.jfree.chart.plot.PiePlot3D_247_if (org.jfree.data.general.DatasetUtilit..```|1 (3)|2 (1)|True|
|Time4|```org.jfree.data.KeyedObjects2D_239_org.jfree.data.KeyedObjects2D.this.column..```|-|10 (1)|False|
|Time4|```org.jfree.chart.plot.CategoryPlot_2867_remove_RemoveOp```|-|1 (1)|False|
|Time4|```org.jfree.data.KeyedObjects2D_95_return 1_ReplaceOp```|-|4.5 (2)|False|
|Time4|```org.jfree.data.KeyedObjects2D_113_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|3.5 (2)|False|
|Time4|```org.jfree.chart.plot.CategoryPlot_2960_org.jfree.chart.plot.CategoryPlot.th..```|-|1 (1)|False|
|Time4|```org.jfree.data.KeyedObjects2D_110_remove_RemoveOp```|-|4 (2)|False|
|Time4|```org.jfree.data.KeyedObjects2D_86_return -1_ReplaceOp```|-|7 (1)|False|
|Time4|```org.jfree.data.general.DatasetUtilities_577_remove_RemoveOp```|-|1 (5)|False|
|Time4|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if ((org.jfree..```|-|2 (1)|False|
|Time4|```org.jfree.data.KeyedObjects2D_113_remove_RemoveOp```|-|4 (7)|False|
|Time4|```org.jfree.data.general.DatasetUtilities_575_remove_RemoveOp```|-|1 (3)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_remove_Remo..```|-|10 (8)|False|
|Time4|```org.jfree.data.KeyedObjects2D_238_remove_RemoveOp```|-|10 (8)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return -1_R..```|-|2 (1)|False|
|Time4|```org.jfree.data.general.DatasetUtilities_574_remove_RemoveOp```|-|1 (7)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_remove_Remo..```|-|3.5 (4)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_return null..```|-|3.5 (2)|False|
|Time4|```org.jfree.data.KeyedObjects2D_239_remove_RemoveOp```|-|10 (6)|False|
|Time4|```org.jfree.chart.plot.CategoryPlot_2855_remove_RemoveOp```|-|1 (1)|False|
|Time4|```org.jfree.data.statistics.MeanAndStandardDeviation_95_return null_ReplaceOp```|-|2.5 (2)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_318_org.jfree.d..```|-|10 (1)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_126_return null..```|-|4 (2)|False|
|Time4|```org.jfree.data.KeyedObjects2D_112_remove_RemoveOp```|-|4 (4)|False|
|Time4|```org.jfree.data.KeyedObjects2D_112_if (columnKey == null) { 	throw new java...```|-|6 (1)|False|
|Time4|```org.jfree.chart.JFreeChart_1393_remove_RemoveOp```|-|6 (5)|False|
|Time4|```org.jfree.data.general.DatasetUtilities_576_remove_RemoveOp```|-|1 (9)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|10 (1)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_113_return null..```|-|10 (1)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_264_return 0_Re..```|-|1 (1)|False|
|Time4|```org.jfree.chart.plot.CategoryPlot_1756_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Time4|```org.jfree.data.KeyedObjects2D_236_org.jfree.data.KeyedObjects2D.this.rows.a..```|-|2 (1)|False|
|Time4|```org.jfree.data.KeyedObjects2D_236_remove_RemoveOp```|-|10 (4)|False|
|Time4|```org.jfree.chart.plot.CategoryPlot_2000_org.jfree.chart.plot.CategoryPlot.th..```|-|2 (1)|False|
|Time4|```org.jfree.chart.plot.CategoryPlot_2672_remove_RemoveOp```|-|2 (1)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (1)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_110_remove_Remo..```|-|4 (8)|False|
|Time4|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_remove_RemoveO..```|-|2 (4)|False|
|Time4|```org.jfree.data.KeyedObjects2D_111_org.jfree.data.KeyedObjects2D.this.rowKey..```|-|1 (1)|False|
|Time4|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (plot == nu..```|-|2.5 (2)|False|
|Time4|```org.jfree.data.general.DatasetUtilities_576_if ((rowCount == 0) || (columnC..```|-|1 (3)|False|
|Time4|```org.jfree.chart.JFreeChart_1393_notifyListeners(new org.jfree.chart.event.C..```|-|5 (1)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_325_org.jfree.d..```|-|10 (1)|False|
|Time4|```org.jfree.data.general.DatasetUtilities_577_return true_ReplaceOp```|-|1 (1)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_111_org.jfree.d..```|-|5 (2)|False|
|Time4|```org.jfree.data.statistics.DefaultStatisticalCategoryDataset_301_fireDataset..```|-|10 (2)|False|
|Time4|```org.jfree.chart.renderer.category.StatisticalBarRenderer_207_if (!(data ins..```|-|1 (2)|False|
|Time4|```org.jfree.data.time.TimeSeries_254_findBoundsByIteration()_InsertBeforeOp```|-|1 (1)|False|
|Time4|```org.jfree.data.time.TimeSeries_576_updateBoundsForRemovedItem(item)_InsertB..```|-|2 (2)|False|
|Time4|```org.jfree.data.time.TimeSeries_564_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (3)|False|
|Time4|```org.jfree.data.time.TimeSeries_581_updateBoundsForRemovedItem(item)_InsertB..```|-|1 (1)|False|
|Time4|```org.jfree.data.xy.XYSeries_564_org.jfree.data.xy.XYSeries.this.data.add(new..```|2 (22)|1 (3)|True|
|Time4|```org.jfree.data.xy.XYSeries_564_add(x, y, true)_ReplaceOp```|2 (22)|2 (1)|True|
|Time4|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (2)|True|
|Time4|```org.jfree.data.time.TimePeriodValues_552_return org.jfree.data.time.TimePer..```|1 (1)|1 (1)|True|
|Time4|```org.joda.time.tz.ZoneInfoCompiler_78_return true_ReplaceOp```|-|1.5 (4)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_320_org.joda.time.tz.ZoneInfoCompiler...```|-|6 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1458_if (size == 0) { 	throw new java...```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_371_remove_RemoveOp```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1458_if ((org.joda.time.tz.ZoneInfoCom..```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_372_remove_RemoveOp```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_371_if (tailZone != null) { 	return ta..```|-|1 (1)|False|
|Time4|```org.joda.time.tz.ZoneInfoCompiler_78_return false_ReplaceOp```|-|2 (2)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1144_if (id == null) { 	return null; }..```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_428_org.joda.time.tz.ZoneInfoCompiler...```|-|2 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1426_org.joda.time.tz.ZoneInfoCompiler..```|-|2 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1434_org.joda.time.tz.ZoneInfoCompiler..```|-|2 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1043_org.joda.time.tz.ZoneInfoCompiler..```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_846_org.joda.time.tz.ZoneInfoCompiler...```|-|2 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1460_remove_RemoveOp```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1460_if ((org.joda.time.tz.ZoneInfoCom..```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1457_remove_RemoveOp```|-|1 (1)|False|
|Time4|```org.joda.time.tz.DateTimeZoneBuilder_1417_org.joda.time.tz.ZoneInfoCompiler..```|-|2 (1)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_178_return 2_ReplaceOp```|-|1 (20)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_178_return 0_ReplaceOp```|-|1 (23)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_111_return (getWrappedField().ge..```|-|1 (6)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_178_return 1_ReplaceOp```|-|1 (22)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_111_return getName().hashCode()_..```|-|1 (12)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_138_return (getWrappedField().ge..```|-|1 (16)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_138_return getMaximumValue(insta..```|-|1 (11)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_178_return 3_ReplaceOp```|-|1 (24)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_138_return (getWrappedField().ge..```|-|1 (9)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_178_return getMinimumValue()_Rep..```|-|1 (22)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_138_return getMaximumValue()_Rep..```|-|1 (12)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_138_return getName().hashCode()_..```|-|1 (11)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_111_return getMaximumValue()_Rep..```|-|1 (9)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_178_return getMinimumValue(insta..```|-|1 (22)|False|
|Time4|```org.joda.time.field.ZeroIsMaxDateTimeField_178_return -1_ReplaceOp```|-|1 (24)|False|
|Total|869|466|759|356|