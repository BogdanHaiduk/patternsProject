package com.project.project_website;

import com.project.entity.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php-code");
    }

}
