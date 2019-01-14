package App.service;

import java.util.ArrayList;

import App.dao.employeeDAO;
import App.model.employee;

public class employeeService {
    private employeeDAO dao;

    public void insertEmployee(employee emp) {
        // only call when implemented
        // dao.insertEmployee(emp);
        System.out.print(emp);
    }

    public employee getEmployee(Integer id) {
        return dao.getEmployee(id);
    }

    public ArrayList<employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

}