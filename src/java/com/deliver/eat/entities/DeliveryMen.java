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
public class DeliveryMen {
    private String deliv_menId;
    private String deliv_name;
    private String deliv_password; 

    public DeliveryMen() {
    }

    public DeliveryMen(String deliv_menId, String deliv_name, String deliv_password) {
        this.deliv_menId = deliv_menId;
        this.deliv_name = deliv_name;
        this.deliv_password = deliv_password;
    }

    public String getDeliv_menId() {
        return deliv_menId;
    }

    public void setDeliv_menId(String deliv_menId) {
        this.deliv_menId = deliv_menId;
    }

    public String getDeliv_name() {
        return deliv_name;
    }

    public void setDeliv_name(String deliv_name) {
        this.deliv_name = deliv_name;
    }

    public String getDeliv_password() {
        return deliv_password;
    }

    public void setDeliv_password(String deliv_password) {
        this.deliv_password = deliv_password;
    }
    
    
}
