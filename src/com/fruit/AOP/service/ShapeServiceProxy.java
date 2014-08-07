package com.fruit.AOP.service;

import com.fruit.AOP.aspect.LoggingAspect;
import com.fruit.AOP.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
