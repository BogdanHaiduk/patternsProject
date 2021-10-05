package com.project.factory;

import com.project.entity.Developer;
import com.project.entity.JsDeveloper;

public class FactoryJsDeveloper implements FactoryDeveloper {
    @Override
    public Developer createDeveloper() {
        return new JsDeveloper();
    }
}
