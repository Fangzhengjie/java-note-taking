package com.javanotetaking.designpattern.abstractfactory.color;

public class Green implements Color {
 
   @Override
   public void fill() {
      System.out.println("Execute Green::fill() method.");
   }
}