package com.fruit.AOP.service;

import com.fruit.AOP.model.Circle;
import com.fruit.AOP.model.Triangle;

public class FactoryService {

	public Object getBean( String beanType ) {
		
		if( beanType.equals("shapeService") )
			return new ShapeServiceProxy();
		if( beanType.equals("circle") )
			return new Circle();
		if( beanType.equals("triangle") )
			return new Triangle();
		return null;
	}
}
