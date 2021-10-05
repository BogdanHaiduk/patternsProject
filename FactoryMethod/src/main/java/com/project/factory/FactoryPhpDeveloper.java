package com.project.factory;

import com.project.entity.Developer;
import com.project.entity.PhpDeveloper;

public class FactoryPhpDeveloper implements FactoryDeveloper {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
