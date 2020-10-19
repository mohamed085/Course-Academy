package DAO;

import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {


    public void updateStudent(String username, Student newStudent) {
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        try {
            pre = connection.prepareStatement("update student SET password=?,name=?,mail=?,phone=?,balance=?,registerDate=? WHERE username=?");
            pre.setString(1, newStudent.getPassword());
            pre.setString(2, newStudent.getName());
            pre.setString(3, newStudent.getMail());
            pre.setString(4, newStudent.getPhone());
            pre.setDouble(5, newStudent.getBalance());
            pre.setTimestamp(6,new java.sql.Timestamp(new java.util.Date().getTime()));
            pre.setString(7, username);
            pre.executeUpdate();
            System.out.println("New student info : " + newStudent);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void updateStudentName(String username, String newName) {
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        try {
            pre = connection.prepareStatement("update student SET name=? WHERE username=?");
            pre.setString(1, newName);
            pre.setString(2, username);
            pre.executeUpdate();
            System.out.println("New Name : " + newName);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void updateStudentPassword(String username, String newPassword) {
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        try {
            pre = connection.prepareStatement("update student SET password=? WHERE username=?");
            pre.setString(1, newPassword);
            pre.setString(2, username);
            pre.executeUpdate();
            System.out.println("New password : " + newPassword);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void updateStudentMail(String username, String newMail) {
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        try {
            pre = connection.prepareStatement("update student SET mail=? WHERE username=?");
            pre.setString(1, newMail);
            pre.setString(2, username);
            pre.executeUpdate();
            System.out.println("New mail : " + newMail);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

    public void updateStudentPhone(String username,String newPhone){
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        try {
            pre = connection.prepareStatement("update student SET phone=? WHERE username=?");
            pre.setString(1, newPhone);
            pre.setString(2, username);
            pre.executeUpdate();
            System.out.println("New mail : " + newPhone);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

}
