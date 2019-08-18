package mySql.day06.AnLi;

public class User {
    private int uid;
    private String uname;
    private String upasswd;

    public User() {
    }

    public User(String uname, String upasswd) {
        this.uname = uname;
        this.upasswd = upasswd;
    }

    public User(int uid, String uname, String upasswd) {
        this.uid = uid;
        this.uname = uname;
        this.upasswd = upasswd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upasswd='" + upasswd + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpasswd() {
        return upasswd;
    }

    public void setUpasswd(String upasswd) {
        this.upasswd = upasswd;
    }
}
