package Entities.concretes;

import Entities.abstracts.IEntity;
import core.abstracts.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class User implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String phoneNum;
    private String password;

    private List<NotificationService> notificationTypes;

    public User(int id, String firstName, String lastName, String eMail, String phoneNum, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<NotificationService> getNotificationTypes() {
        return notificationTypes;
    }

    public void setNotificationTypes(List<NotificationService> notificationTypes) {
        this.notificationTypes = notificationTypes;
    }
}
