/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.servlets;
import com.deliver.eat.dao.CartDao;
import com.deliver.eat.dao.RestaurantDao;

import com.deliver.eat.dao.OrderDao;
import com.deliver.eat.entities.Cart;
import com.deliver.eat.entities.Cart2;

import com.deliver.eat.entities.Order;
import com.deliver.eat.entities.Restaurant;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */@MultipartConfig
@WebServlet("/")
public class DelivereatServlet extends HttpServlet {

private donateDAO donateDao;
private RestaurantDao restaurantDao;
private OrderDao orderDao;
private CartDao cartDao;

   public void init() {
       donateDao = new donateDAO();
       restaurantDao = new RestaurantDao();
       orderDao=new OrderDao();
       cartDao = new CartDao();
   }
   
       
    
  
    @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
     
        doGet(request, response);
    }
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
 
        try {
            switch (action) {
            case "/new":
                showNewForm(request, response);
                break;
            case "/insert":
                insertDonate(request, response);
                break;
            case "/delete":
                deleteDonate(request, response);
                break;
            case "/edit":
                /*showEditForm(request, response);
                break;*/
            case "/update":
                updateDonate(request, response);
                break;
                
                 case "/newRest":
                showNewFormRest(request, response);
                break;
            case "/insertRest":
                insertRestaurant(request, response);
                break;
            case "/deleteRest":
                deleteRestaurant(request, response);
                break;
            case "/editRest":
                showEditFormRest(request, response);
                break;
            case "/updateRest":
                updateRestaurant(request, response);
                break;
                
                 case "/newOrder":
                showNewFormOrder(request, response);
                break;
            case "/insertOrder":
                insertOrder(request, response);
                break;
            case "/deleteOrder":
                deleteOrder(request, response);
                break;
                case "/deleteOrder1":
                deleteOrder1(request, response);
                break;
            /*case "/editOrder":
                showEditFormOrder(request, response);
                break;
            case "/updateOrder":
                updateOrder(request, response);
                break;
                
                case "/editOrder2":
                showEditFormOrder2(request, response);
                break;
                
            case "/updateOrder2":
                updateOrder2(request, response);
                break;
                
                case "/newCart":
                showNewFormCart(request, response);
                break;
            case "/insertCart":
                insertCart(request, response);
                break;
            case "/deleteCart":
                deleteCart(request, response);
                break;
                
                 case "/deleteCart2":
                deleteCart2(request, response);
                break;
                
            case "/editCart":
                showEditFormCart(request, response);
                break;
                
            case "/updateCart":
                updateCart(request, response);
                break;
                
             case "/listRest":
                listRestaurant(request, response);
                break;*/
                
             case "/listDonate":
                listDonate(request, response);
                break;
               
             /*case "/listOrder":
                listOrder(request, response);
                break;
                
                case "/listOrder2":
                listOrder2(request, response);
                break;
                
                 case "/listCart":
                listCart(request, response);
                break;
                
                 case "/addCart?id=F001":
                addtoCart (request, response);
                break;*/
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
   
    private void listDonate(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List <donate> listDonate= donateDao.selectAllDonates();
        request.setAttribute("listDonate", listDonate);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Food_List.jsp");
        dispatcher.forward(request, response);
    }
    
     private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("FoodForm.jsp");
        dispatcher.forward(request, response);
    }
     
     
     /*private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String foodId = request.getParameter("food_id");
       Food existingFood = foodDao.selectFood(foodId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("FoodForm.jsp");
        request.setAttribute("food", existingFood);
        dispatcher.forward(request, response);
 
    }
      private void showEditFormOrder(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int orderId =Integer.parseInt(request.getParameter("order_id"));
        Order existingOrder = orderDao.selectOrder(orderId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("OrderForm.jsp");
        request.setAttribute("order", existingOrder);
        dispatcher.forward(request, response);
 
    }
      
       private void showEditFormOrder2(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int orderId =Integer.parseInt(request.getParameter("order_id"));
        Order existingOrder = orderDao.selectOrder(orderId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("OrderFormDeliveryMen.jsp");
        request.setAttribute("order", existingOrder);
        dispatcher.forward(request, response);
 
    }*/
     
    private void insertDonate(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int stud_id = Integer.parseInt(request.getParameter("stud_id"));
            String give_name=request.getParameter("give_name");
            String give_cond = request.getParameter("give_cond");
            int give_qty = Integer.parseInt(request.getParameter("give_qty"));
 
       donate donate = new donate (stud_id, give_name, give_cond,give_qty);
       donateDao.insertDonate(donate);
        response.sendRedirect("listDonate");
    } 
    
    
     private void updateDonate(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String give_name=request.getParameter("give_name");
        String give_cond = request.getParameter("give_cond");
        int give_qty = Integer.parseInt(request.getParameter("give_qty"));
 
        donate donate = new donate(give_name, give_cond, give_qty);
        donateDao.updateDonate(donate);
        response.sendRedirect("listDonate");
    }
     
     private void deleteDonate(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
         int give_id = Integer.parseInt(request.getParameter("give_id"));
 
        
        donateDao.deleteDonate(give_id);
        response.sendRedirect("listDonate");
 
    } 
     
     protected void listRestaurant2(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        restaurantDao = new RestaurantDao();
 
        List<Restaurant> listRestaurant = restaurantDao.selectAllRestaurants();
        request.setAttribute("listRestaurant", listRestaurant);
        RequestDispatcher dispatcher = request.getRequestDispatcher("FoodForm.jsp");
        dispatcher.forward(request, response);
    }
     
     private void listRestaurant(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List <Restaurant> listRestaurant = restaurantDao.selectAllRestaurants();
        request.setAttribute("listRestaurant", listRestaurant);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Restaurant_List.jsp");
        dispatcher.forward(request, response);
    }
   
   private void showNewFormRest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("RestaurantForm.jsp");
        dispatcher.forward(request, response);
    }
   
   
   private void showEditFormRest(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String restId = request.getParameter("rest_id");
        Restaurant existingRestaurant = restaurantDao.selectRestaurant(restId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("RestaurantForm.jsp");
        request.setAttribute("restaurant", existingRestaurant);
        dispatcher.forward(request, response);
 
    }
    private void insertRestaurant(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        String restId=request.getParameter("rest_id");
        String restName = request.getParameter("rest_name");
        String restAddr = request.getParameter("rest_addr");
        String restContact = request.getParameter("rest_contact");
 
        Restaurant newRestaurant = new Restaurant(restId,restName,restAddr,restContact);
        restaurantDao.insertRestaurant(newRestaurant);
        
        response.sendRedirect("listRest");
    }
    
    
    
    private void updateRestaurant(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String restId = request.getParameter("rest_id");
        String restName = request.getParameter("rest_name");
        String restAddr = request.getParameter("rest_addr");
        String restContact = request.getParameter("rest_contact");
        
 
         Restaurant restaurant = new Restaurant(restId,restName,restAddr,restContact);
        restaurantDao.updateRestaurant(restaurant);
        response.sendRedirect("listRest");
    }
    
    private void deleteRestaurant(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
         String restId = request.getParameter("rest_id");
 
        
        restaurantDao.deleteRestaurant(restId);
        response.sendRedirect("listRest");
 
    }
    
   
        private void listOrder(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List <Order> listOrder = orderDao.selectAllOrders();
        request.setAttribute("listOrder", listOrder);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Order_List.jsp");
        dispatcher.forward(request, response);
    }
        
        private void listOrder2(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List <Order> listOrder = orderDao.selectAllOrders();
        request.setAttribute("listOrder", listOrder);
        RequestDispatcher dispatcher = request.getRequestDispatcher("OrderProfile_Delivered.jsp");
        dispatcher.forward(request, response);
    }
    
    
    private void showNewFormOrder(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("OrderForm.jsp");
        dispatcher.forward(request, response);
    }
    
   
    
     private void insertOrder(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
         
      
        int cartId= Integer.parseInt(request.getParameter("cart_id"));
        int custId=Integer.parseInt(request.getParameter("custId"));
        
        String totalAmount=request.getParameter("total_amount");
        String orderDate=request.getParameter("order_date");
        String orderTime= request.getParameter("order_time");
        String status= request.getParameter("status");
        String deliveryMen=request.getParameter("deliveryMen");
        String deliv_addr=request.getParameter("deliv_addr");
        String contact_no=request.getParameter("contact_no");
        String payment_method=request.getParameter("payment_method");
        String card_no=request.getParameter("card_no");
        
       Order newOrder = new Order(cartId,custId,totalAmount,orderDate,orderTime,status,deliveryMen,deliv_addr,contact_no,payment_method,card_no);
       orderDao.insertOrder(newOrder);
       response.sendRedirect("listOrder");
    } 
    
    
    private void updateOrder(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        int orderId =Integer.parseInt(request.getParameter("order_id"));
        int cartId= Integer.parseInt(request.getParameter("cart_id"));
        int custId=Integer.parseInt(request.getParameter("custId"));
        String totalAmount=request.getParameter("total_amount");
        String orderDate=request.getParameter("order_date");
        String orderTime= request.getParameter("order_time");
        String status= request.getParameter("status");
        String deliveryMen=request.getParameter("deliveryMen");
        String deliv_addr=request.getParameter("deliv_addr");
        String contact_no=request.getParameter("contact_no");
        String payment_method=request.getParameter("payment_method");
        String card_no=request.getParameter("card_no");
 
        Order order = new Order(orderId,cartId,custId,totalAmount,orderDate,orderTime,status,deliveryMen,deliv_addr,contact_no,payment_method,card_no);
        orderDao.updateOrder(order);
        response.sendRedirect("listOrder");
    }
    
     private void updateOrder2(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        int orderId =Integer.parseInt(request.getParameter("order_id"));
        int cartId= Integer.parseInt(request.getParameter("cart_id"));
        int custId=Integer.parseInt(request.getParameter("custId"));
        String totalAmount=request.getParameter("total_amount");
        String orderDate=request.getParameter("order_date");
        String orderTime= request.getParameter("order_time");
        String status= request.getParameter("status");
        String deliveryMen=request.getParameter("deliveryMen");
        String deliv_addr=request.getParameter("deliv_addr");
        String contact_no=request.getParameter("contact_no");
        String payment_method=request.getParameter("payment_method");
        String card_no=request.getParameter("card_no");
 
        Order order = new Order(orderId,cartId,custId,totalAmount,orderDate,orderTime,status,deliveryMen,deliv_addr,contact_no,payment_method,card_no);
        orderDao.updateOrder(order);
        response.sendRedirect("listOrder2");
    }
    
    
    
     private void deleteOrder(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int orderId =Integer.parseInt(request.getParameter("order_id"));
 
        
        orderDao.deleteOrder(orderId);
        response.sendRedirect("OrderProfile.jsp");
 
    } 
    
      private void deleteOrder1(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int orderId =Integer.parseInt(request.getParameter("order_id"));
 
        
        orderDao.deleteOrder(orderId);
        response.sendRedirect("OrderProfile_1.jsp");
 
    } 
     
     private void listCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List <Cart> listCart = cartDao.selectAllCarts();
        request.setAttribute("listCart", listCart);
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);
    }
    
     private void showNewFormCart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);
    }
     
     
     private void showEditFormCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String cartId = request.getParameter("cart_id");
       Cart existingCart = cartDao.selectCart(cartId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        request.setAttribute("cart", existingCart);
        dispatcher.forward(request, response);
 
    }
     
    private void insertCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
       String cartId=request.getParameter("cart_id");
       String foodName = request.getParameter("food_name");
       String foodPrice = request.getParameter("food_price");
 
       Cart newCart = new Cart(cartId,foodName,foodPrice);
       cartDao.insertCart(newCart);
        response.sendRedirect("listCart");
    } 
    
    
     private void updateCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String cartId = request.getParameter("cart_id");
        String foodName = request.getParameter("food_name");
        String foodPrice=request.getParameter("food_price");
 
        Cart cart = new Cart(cartId,foodName,foodPrice);
        cartDao.updateCart(cart);
        response.sendRedirect("listCart");
    }
     
     private void deleteCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
         String cartId = request.getParameter("cart_id");
 
        
        cartDao.deleteCart(cartId);
        response.sendRedirect("FoodCart2.jsp");
 
    } 
      
     
       private void deleteCart2(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
         String cartId = request.getParameter("cart_id");
 
        
        cartDao.deleteCart(cartId);
        response.sendRedirect("DeliveryMenCartList.jsp");
 
    } 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     private void addtoCart (HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
    
        response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out = response.getWriter()) {
            
           ArrayList<Cart2> cartList = new ArrayList<>();
           
           String foodId =request.getParameter("food_id");
           Cart2 cm = new Cart2 ();
           cm.setFoodId(foodId);
           cm.setQuantity(1);
           
           
           
           HttpSession session = request.getSession();
           ArrayList<Cart2> cart_list =(ArrayList<Cart2>) session.getAttribute("cart-list");
           
           if(cart_list == null) {
                cartList.add(cm);
                session.setAttribute("cart-list", cartList);
                out.println("session created and added the list");
                
           } else {
               cartList = cart_list;
               boolean exist = false;
               
               
               
               
               
               for(Cart2 c : cart_list) {
                   if(c.getFoodId() == foodId) {
                       exist = true;
                       out.println("product exist");
                   }
                   
               }
               if(!exist) {
                       cartList.add(cm);
                       out.println("product added");
                       response.sendRedirect("FoodProfile.jsp");
                   }
           }
           
           for(Cart2 c: cart_list) {
               out.println(c.getFoodId());
           }
           
}

}

}