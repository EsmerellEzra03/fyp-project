/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.entities;

/**
 *
 * @author User
 */
public class Admin {
    private String adminId;
    private String adname;
    private String adpassword;

    public Admin() {
    }
    
    

    public Admin(String adminId, String adname, String adpassword) {
        this.adminId = adminId;
        this.adname = adname;
        this.adpassword = adpassword;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getAdpassword() {
        return adpassword;
    }

    public void setAdpassword(String adpassword) {
        this.adpassword = adpassword;
    }
    
    
}
