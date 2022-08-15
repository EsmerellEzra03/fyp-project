/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.dao;
import com.deliver.eat.entities.Customer;
import java.sql.*;
/**
 *
 * @author User
 */
public class CustomerDao {
    private Connection con;

    public CustomerDao(Connection con) {
        this.con = con;
    }
    
    public boolean saveCustomer(Customer customer) {
        boolean f=false;
        
        try{
            String query="insert into customer(custname,custemail,custaddr,custpassword) values(?,?,?,?)";
            PreparedStatement pstmt=this.con.prepareStatement(query);
            
            pstmt.setString(1, customer.getCustname());
            pstmt.setString(2, customer.getCustemail());
            pstmt.setString(3, customer.getCustaddr());
            pstmt.setString(4, customer.getCustpassword());
            
            pstmt.executeUpdate();
            f=true;
            
        }catch(Exception e) {
            e.printStackTrace();
            
        }
        return f;     
   }
    
    public Customer getCustomerByEmailndPassword(String custemail, String custpassword) {
        
        Customer customer=null;
        try{
            
            String query="select * from customer where custemail=? and custpassword=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            
            pstmt.setString(1, custemail);
            pstmt.setString(2, custpassword);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next()) {
                
              customer = new Customer();
              
              String custname=set.getString("custname");
              
              customer.setCustname(custname);
              
              customer.setCustId(set.getInt("custId"));
              customer.setCustname(set.getString("custname"));
              customer.setCustemail(set.getString("custemail"));
              customer.setCustemail(set.getString("custaddr"));
              customer.setCustpassword(set.getString("custpassword"));
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return customer;
    }
    
    
    public boolean updateCustomer(Customer customer) {
        boolean f=false;
        
        
        try{
            String query="update customer set custname=?, custemail=?, custaddr=?, custpassword=? where custId=?";
            PreparedStatement p=con.prepareStatement(query);
            
            p.setString(1, customer.getCustname());
            p.setString(2, customer.getCustemail());
            p.setString(3, customer.getCustaddr());
            p.setString(4, customer.getCustpassword());
            p.setInt(5, customer.getCustId());
            
            
            p.executeUpdate();
            f=true;
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean deleteCustomer(Customer customer) {
        boolean f=false;
        
        try{
            
            String query="DELETE FROM customer WHERE custId=?";
            PreparedStatement p=con.prepareStatement(query);
            p.setInt(1, customer.getCustId());
            
            
            p.executeUpdate();
            f=true;
        }catch(Exception e) {
            
        }
        return f;
    }
    
    
    
    
    
    
}
