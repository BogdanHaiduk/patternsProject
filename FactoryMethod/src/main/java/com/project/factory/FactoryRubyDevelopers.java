package com.project.factory;

import com.project.entity.RubyDeveloper;

public class FactoryRubyDevelopers implements FactoryDeveloper {
    @Override
    public Developer createDeveloper() {
        return new RubyDeveloper();
    }
}
