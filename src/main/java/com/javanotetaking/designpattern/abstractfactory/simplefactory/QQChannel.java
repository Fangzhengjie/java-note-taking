package com.javanotetaking.designpattern.abstractfactory.simplefactory;

public class QQChannel implements ChatChannel {

    @Override
    public void connect() {
        System.out.println("Hello , Here is QQ Channel");
    }
}
