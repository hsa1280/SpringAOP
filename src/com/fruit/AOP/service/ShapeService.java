package com.fruit.AOP.service;

import com.fruit.AOP.aspect.Loggable;
import com.fruit.AOP.model.Circle;
import com.fruit.AOP.model.Triangle;

public class ShapeService {

	private Circle circle;
	
	private Triangle triangle;

	@Loggable
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
