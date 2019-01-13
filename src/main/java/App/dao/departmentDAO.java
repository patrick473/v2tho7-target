package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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

    public department getDepartment(Integer id) {
        department dep = new department();
        try (Connection con = super.getConnection()) {

            String query = "SELECT * FROM Department WHERE departmentID = " + id;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            Integer departmentID = rs.getInt("departmentID");
            String name = rs.getString("name");
            String location = rs.getString("location");

            dep = new department(departmentID, name, location);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dep;
    }

    public ArrayList<department> getAllDepartments() {
        ArrayList<department> dep = new ArrayList<department>();
        try (Connection con = super.getConnection()) {

            String query = "SELECT * FROM Department";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Integer departmentID = rs.getInt("departmentID");
                String name = rs.getString("name");
                String location = rs.getString("location");
                department object = new department(departmentID, name, location);
                dep.add(object);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dep;
    }
}