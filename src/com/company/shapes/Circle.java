package com.company.shapes;

public class Circle {
	private int radius;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	public double calculateArea(){
		return Math.PI*Math.pow(radius, 2);
	}

}
