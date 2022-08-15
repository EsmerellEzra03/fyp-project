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
public class Restaurant {
    protected String restId;
    protected String restName;
    protected String restAddr;
    protected String restContact;
    
    
    public Restaurant() {
    }
    
public Restaurant(String restName, String restAddr, String restContact) {
        this.restName = restName;
        this.restAddr = restAddr;
        this.restContact = restContact;
        
    }
    

    public Restaurant(String restId, String restName, String restAddr, String restContact) {
        this.restId = restId;
        this.restName = restName;
        this.restAddr = restAddr;
        this.restContact = restContact;
        
    }

    

    public String getRestId() {
        return restId;
    }

    public void setRestId(String restId) {
        this.restId = restId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestAddr() {
        return restAddr;
    }

    public void setRestAddr(String restAddr) {
        this.restAddr = restAddr;
    }

    public String getRestContact() {
        return restContact;
    }

    public void setRestContact(String restContact) {
        this.restContact = restContact;
    }

    
    
    
    
}
