package com.project.factory;

public interface Developer {

    String developer = "developer";

    default void writeCode(){
        System.out.println(developer + " write any code...");
    }

    default void learnEnglish(){
        System.out.println(developer + " any developer learn English...");
    }

}
