package Model;

import java.sql.Timestamp;

public class Student {
    private int studentID;
    private String username;
    private String password;
    private String name;
    private String mail;
    private String phone;
    private double balance;
    private Timestamp registerDate;


    public Student() {
    }

    public Student(int studentID, String username, String password, String name, String mail, String phone,
                   int balance /*,Timestamp registerDate*/) {
        this.studentID = studentID;
        this.username = username;
        this.password = password;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.balance = balance;
        //     this.registerDate = registerDate;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "studentID=" + studentID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                ", registerDate=" + registerDate +
                '}';
    }
}