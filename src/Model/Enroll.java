package Model;

import java.sql.Timestamp;

public class Enroll {
    private int enrollID;
    private int courseID;
    private int studentID;
    private String status;
    private Timestamp enrollDate;
    private String approval;
    private double rate;


    public Enroll() {
    }

    public Enroll(int enrollID, int courseID, int studentID, String status, Timestamp enrollDate, String approval, double rate) {
        this.enrollID = enrollID;
        this.courseID = courseID;
        this.studentID = studentID;
        this.status = status;
        this.enrollDate = enrollDate;
        this.approval = approval;
        this.rate = rate;
    }


    public int getEnrollID() {
        return enrollID;
    }

    public void setEnrollID(int enrollID) {
        this.enrollID = enrollID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Timestamp enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return "Enroll{" +
                "enrollID=" + enrollID +
                ", courseID=" + courseID +
                ", studentID=" + studentID +
                ", status='" + status + '\'' +
                ", enrollDate=" + enrollDate +
                ", approval='" + approval + '\'' +
                ", rate=" + rate +
                '}';
    }
}

