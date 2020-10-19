package Model;

import java.sql.Timestamp;

public class Like {
    private int likeID;
    private int count;
    private Timestamp date;
    private int postID;
    private int studentID;


    public Like() {
    }

    public Like(int likeID, int count, Timestamp date, int postID, int studentID) {
        this.likeID = likeID;
        this.count = count;
        this.date = date;
        this.postID = postID;
        this.studentID = studentID;
    }


    public int getLikeID() {
        return likeID;
    }

    public void setLikeID(int likeID) {
        this.likeID = likeID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
        return "Like{" +
                "likeID=" + likeID +
                ", count=" + count +
                ", date=" + date +
                ", postID=" + postID +
                ", studentID=" + studentID +
                '}';
    }
}