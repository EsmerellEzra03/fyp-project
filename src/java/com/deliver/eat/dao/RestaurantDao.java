/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.dao;

import com.deliver.eat.entities.Restaurant;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author User
 */
public class RestaurantDao {
    
   Connection connection = null;
    private String jdbcURL="jdbc:mysql://localhost:3306/delivereat";
    private String jdbcUsername="root";
    private String jdbcPassword="admin";
    
    private static final String INSERT_RESTAURANTS_SQL= "INSERT INTO restaurant(rest_id,rest_name,rest_addr,rest_contact) VALUES " +
             "(?, ?, ?, ?);";
    
    
    private static final String SELECT_RESTAURANT_BY_ID ="select rest_name,rest_addr,rest_contact from restaurant where rest_id=?";
    private static final String SELECT_ALL_RESTAURANTS="select * from restaurant";
    private static final String DELETE_RESTAURANTS_SQL="delete from restaurant where rest_id=?";
    private static final String UPDATE_RESTAURANTS_SQL="update restaurant set rest_name=?, rest_addr=?, rest_contact=? where rest_id=?;";
    

    public RestaurantDao() { }
       
     protected Connection getConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        }  catch (SQLException e) {
        e.printStackTrace();
    }catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
        return connection;
    }
    
    
    

    
    public void insertRestaurant (Restaurant restaurant) throws SQLException {
        System.out.println(INSERT_RESTAURANTS_SQL);
        
        try(Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(INSERT_RESTAURANTS_SQL)){
        
       
        preparedStatement.setString(1, restaurant.getRestId());
        preparedStatement.setString(2, restaurant.getRestName());
        preparedStatement.setString(3, restaurant.getRestAddr());
        preparedStatement.setString(4, restaurant.getRestContact());
         preparedStatement.executeUpdate();
         
    }catch(SQLException e) {
        printSQLException(e);
    }
    
    } 
    public Restaurant selectRestaurant(String restId) {
        Restaurant restaurant = null;
        try(Connection connection=getConnection();
         
        
         
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_RESTAURANT_BY_ID);) {
        preparedStatement.setString(1, restId);
            System.out.println(preparedStatement);
            
            ResultSet rs=preparedStatement.executeQuery();
         
        while (rs.next()) {
            String restName = rs.getString("rest_name");
            String restAddr = rs.getString("rest_addr");
            String restContact = rs.getString("rest_contact");
           
            
            restaurant = new Restaurant(restId, restName, restAddr, restContact);
        }
         
        }catch(SQLException e) {
            printSQLException(e);
        } return restaurant;
    }
    
        public List <Restaurant> selectAllRestaurants()  {
        List <Restaurant> restaurants = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ALL_RESTAURANTS);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            String restId = rs.getString("rest_id");
            String restName = rs.getString("rest_name");
            String restAddr = rs.getString("rest_addr");
            String restContact = rs.getString("rest_contact");
           
             restaurants.add(new Restaurant(restId,restName,restAddr,restContact));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return restaurants;
      
    }
    
    public boolean deleteRestaurant(String restId) throws SQLException {
        boolean rowDeleted;
         
        try(Connection connection= getConnection();
         
        PreparedStatement statement = connection.prepareStatement(DELETE_RESTAURANTS_SQL); ) {
        statement.setString(1, restId);
        rowDeleted=statement.executeUpdate() >0; 
        
                }
        return rowDeleted;
    
    
}
    
     public boolean updateRestaurant(Restaurant restaurant) throws SQLException {
        boolean rowUpdated;
        
         try(Connection connection = getConnection(); PreparedStatement statement=
                connection.prepareStatement(UPDATE_RESTAURANTS_SQL);) {
             
         
       
        statement.setString(1, restaurant.getRestName());
        statement.setString(2, restaurant.getRestAddr());
        statement.setString(3, restaurant.getRestContact());
        statement.setString(4, restaurant.getRestId());
         
        rowUpdated = statement.executeUpdate() > 0;
        
         }
        return rowUpdated;
    
    
}
    
     private void printSQLException(SQLException ex) {
      for (Throwable e: ex) {
          
          if (e instanceof SQLException) {
          e.printStackTrace(System.err);
          System.err.println("SQLState: " + ((SQLException) e).getSQLState());
            System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
            System.err.println("Message: " + e.getMessage());
            Throwable t = ex.getCause();
            while(t !=null) {
                System.out.println("Cause: " + t);
                t = t.getCause();
            }
      }
      }
    }
     
}
