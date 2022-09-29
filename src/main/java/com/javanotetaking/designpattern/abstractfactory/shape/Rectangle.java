package com.javanotetaking.designpattern.abstractfactory.shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Execute Rectangle::draw() method.");
	}
}
