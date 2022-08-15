/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.dao;

import com.deliver.eat.entities.Cart;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class CartDao {
     Connection connection = null;
    private String jdbcURL="jdbc:mysql://localhost:3306/delivereat";
    private String jdbcUsername="root";
    private String jdbcPassword="admin";
    
    private static final String INSERT_CARTS_SQL= "INSERT INTO cart(cart_id,food_name,food_price) VALUES " +
             "(?, ?, ?);";
    
    
    private static final String SELECT_CART_BY_ID ="select food_name, food_price from cart where cart_id=?";
    private static final String SELECT_ALL_CARTS="select * from cart where status='pending'";
    private static final String DELETE_CARTS_SQL="delete from cart where cart_id=?";
    private static final String UPDATE_CARTS_SQL="update cart set food_name=?, food_price=?  where cart_id=?;";
    private static final String SELECT_ALL_CARTS2="select * from cart where status='checkedout'";

    public  CartDao() {
    }
    
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
    
    
    
     public void insertCart(Cart cart) throws SQLException {
        System.out.println(INSERT_CARTS_SQL);
        
        try(Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(INSERT_CARTS_SQL)){
        
        
        preparedStatement.setString(1, cart.getCartId());
        preparedStatement.setString(2, cart.getFoodName());
        preparedStatement.setString(3, cart.getFoodPrice());
       
       
    }catch(SQLException e) {
        printSQLException(e);
    }
    
    } 
    
      public Cart selectCart(String cartId) {
       Cart cart = null;
        try(Connection connection=getConnection();
         
       
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CART_BY_ID);) {
        preparedStatement.setString(1, cartId);
            System.out.println(preparedStatement);
            
            ResultSet rs=preparedStatement.executeQuery();
         
        while (rs.next()) {
            String foodName = rs.getString("food_name");
            String foodPrice= rs.getString("food_price");
           
             
            cart = new Cart (cartId, foodName, foodPrice);
        }
         
        }catch(SQLException e) {
            printSQLException(e);
        } return cart;
    }
     
        public List <Cart> selectAllCarts()  {
        List <Cart> carts = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ALL_CARTS);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            String cartId = rs.getString("cart_id");
            String foodName = rs.getString("food_name");
            String foodPrice=rs.getString("food_price");
             carts.add(new Cart(cartId,foodName,foodPrice));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return carts;
      
    }
        public List <Cart> selectAllCarts2()  {
        List <Cart> carts = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ALL_CARTS2);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            String cartId = rs.getString("cart_id");
            String foodName = rs.getString("food_name");
            String foodPrice=rs.getString("food_price");
             carts.add(new Cart(cartId,foodName,foodPrice));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return carts;
      
    }
        
        
        
        
        public boolean deleteCart(String cartId) throws SQLException {
        boolean rowDeleted;
         
        try(Connection connection= getConnection();
         
        PreparedStatement statement = connection.prepareStatement(DELETE_CARTS_SQL); ) {
        statement.setString(1, cartId);
        rowDeleted=statement.executeUpdate() >0; 
        
                }
        return rowDeleted;
    
    
}
        
     public boolean updateCart (Cart cart) throws SQLException {
        boolean rowUpdated;
        
         try(Connection connection = getConnection(); PreparedStatement statement=
                connection.prepareStatement(UPDATE_CARTS_SQL);) {
             
         
       
        statement.setString(1, cart.getFoodName());
        statement.setString(4, cart.getFoodPrice());
        statement.setString(5, cart.getCartId());
         
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
