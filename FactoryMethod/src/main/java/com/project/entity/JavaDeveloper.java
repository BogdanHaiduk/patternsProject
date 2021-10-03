package com.project.entity;

import com.project.factory.Developer;

public class JavaDeveloper implements Developer {
    private static final String JAVA_DEVELOPER = "Java " + developer;

    @Override
    public void writeCode() {
        System.out.println(JAVA_DEVELOPER + " writes code...");
    }

    @Override
    public void learnEnglish() {
        System.out.println(JAVA_DEVELOPER + " learns English");
    }
}
