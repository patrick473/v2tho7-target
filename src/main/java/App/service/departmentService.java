package App.service;

import java.util.ArrayList;

import App.dao.departmentDAO;
import App.model.department;

public class departmentService {
    private departmentDAO dao;

    public void insertDepartment(department dep) {
        dao.insertDepartment(dep);
    }

    public department getDepartment(Integer id) {
        return dao.getDepartment(id);
    }

    public ArrayList<department> getAllDepartments() {
        return dao.getAllDepartments();
    }

    public void updateDepartment(department dep) {
        dao.updateDepartment(dep);
    }

    public void deleteDepartment(Integer id) {
        dao.deleteDepartment(id);
    }

}