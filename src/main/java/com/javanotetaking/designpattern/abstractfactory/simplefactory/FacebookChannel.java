package com.javanotetaking.designpattern.abstractfactory.simplefactory;

public class FacebookChannel implements ChatChannel {
    @Override
    public void connect() {
        System.out.println("Hello , Here is Facebook Channel");
    }
}
