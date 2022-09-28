package com.javanotetaking.designpattern.abstractfactory.simplefactory;

public class WeiboChannel implements ChatChannel {
    @Override
    public void connect() {
        System.out.println("Hello , Here is Weibo Channel");
    }
}
