package com.project.entity;

public class CppDeveloper implements Developer {
    private static final String CPP_DEVELOPER = "Cpp " + developer;

    @Override
    public void writeCode() {
        System.out.println(CPP_DEVELOPER + "writes code...");
    }

    @Override
    public void learnEnglish() {
        System.out.println(CPP_DEVELOPER + "learns English...");
    }
}
