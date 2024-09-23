package org.example.jxut.model;

public class Users {
    private int id;
    private String username;
    private String sex;
    private int state;

    public Users(int id, String username, String sex, int state) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
