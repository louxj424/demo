package org.itstack.naive.chat.ui.view.chat;

/**
 * 博  客：http://bugstack.cn
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * create by 付政委 on @2020
 */
public class ChatView {

    private ChatInit chatInit;
    private IChatEvent chatEvent;

    public ChatView(ChatInit chatInit, IChatEvent chatEvent) {
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
    }
}
