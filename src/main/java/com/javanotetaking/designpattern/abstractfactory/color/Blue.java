package com.javanotetaking.designpattern.abstractfactory.color;

public class Blue implements Color {
 
   @Override
   public void fill() {
      System.out.println("Execute Blue::fill() method.");
   }
}