package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import App.model.department;

public class departmentDAO extends baseDAO {

    public void insertDepartment(department dep) {

        try (Connection con = super.getConnection()) {

            String insertString = "INSERT INTO Department (name, location) VALUES (?, ?)";
            PreparedStatement insertDepartment = con.prepareStatement(insertString);
            insertDepartment.setString(1, dep.getName());
            insertDepartment.setString(2, dep.getLocation());
            insertDepartment.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}