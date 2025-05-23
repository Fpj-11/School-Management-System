package com.sms.schoolmanagementsystem.util;

public class Utility {

    private Utility(){

    }

    private String LOGIN_QUERY="select count(*) from stdnt_rgst where username=? and password=?";
    private String LOGIN_SUCCESS="Logged in successfully!";
    private String LOGIN_FAILED="Login Failed!";
    private String INVALID_USERNAME="Invalid Username!";
    private String INVALID_PASSWORD="Invalid Password";

}
