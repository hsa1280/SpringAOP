package com.fruit.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before(value = "execution(public String getName())")
	public void LoggingAdvice() {
		
		System.out.println("Advice run. Get Method called");
	}
}
