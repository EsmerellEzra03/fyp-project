/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.dao;

import com.deliver.eat.entities.Cart;
import com.deliver.eat.entities.Cart2;
import com.deliver.eat.entities.Food;
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
public class FoodDao {
    Connection connection = null;
    private String jdbcURL="jdbc:mysql://localhost:3306/delivereat";
    private String jdbcUsername="root";
    private String jdbcPassword="admin";
    
    private static final String INSERT_FOODS_SQL= "INSERT INTO fooditem(food_id,food_name,rest_id,food_category,food_price) VALUES " +
             "(?, ?, ?, ?,?);";
    
    
    private static final String SELECT_FOOD_BY_ID ="select food_name,rest_id,food_category, food_price from fooditem where food_id=?";
    private static final String SELECT_ALL_FOODS="select * from fooditem";
    private static final String DELETE_FOODS_SQL="delete from fooditem where food_id=?";
    private static final String UPDATE_FOODS_SQL="update fooditem set food_name=?, rest_id=?, food_category=?, food_price=?  where food_id=?;";

    public  FoodDao() {
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
    
    
    
     public void insertFood (Food food) throws SQLException {
        System.out.println(INSERT_FOODS_SQL);
        
        try(Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(INSERT_FOODS_SQL)){
        
        
        preparedStatement.setString(1, food.getFoodId());
        preparedStatement.setString(2, food.getFoodName());
        preparedStatement.setString(3, food.getRestId());
        preparedStatement.setString(4,food.getFoodCategory());
        preparedStatement.setString(5,food.getFoodPrice());
        preparedStatement.executeUpdate();
       
    }catch(SQLException e) {
        printSQLException(e);
    }
    
    } 
    
      public Food selectFood(String foodId) {
       Food food = null;
        try(Connection connection=getConnection();
         
       
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FOOD_BY_ID);) {
        preparedStatement.setString(1, foodId);
            System.out.println(preparedStatement);
            
            ResultSet rs=preparedStatement.executeQuery();
         
        while (rs.next()) {
            String foodName = rs.getString("food_name");
            String restId = rs.getString("rest_id");
            String foodCategory = rs.getString("food_category");
            String foodPrice= rs.getString("food_price");
           
             
            food = new Food (foodId, foodName, restId, foodCategory, foodPrice);
        }
         
        }catch(SQLException e) {
            printSQLException(e);
        } return food;
    }
     
        public List <Food> selectAllFoods()  {
        List <Food> foods = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ALL_FOODS);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            String foodId = rs.getString("food_id");
            String foodName = rs.getString("food_name");
            String restId = rs.getString("rest_id");
            String foodCategory = rs.getString("food_category");
            String foodPrice=rs.getString("food_price");
             foods.add(new Food(foodId,foodName,restId,foodCategory,foodPrice));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return foods;
      
    }
        
        public boolean deleteFood(String foodId) throws SQLException {
        boolean rowDeleted;
         
        try(Connection connection= getConnection();
         
        PreparedStatement statement = connection.prepareStatement(DELETE_FOODS_SQL); ) {
        statement.setString(1, foodId);
        rowDeleted=statement.executeUpdate() >0; 
        
                }
        return rowDeleted;
    
    
}
        
     public boolean updateFood(Food food) throws SQLException {
        boolean rowUpdated;
        
         try(Connection connection = getConnection(); PreparedStatement statement=
                connection.prepareStatement(UPDATE_FOODS_SQL);) {
             
         
       
        statement.setString(1, food.getFoodName());
        statement.setString(2, food.getRestId());
        statement.setString(3, food.getFoodCategory());
        statement.setString(4, food.getFoodPrice());
        statement.setString(5, food.getFoodId());
         
        rowUpdated = statement.executeUpdate() > 0;
        
         }
        return rowUpdated;
    
    
}   
        
      public List<Cart2> getCartFoods (ArrayList<Cart2> cartList) {
          List <Cart2> foods = new ArrayList<Cart2> ();
          
          try{
          
              if(cartList.size()>0){
                  for(Cart2 item:cartList) {
                      String query = "select * from fooditem where food_id=?";
                      PreparedStatement pst = this.connection.prepareStatement(query);
                      pst.setString(1, item.getFoodId());
                      ResultSet rs = pst.executeQuery();
                      
                      while(rs.next()) {
                          Cart2 row = new Cart2();
                          row.setFoodId(rs.getString("food_id"));
                          row.setFoodName(rs.getString("food_name"));
                          row.setRestId(rs.getString("rest_id"));
                          row.setFoodCategory(rs.getString("food_category"));
                          row.setFoodPrice(rs.getString("food_price"));
                         foods.add(row);
                      }
                      
                  }
              }
              
              
          }catch(Exception e) {
              System.out.println(e.getMessage());
              //e.printStackTrace();
          
         
      } 
        return foods; 
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
