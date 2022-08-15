/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.entities;
import java.sql.*;
/**
 *
 * @author User
 */
public class Customer {
    
    private int custId;
    private String custname;
    private String custemail;
    private String custaddr;
    private String custpassword;

    public Customer(int custId, String custname, String custemail, String custaddr, String custpassword) {
        this.custId = custId;
        this.custname = custname;
        this.custemail = custemail;
        this.custaddr = custaddr;
        this.custpassword = custpassword;
    }

    public Customer() {
    }

    public Customer(String custname, String custemail, String custaddr, String custpassword) {
        this.custname = custname;
        this.custemail = custemail;
        this.custaddr = custaddr;
        this.custpassword = custpassword;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    public String getCustaddr() {
        return custaddr;
    }

    public void setCustaddr(String custaddr) {
        this.custaddr = custaddr;
    }

    public String getCustpassword() {
        return custpassword;
    }

    public void setCustpassword(String custpassword) {
        this.custpassword = custpassword;
    }
    
    
    
}
