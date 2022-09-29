package com.javanotetaking.designpattern.abstractfactory;

import com.javanotetaking.designpattern.abstractfactory.AbstractFactory;
import com.javanotetaking.designpattern.abstractfactory.color.Color;
import com.javanotetaking.designpattern.abstractfactory.shape.Circle;
import com.javanotetaking.designpattern.abstractfactory.shape.Rectangle;
import com.javanotetaking.designpattern.abstractfactory.shape.Shape;
import com.javanotetaking.designpattern.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}