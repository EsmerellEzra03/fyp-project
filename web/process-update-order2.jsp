<%-- 
    Document   : process-update-order2
    Created on : Jul 7, 2021, 10:19:58 PM
    Author     : User
--%>

<%@page import="com.deliver.eat.entities.Order"%>
<%@page import="com.deliver.eat.dao.OrderDao"%>
<%@page import="com.deliver.eat.DB.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>

<!DOCTYPE html>
<html>
    <head>
        <title>DeliverEat</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Task 2: Update Student</title>
    </head>
    <body style="font-family:century gothic;">
        
        <% 
            
        int orderId = Integer.parseInt(request.getParameter("order_id"));
        int cartId = Integer.parseInt(request.getParameter("cart_id"));
        int custId = Integer.parseInt(request.getParameter("custId"));
        String orderDate = request.getParameter("order_date");
        String orderTime= request.getParameter("order_time");
        String totalAmount= request.getParameter("total_amount");
        String status= request.getParameter("status");
        String deliveryMen= request.getParameter("deliveryMen");
        
        ConnectionProvider database = new ConnectionProvider();
        OrderDao orderDao = new OrderDao();
        Order order = new Order();
        
        
        order.setOrderId(orderId);
        order.setCartId(cartId);
        order.setCustId(custId);
        order.setOrderDate(orderDate);
        order.setOrderTime(orderTime);
        order.setTotalAmount(totalAmount);
        order.setStatus(status);
        order.setDeliveryMen(deliveryMen);
        
       int result = orderDao.updateOrder1(order);
        
        if (result > 0) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert(\"Success Update the Record\")");
            out.println("</script>");
            RequestDispatcher rd = request.getRequestDispatcher("OrderProfile.jsp");
            rd.include(request,response);
            
        }
        
      
        %>
        
    </body>
</html>
