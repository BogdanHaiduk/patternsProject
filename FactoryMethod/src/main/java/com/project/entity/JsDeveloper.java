package com.project.entity;

public class JsDeveloper implements Developer {
    private static final String JS_DEVELOPER = "JS " + developer;

    @Override
    public void writeCode() {
        System.out.println(JS_DEVELOPER + " writes code...");
    }

    @Override
    public void learnEnglish() {
        System.out.println(JS_DEVELOPER + " learns English");
    }
}
