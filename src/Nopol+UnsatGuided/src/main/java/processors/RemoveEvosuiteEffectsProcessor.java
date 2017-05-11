package processors;

import static org.junit.Assert.assertTrue;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCatch;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.TypeFilter;

public class RemoveEvosuiteEffectsProcessor extends AbstractProcessor<CtClass>{

    private static final ArrayList<String> UNWATED_ANNOTATIONS = new ArrayList<String>();
    {
        UNWATED_ANNOTATIONS.add("org.junit.runner.RunWith");
        UNWATED_ANNOTATIONS.add("org.evosuite.runtime.EvoRunnerParameters");
        UNWATED_ANNOTATIONS.add("org.junit.BeforeClass");
        UNWATED_ANNOTATIONS.add("org.junit.Before");
        UNWATED_ANNOTATIONS.add("org.junit.After");
        UNWATED_ANNOTATIONS.add("org.junit.AfterClass");
        UNWATED_ANNOTATIONS.add("org.evosuite.runtime.annotation.EvoSuiteClassExclude");
    }

    public void removeClassAnnotations(CtClass element){
        List<CtAnnotation<? extends Annotation>> annotations = element.getAnnotations();
        List<CtAnnotation<? extends Annotation>> removed = new ArrayList<CtAnnotation<? extends Annotation>>();
        for(CtAnnotation annotation : annotations){
            if(UNWATED_ANNOTATIONS.contains(annotation.getActualAnnotation().annotationType().getName())){
                removed.add(annotation);
            }
        }	
        for(CtAnnotation annotation : removed){
            element.removeAnnotation(annotation);
        }
    }

    public void removeAnnotatedMethods(CtClass element){
        List<CtMethod> removed = new ArrayList<CtMethod>();
        Set<CtMethod<?>> methods = element.getMethods();
        for(CtMethod method : methods){
            List<CtAnnotation<? extends Annotation>> annotations = method.getAnnotations();
            for(CtAnnotation annotation : annotations){
                if(UNWATED_ANNOTATIONS.contains(annotation.getActualAnnotation().annotationType().getName())){
                    removed.add(method);
                    break;
                }
            }
        }
        for(CtMethod method : removed){
            element.removeMethod(method);
        }
    }

    public void removeEvosuiteFields(CtClass element){
        List<CtField> removed = new ArrayList<CtField>();
        List<CtField<?>> fields = element.getFields();
        for(CtField field : fields){
        	if (field.getSimpleName().equalsIgnoreCase("threadStopper")
        			||field.getSimpleName().equalsIgnoreCase("nfr"))
        		removed.add(field);
        }
        for(CtField field : removed){
            element.removeField(field);
        }
    }
    
    public void changeEvosuiteVerifyCatchBlock(CtClass element){
    	
        Set<CtMethod<?>> methods = element.getMethods();     
        for(CtMethod method : methods){
            List<CtCatch> catchBlock = method.getElements(new TypeFilter(CtCatch.class));
            for(CtCatch catchElement : catchBlock) {
            	if((catchElement.getBody().toString().indexOf("verifyException"))!=-1) {
            		CtBlock toReplace = catchElement.getBody();
            		List<CtStatement> toremoved = toReplace.getStatements();
            		  for (int index=0; index< toremoved.size(); index++) {
            			  toReplace.removeStatement(toremoved.get(index));
            		}    
            	}
            }
        }
    }
    
    public void process(CtClass element) {
        removeClassAnnotations(element);
        removeAnnotatedMethods(element);
        removeEvosuiteFields(element);
        //changeEvosuiteVerifyCatchBlock(element);
    }
}
