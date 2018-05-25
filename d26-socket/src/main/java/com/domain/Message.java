package com.domain;

import java.io.Serializable;

public class Message implements Serializable{
    private String msg;
    private String ip;
    private int port;

    public Message() {
    }

    public Message(String msg, String ip, int port) {
        this.msg = msg;
        this.ip = ip;
        this.port = port;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
