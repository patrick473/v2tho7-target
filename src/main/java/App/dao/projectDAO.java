package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class projectDAO extends baseDAO {

    public void insertData() {

        try (Connection con = super.getConnection()) {

            PreparedStatement stmt = con.prepareStatement("INSERT TEST DATA STATEMENT HERE");
            stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}