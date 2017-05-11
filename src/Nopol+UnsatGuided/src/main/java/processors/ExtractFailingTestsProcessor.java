package processors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;

import org.junit.Test;

public class ExtractFailingTestsProcessor extends AbstractProcessor<CtClass> {

	private ArrayList<String> nameOfKeptMethods=new ArrayList<String>();

    public ExtractFailingTestsProcessor(ArrayList<String> nameOfKeptMethods) {
        this.nameOfKeptMethods = nameOfKeptMethods;
    }

    public void discarsCertainMethods(CtClass element) {
    	
         List<CtMethod> removed = new ArrayList<CtMethod>();       
         Set<CtMethod<?>> methods = element.getMethods();
         Boolean whetherRemoveTheMethod = true;
         for(CtMethod method : methods) {
        	if (method.getAnnotation(Test.class) != null || isPublicTestMethod(method))
        	{
        		  whetherRemoveTheMethod = true;
        		  for(String wantedMethod : nameOfKeptMethods) {
        		    if (method.getSimpleName().contains(wantedMethod))
        		    	whetherRemoveTheMethod = false;
        	      }
        		  if(whetherRemoveTheMethod)
        			removed.add(method);
        	}
         }
         for(CtMethod method : removed) {
            element.removeMethod(method);
         }
    }

	private boolean isPublicTestMethod(CtMethod m) {
		return this.isTestMethod(m)&& m.getModifiers().contains(ModifierKind.PUBLIC);
	}
	
	private boolean isTestMethod(CtMethod m) {
		return m.getParameters().size()== 0 && m.getSimpleName().startsWith("test") && m.getType().getSimpleName().equals("void");
	}
    
    public void process(CtClass element) {
    	
    	discarsCertainMethods(element);
    }
}
