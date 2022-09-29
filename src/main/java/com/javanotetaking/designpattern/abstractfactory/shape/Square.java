package com.javanotetaking.designpattern.abstractfactory.shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Execute Square::draw() method.");
	}
}
