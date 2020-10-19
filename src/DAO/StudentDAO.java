package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    public void  searchByName(String name){
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        ResultSet rst = null;
        try {
            pre = connection.prepareStatement("select * FROM student WHERE name=?");
            pre.setString(1,name);
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

    public void  searchByPhone(String phone){
        PreparedStatement pre;
        Connection connection = DBConnection.getConnection();
        ResultSet rst = null;
        try {
            pre = connection.prepareStatement("select * FROM student WHERE phone=?");
            pre.setString(1,phone);
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
