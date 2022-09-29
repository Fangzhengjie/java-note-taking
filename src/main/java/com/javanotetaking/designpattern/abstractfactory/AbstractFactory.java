package com.javanotetaking.designpattern.abstractfactory;

import com.javanotetaking.designpattern.abstractfactory.color.Color;
import com.javanotetaking.designpattern.abstractfactory.shape.Shape;

public abstract class AbstractFactory {

	public   abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}