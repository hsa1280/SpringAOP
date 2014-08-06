package com.fruit.AOP.aspect;

import org.aspectj.lang.JoinPoint;
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
	
	@Before("allGetters()")
	public void secondAdvice() {
		
		System.out.println("Second Advice executed");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){}
	
	@Pointcut("within(com.fruit.AOP.model.Circle)")
	public void allCircleMethods(){}
}
