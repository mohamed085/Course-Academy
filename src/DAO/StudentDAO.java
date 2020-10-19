package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void deleteStudent(String username) {
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        try {
            pre = connection.prepareStatement("delete from student WHERE username=?");
            pre.setString(1, username);
            pre.executeUpdate();
            System.out.println("Student deleted");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

}
