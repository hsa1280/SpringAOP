package com.fruit.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruit.AOP.service.FactoryService;
import com.fruit.AOP.service.ShapeService;

public class AopMain {

	public static void main( String args[] ) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("AopSpring.xml");
//		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		
		FactoryService fs = new FactoryService();
		ShapeService shapeService = (ShapeService)fs.getBean("shapeService");
		
		shapeService.getCircle();
	}
}
