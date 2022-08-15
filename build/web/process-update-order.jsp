<%-- 
    Document   : process-update-order
    Created on : Jul 7, 2021, 9:38:23 PM
    Author     : User
--%>

<%@page import="com.deliver.eat.entities.Order"%>
<%@page import="com.deliver.eat.dao.OrderDao"%>
<%@page import="com.deliver.eat.DB.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Order</title>
    </head>
    
    <% 
        
      
    int orderId = Integer.parseInt(request.getParameter("order_id"));
    
    ConnectionProvider database = new ConnectionProvider();
    OrderDao orderDao = new OrderDao();
    Order order = orderDao.retrieveOneOrder(orderId);
    %>
    
  <body style="font-family: century gothic; max-width:600px; background-color:blanchedalmond">
        <div style="background-color:yellowgreen; padding:10px; text-align:center;">
        
        </div>
        
        <div>
            <fieldset><legend><b>Update Order</b></legend>
                <form action="process-update-order2.jsp" method="get">
                    <input type="text" name="order_id" value="<%=orderId%>"/>
                    <table>
                        <tbody>
                            <tr>
                                <td><label>Order Date:</label></td>
                                <td><input type="date" name="order_date" value="<%=order.getOrderDate()%>"/></td>
                                
                            </tr>
                            
                            <tr>
                                <td><label>Order Time:</label></td>
                                <td><input type="time" name="order_time" value="<%=order.getOrderTime()%>"/></td>
                                
                            </tr>
                            
                             
                            <tr>
                                <td><label>Cart Id:</label></td>
                                <td><input type="text" name="cart_id" value="<%=order.getCartId()%>"/></td>
                                
                            </tr><!-- comment -->
                            
                            <tr>
                                <td><label>Customer Id</label></td>
                                <td><input type="text" name="custId" value="<%=order.getCustId()%>"/></td>
                            </tr>
                            
                             
                            <tr>
                                <td><label>Total Amount</label></td>
                                <td><input type="text" name="total_amount" value="<%=order.getTotalAmount()%>"/></td>
                                
                            </tr>
                            
                             <tr>
                                <td><label>Status</label></td>
                                <td><input type="text" name="status" value="<%=order.getStatus()%>"/></td>
                                
                            </tr>
                            
                              <tr>
                                <td><label>DeliveryMen</label></td>
                                <td><input type="text" name="deliveryMen" value="<%=order.getDeliveryMen()%>"/></td>
                                
                            </tr>
                            
                            <tr>
                                <td><label></label></td>
                                <td><input type="submit" value="Update" style="font-family:century gothic;"/>
                                <input type="button" value="Cancel" style="font-family:century gothic;" 
                                           onclick="window.location.href=''; return false;"/>
                                </td>
                                
                                  
                            </tr>
                        </tbody>
                    </table>
                </form>
            </fieldset>
        </div>
    </body>  
    
    
    
    
    
    
    <body>
        
    </body>
</html>
