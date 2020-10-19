package Model;

public class Notification {
    private int notificationID;
    private String content;
    private int adminID;


    public Notification() {
    }

    public Notification(int notificationID, String content, int adminID) {
        this.notificationID = notificationID;
        this.content = content;
        this.adminID = adminID;
    }


    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }


    @Override
    public String toString() {
        return "Notification{" +
                "notificationID=" + notificationID +
                ", content='" + content + '\'' +
                ", adminID=" + adminID +
                '}';
    }
}