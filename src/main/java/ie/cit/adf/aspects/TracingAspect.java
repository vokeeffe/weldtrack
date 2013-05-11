package ie.cit.adf.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TracingAspect {
	Log log = LogFactory.getLog(TracingAspect.class);

	//Before an method call in any class in 'ie.cit.adf.domain.dao' package
	@Before("execution(* ie.cit.adf.domain.dao..*.*(..))")
	public void trace(JoinPoint jp){
	
		String className = jp.getTarget().getClass().getName();
		String methodName = jp.getSignature().getName();
		log.debug("Method Invoked: "+ className  + "." + methodName);
	}
}
