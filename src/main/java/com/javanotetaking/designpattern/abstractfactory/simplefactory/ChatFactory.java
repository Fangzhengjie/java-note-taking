package com.javanotetaking.designpattern.abstractfactory.simplefactory;

public class ChatFactory {
    public static ChatChannel connect(String type) {
        ChatChannel chatChannel = null;
        switch (type) {
            case "QQ":
                chatChannel = new QQChannel();
                break;
            case "WeChat":
                chatChannel = new WeChatChannel();
                break;
            case "Weibo":
                chatChannel = new WeiboChannel();
                break;
            case "Twitter":
                chatChannel = new TwitterChannel();
                break;
            case "Facebook":
                chatChannel = new FacebookChannel();
                break;
            default:
                break;
        }
        return chatChannel;
    }
}
