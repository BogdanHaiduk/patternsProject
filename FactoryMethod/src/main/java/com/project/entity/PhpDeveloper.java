package com.project.entity;

public class PhpDeveloper implements Developer {
    private static final String PHP_DEVELOPER = "Php " + developer;

    @Override
    public void writeCode() {
        System.out.println(PHP_DEVELOPER + " writes code...");
    }

    @Override
    public void learnEnglish() {
        System.out.println(PHP_DEVELOPER + " learns English...");
    }
}
