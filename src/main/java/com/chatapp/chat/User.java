package com.chatapp.chat;

public class User {
    private String firstName;
    private String login;
    private String age;
    private String password;
    private String number;

    public User(String firstName, String age, String login, String password, String number) {
        this.firstName = firstName;
        this.age = age;
        this.login = login;
        this.password = password;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
