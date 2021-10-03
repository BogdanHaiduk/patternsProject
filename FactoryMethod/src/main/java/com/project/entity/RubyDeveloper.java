package com.project.entity;

import com.project.factory.Developer;

public class RubyDeveloper implements Developer {
    private static final String RUBY_DEVELOPER = "Ruby " + developer;

    @Override
    public void writeCode() {
        System.out.println(RUBY_DEVELOPER + "writes code...");
    }

    @Override
    public void learnEnglish() {
        System.out.println(RUBY_DEVELOPER + "learns English...");
    }
}
