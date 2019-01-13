package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}