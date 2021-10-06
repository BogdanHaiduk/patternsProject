package com.project;

import com.project.project_banking.BankingTeamFactory;
import com.project.entity.Developer;
import com.project.entity.PM;
import com.project.abstract_factory.ProjectTeamFactory;
import com.project.entity.Tester;
import com.project.project_website.WebSiteTeamFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ProjectTeamFactory> projectTeamFactoryList = new ArrayList<>();
        projectTeamFactoryList.add(new BankingTeamFactory());
        projectTeamFactoryList.add(new WebSiteTeamFactory());
        out(projectTeamFactoryList);
    }

    static List<Object> newProject(ProjectTeamFactory teamFactory){
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        PM pm = teamFactory.getPM();
        List<Object> list = new ArrayList<>();
        list.add(developer);
        list.add(tester);
        list.add(pm);
        return list;
    }

    static void out(List<ProjectTeamFactory> projectTeamFactoryList){
        List<Object> objects = new ArrayList<>();
        projectTeamFactoryList
                .forEach(projectTeamFactory ->
                        objects.addAll(newProject(projectTeamFactory)));
        objects.stream().filter( o -> o instanceof Developer).forEach(o -> ((Developer) o).writeCode());
        objects.stream().filter( o -> o instanceof Tester).forEach(o -> ((Tester) o).testCode());
        objects.stream().filter( o -> o instanceof PM).forEach(o -> ((PM) o).manageProject());
    }

}
