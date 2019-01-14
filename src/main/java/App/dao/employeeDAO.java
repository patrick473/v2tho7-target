package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import App.model.employee;

public class employeeDAO extends baseDAO {

    public void insertEmployee(employee emp) {

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

    public employee getEmployee(Integer id) {
        employee emp = new employee();
        try (Connection con = super.getConnection()) {

            String query = "SELECT * FROM Employee WHERE employeeID = " + id;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            Integer employeeID = rs.getInt("employeeID");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String ssn = rs.getString("ssn");
            String birthdate = rs.getString("birthdate");
            String address = rs.getString("address");
            String city = rs.getString("city");
            String country = rs.getString("country");
            String email = rs.getString("email");
            // if error is generated wrong datatype this is probally the culprit
            String sex = rs.getString("sex");
            String jobTitle = rs.getString("jobTitle");
            Integer department = rs.getInt("department");

            emp = new employee(employeeID, firstname, lastname, ssn, birthdate, address, city, country, email, sex,
                    jobTitle, department);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }

    public ArrayList<employee> getAllEmployees() {
        ArrayList<employee> emp = new ArrayList<employee>();
        try (Connection con = super.getConnection()) {

            String query = "SELECT * FROM Employee";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Integer employeeID = rs.getInt("employeeID");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String ssn = rs.getString("ssn");
                String birthdate = rs.getString("birthdate");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String country = rs.getString("country");
                String email = rs.getString("email");
                // if error is generated wrong datatype this is probally the culprit
                String sex = rs.getString("sex");
                String jobTitle = rs.getString("jobTitle");
                Integer department = rs.getInt("department");
                employee object = new employee(employeeID, firstname, lastname, ssn, birthdate, address, city, country,
                        email, sex, jobTitle, department);
                emp.add(object);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }
}