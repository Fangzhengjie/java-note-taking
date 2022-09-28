package com.javanotetaking.designpattern.abstractfactory.simplefactory;

public class TwitterChannel implements ChatChannel {
    @Override
    public void connect() {
        System.out.println("Hello , Here is Twitter Channel");
    }
}
