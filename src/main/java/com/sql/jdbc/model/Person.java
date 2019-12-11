package com.sql.jdbc.model;

public class Person {
    private long id;
    private String userName;
    private String emilId;
    private String passowrd;


    public Person(String userName, String emilId, String passowrd) {
        this.userName = userName;
        this.emilId = emilId;
        this.passowrd = passowrd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmilId() {
        return emilId;
    }

    public void setEmilId(String emilId) {
        this.emilId = emilId;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", emilId='" + emilId + '\'' +
                ", passowrd='" + passowrd + '\'' +
                '}';
    }
}
