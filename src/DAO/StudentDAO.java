package DAO;

import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void insertStudent(Student student) {
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        try {
            pre = connection.prepareStatement("insert into student (username,password,name,mail,phone,balance,registerDate)" +
                    " values (?,?,?,?,?,?,?);");
            pre.setString(1, student.getUsername());
            pre.setString(2, student.getPassword());
            pre.setString(3, student.getName());
            pre.setString(4, student.getMail());
            pre.setString(5, student.getPhone());
            pre.setDouble(6, student.getBalance());
            pre.setTimestamp(7,new java.sql.Timestamp(new java.util.Date().getTime()));
            pre.executeUpdate();
            System.out.println("Student info : " + student);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }



}
