package com.gaoyang.cbasecore.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userName;
    private String userPassword;
    private String leaveMessage;


    public User(String userName,String userPassword,String leaveMessage){
         this.userName=userName;
         this.userPassword=userPassword;
         this.leaveMessage=leaveMessage;
    }

    public User()
    {


    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
    }
}
