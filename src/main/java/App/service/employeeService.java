package App.service;

import App.dao.employeeDAO;
import App.model.employee;

public class employeeService {
    private employeeDAO dao;

    public void insertEmployee(employee emp) {
        // only call when implemented
        // dao.insertEmployee(emp);
        System.out.print(emp);
    }

}