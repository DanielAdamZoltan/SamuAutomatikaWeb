package com.samu.webapp.samuautomatikaweb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String fullName;

    private String subject;

    private String phoneNumber;

    private boolean callMeBack;

    private String message;

    private boolean dataManagement; //lehet nem kell

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isCallMeBack() {
        return callMeBack;
    }

    public void setCallMeBack(boolean callMeBack) {
        this.callMeBack = callMeBack;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isDataManagement() {
        return dataManagement;
    }

    public void setDataManagement(boolean dataManagement) {
        this.dataManagement = dataManagement;
    }
}
