/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.dao;
import com.deliver.eat.entities.Admin;
import static java.lang.System.out;
import static java.lang.reflect.Array.set;
import java.sql.*;
import static javax.servlet.jsp.jstl.core.Config.set;


/**
 *
 * @author User
 */
public class AdminDao {
    
    private Connection con;
    
    public AdminDao (Connection con) {
        this.con=con;
    }
    
    public boolean saveAdmin(Admin admin) {
        boolean f=false;
        try{
            String query="insert into admin(adminId,adname,adpassword) values(?,?,?)";
            PreparedStatement pstmt=this.con.prepareStatement(query);
            pstmt.setString(1, admin.getAdminId());
            pstmt.setString(2, admin.getAdname());
            pstmt.setString(3,admin.getAdpassword());
            
            pstmt.executeUpdate();
            f=true;
        
                    
        }catch(Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public Admin getAdminByNameAndPassword(String adname, String adpassword) {
        
        Admin admin=null;
        try{
            String query="select * from admin where adname=? and adpassword=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, adname);
            pstmt.setString(2, adpassword);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next()) {
                
               admin=new Admin();
               
               String name=set.getString("adname");
               
               admin.setAdname(name);
               
              admin.setAdminId(set.getString("adminId"));
              admin.setAdname(set.getString("adname"));
              admin.setAdpassword(set.getString("adpassword"));
               
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return admin;
    }
    
    public boolean updateAdmin(Admin admin) {
        boolean f=false;
        
        try {
            
            String query="update admin set adname=?, adpassword=? where adminId=?";
            PreparedStatement p=con.prepareStatement(query);
            p.setString(1, admin.getAdname());
            p.setString(2, admin.getAdpassword());
            p.setString(3,admin.getAdminId());
            
            
            p.executeUpdate();
            f=true;
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean deleteAdmin (Admin admin) {
        boolean f=false;
        
        try{
            String query="DELETE FROM admin where adminId=?";
            PreparedStatement p=con.prepareStatement(query);
            p.setString(1,admin.getAdminId());
            
            
            p.executeUpdate();
            f=true;
        } catch(Exception e) {
            
        }
        return f;
    }
    
    
    
    
}
