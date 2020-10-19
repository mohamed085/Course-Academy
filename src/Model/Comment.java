package Model;

import java.sql.Timestamp;

public class Comment {
    private int commentID;
    private String content;
    private Timestamp date;
    private int postID;
    private int studentID;


    public Comment() {
    }

    public Comment(int commentID, String content, Timestamp date, int postID, int studentID) {
        this.commentID = commentID;
        this.content = content;
        this.date = date;
        this.postID = postID;
        this.studentID = studentID;
    }


    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
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

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", postID=" + postID +
                ", studentID=" + studentID +
                '}';
    }
}