package com.hnguyen.jee.soap.jakarta.hello;

public class Hello {

    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public String getHello(){
        return name;
    }
}
