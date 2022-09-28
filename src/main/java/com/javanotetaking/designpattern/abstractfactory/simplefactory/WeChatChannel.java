package com.javanotetaking.designpattern.abstractfactory.simplefactory;

public class WeChatChannel implements ChatChannel {

    @Override
    public void connect() {
        System.out.println("Hello , Here is WeChat Channel");
    }
}
