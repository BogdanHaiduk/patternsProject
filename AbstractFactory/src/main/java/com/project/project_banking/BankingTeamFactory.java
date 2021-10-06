package com.project.project_banking;

import com.project.entity.Developer;
import com.project.entity.PM;
import com.project.abstract_factory.ProjectTeamFactory;
import com.project.entity.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() { return new JavaDeveloper(); }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public PM getPM() { return new BankingPM(); }

}
