package DAO;

import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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


    public void deleteStudent(String username) {
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        try {
            pre = connection.prepareStatement("delete from student WHERE username=?");
            pre.setString(1, username);
            pre.executeUpdate();
            System.out.println("Student deleted");
        } catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Error");
            }
        }

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
    public void displayAllStudent() {
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        ResultSet rst = null;
        try {
            pre = connection.prepareStatement("select * FROM student ");
            rst = (ResultSet) pre.executeQuery();
            System.out.print("Id\t\tusername\t\tpassword\t\tname\t\t\tmail\t\t\t\t\t\tphone\t\t\t\tbalance\t\tregisterDate\n");
            while(rst.next()){
                System.out.println(rst.getInt(1)+"\t\t"+rst.getString(2)+"\t\t"
                        +rst.getString(3)+"\t\t\t"+rst.getString(4)+"\t"
                        +rst.getString(5)+"\t"+rst.getString(6)+"\t\t\t"
                        +rst.getString(7)+"\t\t\t"+rst.getTimestamp(8));
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error");
        }
    }

}
