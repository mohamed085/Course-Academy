package Model;

import java.sql.Timestamp;

public class Course {
    private int courseID;
    private String courseName;
    private int categoryID;
    private int rate;
    private double cost;
    private int maxNumberOfStudent;
    private Timestamp deadline;
    private String content;
    private int instructorID;
    private boolean available;


    public Course() {
    }

    public Course(int courseID, String courseName, int categoryID, int rate, double cost, boolean available,
                  int maxNumberOfStudent, Timestamp deadline, String content, int instructorID) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.categoryID = categoryID;
        this.rate = rate;
        this.cost = cost;
        this.available = available;
        this.maxNumberOfStudent = maxNumberOfStudent;
        this.deadline = deadline;
        this.content = content;
        this.instructorID = instructorID;
    }


    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCategory() {
        return categoryID;
    }

    public void setCategory(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getMaxNumberOfStudent() {
        return maxNumberOfStudent;
    }

    public void setMaxNumberOfStudent(int maxNumberOfStudent) {
        this.maxNumberOfStudent = maxNumberOfStudent;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", categoryID='" + categoryID + '\'' +
                ", rate=" + rate +
                ", cost=" + cost +
                ", available=" + available +
                ", maxNumberOfStudent=" + maxNumberOfStudent +
                ", deadline=" + deadline +
                ", content='" + content + '\'' +
                ", instructorID=" + instructorID +
                '}';
    }
}