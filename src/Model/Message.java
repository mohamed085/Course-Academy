package Model;

import java.sql.Timestamp;

public class Message {
    private int messageID;
    private String content;
    private Timestamp date;
    private int studentID;
    private int instructorID;


    public Message() {
    }

    public Message(int messageID, String content, Timestamp date, int studentID, int instructorID) {
        this.messageID = messageID;
        this.content = content;
        this.date = date;
        this.studentID = studentID;
        this.instructorID = instructorID;
    }


    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }


    @Override
    public String toString() {
        return "Message{" +
                "messageID=" + messageID +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", studentID=" + studentID +
                ", instructorID=" + instructorID +
                '}';
    }
}