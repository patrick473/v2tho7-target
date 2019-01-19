package App.service;

import java.util.ArrayList;

import App.dao.projectDAO;
import App.model.project;

public class projectService {
    private projectDAO dao;

    public void insertProject(project proj) {
        dao.insertProject(proj);
    }

    public project getProject(Integer id) {
        return dao.getProject(id);
    }

    public ArrayList<project> getAllProjects() {
        return dao.getAllprojects();
    }

    public void updateProject(project proj) {
        dao.updateProject(proj);
    }

    public void deleteProject(Integer id) {
        dao.deleteProject(id);
    }

}