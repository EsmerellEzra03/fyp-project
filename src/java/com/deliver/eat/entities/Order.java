/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deliver.eat.entities;

/**
 *
 * @author User
 */
public class Order {
    protected int orderId;
    protected int cartId;
    protected int custId;
    protected String totalAmount;
    protected String orderDate;
    protected String orderTime;
    protected String status;
    protected String deliveryMen;
    protected String deliv_addr;
    protected String contact_no;
    protected String payment_method;
    protected String card_no;

    public Order() {
    }

    public Order(int cartId, int custId, String totalAmount, String orderDate, String orderTime,String status, String deliveryMen,String deliv_addr,String contact_no,String payment_method,String card_no) {
        
        this.cartId = cartId;
        this.custId = custId;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.orderTime=orderTime;
        this.status=status;
        this.deliveryMen=deliveryMen;
        this.deliv_addr=deliv_addr;
        this.contact_no=contact_no;
        this.payment_method=payment_method;
        this.card_no=card_no;
    }

    public Order(int orderId, int cartId, int custId, String totalAmount, String orderDate,String orderTime,String status, String deliveryMen,String deliv_addr,String contact_no,String payment_method,String card_no) {
        this.orderId = orderId;
        this.cartId = cartId;
        this.custId = custId;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.orderTime=orderTime;
        this.status=status;
        this.deliveryMen=deliveryMen;
         this.deliv_addr=deliv_addr;
        this.contact_no=contact_no;
        this.payment_method=payment_method;
        this.card_no=card_no;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryMen() {
        return deliveryMen;
    }

    public void setDeliveryMen(String deliveryMen) {
        this.deliveryMen = deliveryMen;
    }

    public String getDeliv_addr() {
        return deliv_addr;
    }

    public void setDeliv_addr(String deliv_addr) {
        this.deliv_addr = deliv_addr;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    
}