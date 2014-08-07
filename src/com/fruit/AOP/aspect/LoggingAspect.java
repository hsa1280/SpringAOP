package com.fruit.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void LoggingAdvice( JoinPoint jointPoint ) {
		
		System.out.println("Advice run. Get Method called");
	}
	
	@Before("args(name)")
	public void stringArgumentMethods( String name ) {
		
		System.out.println("A method that takes String arguments has been called. The value is " + name );
	}
	
	@Around("allGetters()")
	public Object myAroundAdvice( ProceedingJoinPoint proceedingJointPoint ) {
		
		Object object = null;
		
		try {
			
			System.out.println("Before advice");
			object = proceedingJointPoint.proceed();
			System.out.println("After returning");
			throw(new RuntimeException());
		} catch (Throwable e) {

			System.out.println("After throwing");
		}
		
		System.out.println("After Finally");
		return object;
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		
		System.out.println("Second Advice executed");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){}
	
	@Pointcut("within(com.fruit.AOP.model.Circle)")
	public void allCircleMethods(){}
}
