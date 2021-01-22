package com.example.uibestpractice;

public class Msg {
    enum MsgType {
        TYPE_RECEIVED,
        TYPE_SENT,
    }

    private String content;
    private MsgType type;

    public Msg(String content, MsgType type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public MsgType getType() {
        return type;
    }
}

