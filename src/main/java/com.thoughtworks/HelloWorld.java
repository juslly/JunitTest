package com.thoughtworks;

public class HelloWorld {
    private Dependency dependency;

    public HelloWorld(Dependency dependency) {

        this.dependency = dependency;

        System.out.println("hello");
    }
    public String beenCalled() {
        return dependency.say();
    }
}
