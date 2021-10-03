package com.project;

import com.project.entity.Developers;
import com.project.factory.*;

public class MainClass {

    public static void main(String[] args) {
        for (Developers dev: Developers.values()){
            FactoryDeveloper factoryDeveloper = createFactoryDeveloper(dev);
            Developer developer = factoryDeveloper.createDeveloper();
            developer.writeCode();
            developer.learnEnglish();
            System.out.println("-------");
        }
    }

    static FactoryDeveloper createFactoryDeveloper (Developers specialty){
        switch (specialty){
            case JAVA: return new FactoryJavaDeveloper();
            case JS: return new FactoryJsDeveloper();
            case CPP: return new FactoryCppDeveloper();
            case RUBY: return new FactoryRubyDevelopers();
            case PHP: return new FactoryPhpDeveloper();
        }
        return null;
    }

}
