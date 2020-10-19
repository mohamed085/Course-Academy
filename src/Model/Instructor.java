package Model;

public class Instructor {
    private int instructorID;
    private String username;
    private String password;
    private String name;
    private String mail;
    private String phone;


    public Instructor() {
    }

    public Instructor(int instructorID, String username, String password, String name, String mail,
                      String phone) {
        this.instructorID = instructorID;
        this.username = username;
        this.password = password;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }


    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
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


    @Override
    public String toString() {
        return "Instructor{" +
                "instructorID=" + instructorID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}