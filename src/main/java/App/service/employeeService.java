package App.service;

import java.util.ArrayList;

import App.dao.employeeDAO;
import App.model.employee;

public class employeeService {
    private employeeDAO dao;

    public void insertEmployee(employee emp) {
        dao.insertEmployee(emp);
    }

    public employee getEmployee(Integer id) {
        return dao.getEmployee(id);
    }

    public ArrayList<employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

    public void deleteEmployee(Integer id) {
        dao.deleteEmployee(id);
    }

    public void updateEmployee(employee emp) {
        dao.updateEmployee(emp);
    }

}