package com.javanotetaking.designpattern.abstractfactory.shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Execute Circle::draw() method.");
	}
}
