package com.project.factory;

import com.project.entity.CppDeveloper;

public class FactoryCppDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
