package com.project.abstract_factory;

import com.project.entity.Developer;
import com.project.entity.PM;
import com.project.entity.Tester;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    PM getPM();

}
