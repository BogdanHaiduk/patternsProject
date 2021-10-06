package com.project.project_website;

import com.project.abstract_factory.ProjectTeamFactory;
import com.project.entity.Developer;
import com.project.entity.PM;
import com.project.entity.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public PM getPM() {
        return new WebsitePM();
    }
}
