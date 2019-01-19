package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import App.model.project;

public class projectDAO extends baseDAO {

    public void insertProject(project proj) {

        try (Connection con = super.getConnection()) {

            String insertString = "INSERT INTO Project (name, location) VALUES (?, ?)";
            PreparedStatement insertProject = con.prepareStatement(insertString);
            insertProject.setString(1, proj.getName());
            insertProject.setString(2, proj.getLocation());
            insertProject.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateProject(project proj) {

        try (Connection con = super.getConnection()) {
            String updateString = "UPDATE project SET name = ?, location = ? WHERE projectID = ?";
            PreparedStatement updateProject = con.prepareStatement(updateString);
            updateProject.setString(1, proj.getName());
            updateProject.setString(2, proj.getLocation());
            updateProject.setInt(3, proj.getProjectnumber());

            updateProject.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteProject(Integer id) {

        try (Connection con = super.getConnection()) {
            String deleteString = "DELETE FROM project WHERE projectID = ?";
            PreparedStatement deleteProject = con.prepareStatement(deleteString);
            deleteProject.setInt(1, id);

            deleteProject.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public project getProject(Integer id) {
        project proj = new project();
        try (Connection con = super.getConnection()) {

            String query = "SELECT * FROM Project WHERE projectID = " + id;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            Integer projectID = rs.getInt("projectID");
            String name = rs.getString("name");
            String location = rs.getString("location");

            proj = new project(projectID, name, location);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return proj;
    }

    public ArrayList<project> getAllprojects() {
        ArrayList<project> proj = new ArrayList<project>();
        try (Connection con = super.getConnection()) {

            String query = "SELECT * FROM Project";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Integer projectID = rs.getInt("projectID");
                String name = rs.getString("name");
                String location = rs.getString("location");
                project object = new project(projectID, name, location);
                proj.add(object);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return proj;
    }
}