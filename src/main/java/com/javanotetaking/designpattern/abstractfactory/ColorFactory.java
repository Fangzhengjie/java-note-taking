package com.javanotetaking.designpattern.abstractfactory;

import com.javanotetaking.designpattern.abstractfactory.color.Blue;
import com.javanotetaking.designpattern.abstractfactory.color.Color;
import com.javanotetaking.designpattern.abstractfactory.color.Green;
import com.javanotetaking.designpattern.abstractfactory.color.Red;
import com.javanotetaking.designpattern.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}