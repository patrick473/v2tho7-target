package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import App.model.employee;

public class employeeDAO extends baseDAO {

    public void insertDepartment(employee emp) {

        try (Connection con = super.getConnection()) {

            String insertString = "INSERT INTO Employee (firstname, lastname, ssn, birthdate, address, city, country, email, sex, jobTitle, department) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertEmployee = con.prepareStatement(insertString);
            insertEmployee.setString(1, emp.getFirstname());
            insertEmployee.setString(2, emp.getLastname());
            insertEmployee.setString(3, emp.getSsn());
            insertEmployee.setString(4, emp.getBirthdate());
            insertEmployee.setString(5, emp.getAddress());
            insertEmployee.setString(6, emp.getCity());
            insertEmployee.setString(7, emp.getCountry());
            insertEmployee.setString(8, emp.getEmail());
            // if error is generated wrong datatype this is probally the culprit
            insertEmployee.setString(9, emp.getSex());
            insertEmployee.setString(10, emp.getJobtitle());
            insertEmployee.setInt(11, emp.getDepartment());
            insertEmployee.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}