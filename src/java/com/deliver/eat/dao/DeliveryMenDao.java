/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.dao;

import com.deliver.eat.entities.DeliveryMen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class DeliveryMenDao {
      private Connection con;
    
    public DeliveryMenDao (Connection con) {
        this.con=con;
    }
    
    public boolean saveDeliveryMen (DeliveryMen deliveryMen) {
        boolean f=false;
        try{
            
            
            String query="insert into deliverymen (deliv_menId, deliv_name, deliv_password) values (?,?,?)";
            
            
            PreparedStatement pstmt=this.con.prepareStatement(query);
            pstmt.setString(1,  deliveryMen.getDeliv_menId());
            pstmt.setString(2,  deliveryMen.getDeliv_name());
            pstmt.setString(3,  deliveryMen.getDeliv_password());
            
            pstmt.executeUpdate();
            f=true;
        
                    
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        return f;
    }
    
    public DeliveryMen getDeliveryMenByNameAndPassword (String deliv_name, String deliv_password) {
        
       DeliveryMen deliveryMen=null;
        try{
            String query="select * from deliverymen where deliv_name=? and deliv_password=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, deliv_name);
            pstmt.setString(2, deliv_password);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next()) {
                
              deliveryMen=new DeliveryMen();
               
               String name=set.getString("deliv_name");
               
               deliveryMen.setDeliv_name(name);
               
              deliveryMen.setDeliv_menId(set.getString("deliv_menId"));
              deliveryMen.setDeliv_name(set.getString("deliv_name"));
              deliveryMen.setDeliv_password(set.getString("deliv_password"));
               
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return deliveryMen;
    }
    
    public boolean updateDeliveryMen (DeliveryMen deliveryMen) {
        boolean f=false;
        
        try {
            
            String query="update deliverymen set deliv_name=?, 	deliv_password=? where deliv_menId=?";
            
            PreparedStatement p=con.prepareStatement(query);
            p.setString(1, deliveryMen.getDeliv_name());
            p.setString(2, deliveryMen.getDeliv_password());
            p.setString(3, deliveryMen.getDeliv_menId());
            
            p.executeUpdate();
            f=true;
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean deleteDeliveryMen (DeliveryMen deliveryMen) {
        boolean f=false;
        
        try{
            String query="DELETE FROM deliverymen where deliv_menId=?";
            PreparedStatement p=con.prepareStatement(query);
            p.setString(1,deliveryMen.getDeliv_menId());
            
            
            p.executeUpdate();
            f=true;
        } catch(Exception e) {
            
        }
        return f;
    }
    
    
}
