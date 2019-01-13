package App.service;

import App.dao.departmentDAO;
import App.model.department;

public class departmentService {
    private departmentDAO dao;

    public void insertDepartment(department dep) {
        // only call when implemented
        // dao.insertDepartment(dep);
        System.out.print(dep);
    }

}