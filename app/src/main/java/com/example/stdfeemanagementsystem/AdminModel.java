package com.example.stdfeemanagementsystem;

public class AdminModel {
    Integer adminid;
    String password;

    public AdminModel(Integer adminid, String password) {
        this.adminid = adminid;
        this.password = password;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
