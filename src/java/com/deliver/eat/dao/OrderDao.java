/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.dao;

import com.deliver.eat.entities.Order;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class OrderDao {
     Connection connection = null;
    private String jdbcURL="jdbc:mysql://localhost:3306/delivereat";
    private String jdbcUsername="root";
    private String jdbcPassword="admin";
     private int result;
    
    private static final String INSERT_ORDERS_SQL= "INSERT INTO orders (cart_id, custId, total_amount, order_date, order_time, status,deliveryMen, deliv_addr, contact_no, payment_method, card_no) VALUES " +
             "( ?, ?, ?, ?, ?, ?, ?);";
    
    
    private static final String SELECT_ORDER_BY_ID ="select order_id,cart_id, custId,total_amount, order_date, order_time, status, deliveryMen, deliv_addr, contact_no, payment_method, card_no from orders where order_id=?";
    private static final String SELECT_ALL_ORDERS="select * from orders";
    private static final String DELETE_ORDERS_SQL="delete from orders where order_id=?";
    private static final String UPDATE_ORDERS_SQL="update orders set   cart_id=?, custId=?, total_amount=?, order_date=?, order_time=?, status=?, deliveryMen=?, deliv_addr=?, contact_no=?, payment_method=?, card_no=?  where order_id=?;";
    private static final String SELECT_ORDER_ID ="select MAX(order_id) FROM orders";
    private static final String SELECT_ORDER_BY_STATUS="select * from orders where status='Pending'";
    private static final String SELECT_ORDER_BY_STATUS2="select * from orders where status='In Progress/Assigned'";
    private static final String SELECT_ORDER_BY_STATUS3="select * from orders where status='Delivered'";
    private static final String SELECT_ORDER_BY_Customer="select * from orders where custId=?";
    private static final String UPDATE_ORDERSCONFIRMED_SQL="update orders set   status='In Progress/Confirmed'  where order_id=?;";
    private static final String UPDATE_ORDERSDELIVERED_SQL="update orders set  status='Delivered'  where order_id=?;";
    public  OrderDao() {
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
  public void insertOrder (Order order) throws SQLException {
        System.out.println(INSERT_ORDERS_SQL);
        
        try(Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(INSERT_ORDERS_SQL)){
        
   
        preparedStatement.setInt(1, order.getCartId());
        preparedStatement.setInt(2, order.getCustId());
        preparedStatement.setString(3,order.getTotalAmount());
        preparedStatement.setString(4, order.getOrderDate());
        preparedStatement.setString(5, order.getOrderTime());
        preparedStatement.setString(6, order.getStatus());
        preparedStatement.setString(7, order.getDeliveryMen());
        preparedStatement.setString(8, order.getDeliv_addr());
        preparedStatement.setString(9, order.getContact_no());
        preparedStatement.setString(10, order.getPayment_method());
        preparedStatement.setString(11, order.getCard_no());
       
        System.out.println(preparedStatement);
        preparedStatement.executeUpdate();
       
    }catch(SQLException e) {
        printSQLException(e);
    }
    
    }   
  
  
  public Order selectOrder(int orderId) {
       Order order = null;
        try(Connection connection=getConnection();
         
       
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ORDER_BY_ID);) {
        preparedStatement.setInt(1, orderId);
            System.out.println(preparedStatement);
            
            ResultSet rs=preparedStatement.executeQuery();
         
        while (rs.next()) {
            int cartId=rs.getInt("cart_id");
            int custId = rs.getInt("custId");
            String totalAmount = rs.getString("total_amount");
            String orderDate=rs.getString("order_date");
            String orderTime=rs.getString("order_time");
            String status=rs.getString("status");
            String deliveryMen=rs.getString("deliveryMen");
            String deliv_addr=rs.getString("deliv_addr");
            String contact_no=rs.getString("contact_no");
            String payment_method=rs.getString("payment_method");
            String card_no=rs.getString("card_no");
            
            order = new Order (orderId, cartId, custId, totalAmount, orderDate, orderTime, status, deliveryMen, deliv_addr, contact_no, payment_method, card_no);
        }
         
        }catch(SQLException e) {
            printSQLException(e);
        } return order;
    }
  
   public List <Order> selectAllOrders()  {
        List <Order> orders = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ALL_ORDERS);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            int orderId  = rs.getInt("order_id");
            int cartId =rs.getInt("order_id");
            int custId=rs.getInt("custId");
            String totalAmount=rs.getString("total_amount");
            String orderDate=rs.getString("order_date");
            String orderTime=rs.getString("order_time");
            String status=rs.getString("status");
            String deliveryMen=rs.getString("deliveryMen");
            String deliv_addr=rs.getString("deliv_addr");
            String contact_no=rs.getString("contact_no");
            String payment_method=rs.getString("payment_method");
            String card_no=rs.getString("card_no");
      
             orders.add(new Order(orderId,cartId,custId,totalAmount,orderDate,orderTime,status,deliveryMen, deliv_addr, contact_no, payment_method, card_no));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return orders;
      
    }
      
   public List <Order> selectAllOrdersByStatus()  {
        List <Order> orders = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ORDER_BY_STATUS);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            int orderId  = rs.getInt("order_id");
            int cartId =rs.getInt("order_id");
            int custId=rs.getInt("custId");
            String totalAmount=rs.getString("total_amount");
            String orderDate=rs.getString("order_date");
            String orderTime=rs.getString("order_time");
            String status=rs.getString("status");
            String deliveryMen=rs.getString("deliveryMen");
            String deliv_addr=rs.getString("deliv_addr");
            String contact_no=rs.getString("contact_no");
            String payment_method=rs.getString("payment_method");
            String card_no=rs.getString("card_no");
      
             orders.add(new Order(orderId,cartId,custId,totalAmount,orderDate,orderTime,status,deliveryMen, deliv_addr, contact_no, payment_method, card_no));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return orders;
      
    }
   
   public List <Order> selectAllOrdersByStatus2()  {
        List <Order> orders = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ORDER_BY_STATUS2);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            int orderId  = rs.getInt("order_id");
            int cartId =rs.getInt("order_id");
            int custId=rs.getInt("custId");
            String totalAmount=rs.getString("total_amount");
            String orderDate=rs.getString("order_date");
            String orderTime=rs.getString("order_time");
            String status=rs.getString("status");
            String deliveryMen=rs.getString("deliveryMen");
            String deliv_addr=rs.getString("deliv_addr");
            String contact_no=rs.getString("contact_no");
            String payment_method=rs.getString("payment_method");
            String card_no=rs.getString("card_no");
      
             orders.add(new Order(orderId,cartId,custId,totalAmount,orderDate,orderTime,status,deliveryMen, deliv_addr, contact_no, payment_method, card_no));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return orders;
      
    }
   
      public List <Order> selectAllOrdersByStatus3()  {
        List <Order> orders = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ORDER_BY_STATUS3);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            int orderId  = rs.getInt("order_id");
            int cartId =rs.getInt("order_id");
            int custId=rs.getInt("custId");
            String totalAmount=rs.getString("total_amount");
            String orderDate=rs.getString("order_date");
            String orderTime=rs.getString("order_time");
            String status=rs.getString("status");
            String deliveryMen=rs.getString("deliveryMen");
            String deliv_addr=rs.getString("deliv_addr");
            String contact_no=rs.getString("contact_no");
            String payment_method=rs.getString("payment_method");
            String card_no=rs.getString("card_no");
      
             orders.add(new Order(orderId,cartId,custId,totalAmount,orderDate,orderTime,status,deliveryMen, deliv_addr, contact_no, payment_method, card_no));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return orders;
      
    }
   
      public List <Order> selectAllOrdersByCustomer(int custId)  {
        List <Order> orders = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ORDER_BY_Customer);) {
           
          System.out.println(preparedStatement);
         
          preparedStatement.setInt(1, custId);
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            int orderId  = rs.getInt("order_id");
            int cartId =rs.getInt("order_id");
            //int custId=rs.getInt("custId");
            String totalAmount=rs.getString("total_amount");
            String orderDate=rs.getString("order_date");
            String orderTime=rs.getString("order_time");
            String status=rs.getString("status");
            String deliveryMen=rs.getString("deliveryMen");
            String deliv_addr=rs.getString("deliv_addr");
            String contact_no=rs.getString("contact_no");
            String payment_method=rs.getString("payment_method");
            String card_no=rs.getString("card_no");
      
             orders.add(new Order(orderId,cartId,custId,totalAmount,orderDate,orderTime,status,deliveryMen, deliv_addr, contact_no, payment_method, card_no));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return orders;
      
    }
   
   public int getOrderId () {
      int orderId=0;  
     try { 
         
         Connection connection= getConnection(); 
         
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ORDER_ID);
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
        
        while (rs.next()) {
             orderId  = rs.getInt("order_id");
             
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return orderId;
   }
   
   
   
   
  public boolean deleteOrder(int orderId) throws SQLException {
        boolean rowDeleted;
         
        try(Connection connection= getConnection();
         
        PreparedStatement statement = connection.prepareStatement(DELETE_ORDERS_SQL); ) {
        statement.setInt(1, orderId);
        rowDeleted=statement.executeUpdate() >0; 
        
                }
        return rowDeleted;
  
  
  } 
  
  
  public boolean updateOrder(Order order) throws SQLException {
        boolean rowUpdated;
        
         try(Connection connection = getConnection(); PreparedStatement statement=
                connection.prepareStatement(UPDATE_ORDERS_SQL);) {
             
         
       
        statement.setInt(1, order.getCartId());
        statement.setInt(2, order.getCustId());
        statement.setString(3, order.getTotalAmount());
        statement.setString(4, order.getOrderDate()); 
        statement.setString(5, order.getOrderTime()); 
        statement.setString(6, order.getStatus()); 
        statement.setString(7, order.getDeliveryMen());
        statement.setString(8, order.getDeliv_addr());
        statement.setString(9, order.getContact_no());
        statement.setString(10, order.getPayment_method());
        statement.setString(11, order.getCard_no());
        statement.setInt(12, order.getOrderId());
        rowUpdated = statement.executeUpdate() > 0;
        
         }
        return rowUpdated;
    
    
}   
  
  
  public boolean updateOrderStatusConfirmed(Order order) throws SQLException {
        boolean rowUpdated;
        
        
   
         try(Connection connection = getConnection(); 
            PreparedStatement statement= connection.prepareStatement(UPDATE_ORDERSCONFIRMED_SQL);) {
          
              
        rowUpdated = statement.executeUpdate() > 0;
        
         }
        return rowUpdated;
    
    
}   
  
  public boolean updateOrderStatusDelivered(int order_id) throws SQLException {
        boolean rowUpdated;
        
         try(Connection connection = getConnection(); 
                 PreparedStatement statement=
                connection.prepareStatement(UPDATE_ORDERSDELIVERED_SQL);) {
             
        statement.setInt(1, order_id);     
        rowUpdated = statement.executeUpdate() > 0;
        
         }
        return rowUpdated;
    
    
}   
  
  public Order retrieveOneOrder(int orderId) {
  
          Order order= new Order();
  
  try {
      Statement myStatement = connection.createStatement();
      String myQuery = "select * from orders where order_id="+orderId+"";
  
      ResultSet myRs=myStatement.executeQuery(myQuery);
      
      while (myRs.next()) {
          order.setOrderId(myRs.getInt(1));
          order.setCartId(myRs.getInt(2));
          order.setCustId(myRs.getInt(3));
          order.setTotalAmount(myRs.getString(4));
          order.setOrderDate(myRs.getString(5));
          order.setOrderTime(myRs.getString(6));
          order.setStatus(myRs.getString(7));
          order.setDeliveryMen(myRs.getString(8));
          
      }
  
  
  
          } catch (Exception e) {
              System.out.println("Exception is;" +e);
          }
  
  return order;
  
      }
  
   public int updateOrder1(Order order) {
     
        try{
            
            String mySqlQuery= "update orders"
                    + "set cart_id=?, custId=?, total_amount=?, order_date=?, order_time=?, status=?, deliveryMen=?"
                    +"where order_id=?";
            
         
            PreparedStatement myPs=connection.prepareStatement(mySqlQuery);
            
        myPs.setInt(1, order.getCartId());
        myPs.setInt(2, order.getCustId());
       myPs.setString(3, order.getTotalAmount());
       myPs.setString(4, order.getOrderDate()); 
        myPs.setString(5, order.getOrderTime()); 
        myPs.setString(6, order.getStatus()); 
        myPs.setString(7, order.getDeliveryMen()); 
        myPs.setInt(8, order.getOrderId());
            result=myPs.executeUpdate();
                       
        } catch (Exception e) {
            System.out.println("Exception is;" + e);
        }
        return result;
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
