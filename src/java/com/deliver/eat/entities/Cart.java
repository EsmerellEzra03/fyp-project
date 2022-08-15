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
public class Cart  {
   static int cartNo =0 ;
   protected String cartId;
   protected String foodName;
   protected String foodPrice;

    public Cart() {
    }

    public Cart(String foodName, String foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public Cart(String cartId, String foodName, String foodPrice) {
        this.cartId = cartId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public static int getCartNo() {
        return cartNo;
    }

    public static void setCartNo(int cartNo) {
        Cart.cartNo = cartNo;
    }

    
    
    
}
