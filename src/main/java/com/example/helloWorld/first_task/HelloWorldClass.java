package com.example.helloWorld.first_task;

public class HelloWorldClass {

    private String data;

    public HelloWorldClass() {
    }

    public HelloWorldClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "data='" + data + '\'' +
                '}';
    }
}