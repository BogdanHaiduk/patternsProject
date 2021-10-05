package com.project.factory;

import com.project.entity.CppDeveloper;
import com.project.entity.Developer;

public class FactoryCppDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
