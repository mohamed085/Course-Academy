package Model;

import java.sql.Timestamp;

public class Post {
    private int postID;
    private String content;
    private Timestamp date;
    private int studentID;


    public Post() {
    }

    public Post(int postID, String content, Timestamp date, int studentID) {
        this.postID = postID;
        this.content = content;
        this.date = date;
        this.studentID = studentID;
    }


    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
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


    @Override
    public String toString() {
        return "Post{" +
                "postID=" + postID +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", studentID=" + studentID +
                '}';
    }
}