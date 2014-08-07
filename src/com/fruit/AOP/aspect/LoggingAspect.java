package com.fruit.AOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	public Object myAroundAdvice( ProceedingJoinPoint proceedingJointPoint ) {
		
		Object object = null;
		
		try {
			
			System.out.println("Before advice");
			object = proceedingJointPoint.proceed();
			System.out.println("After returning");
		} catch (Throwable e) {

			System.out.println("After throwing");
		}
		
		System.out.println("After Finally");
		return object;
	}
	
}
