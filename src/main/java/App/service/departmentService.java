package App.service;

import java.util.ArrayList;

import App.dao.departmentDAO;
import App.model.department;

public class departmentService {
    private departmentDAO dao;

    public void insertDepartment(department dep) {
        // only call when implemented
        // dao.insertDepartment(dep);
        System.out.print(dep);
    }

    public department getDepartment(Integer id) {
        return dao.getDepartment(id);
    }

    public ArrayList<department> getAllDepartments() {
        return dao.getAllDepartments();
    }

}