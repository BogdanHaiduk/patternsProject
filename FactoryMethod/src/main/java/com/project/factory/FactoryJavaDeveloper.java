package com.project.factory;

import com.project.entity.JavaDeveloper;

public class FactoryJavaDeveloper implements FactoryDeveloper {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}