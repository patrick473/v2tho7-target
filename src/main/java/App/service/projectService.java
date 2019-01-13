package App.service;

import App.dao.projectDAO;
import App.model.project;

public class projectService {
    private projectDAO dao;

    public void insertProject(project proj) {
        // only call when implemented
        // dao.insertEmployee(proj);
        System.out.print(proj);
    }

}