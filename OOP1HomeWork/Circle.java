package com.azt.ooplab;

public class Circle {

	private double radius = 10;
	private String color = "red";

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		c1.setRadius(9);
		System.out.println(c1);
		System.out.println(c1.getArea());
	}

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle[radius = " + radius + "]";
	}
}
