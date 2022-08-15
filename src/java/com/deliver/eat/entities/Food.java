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
public class Food {
    protected String foodId;
    protected String foodName;
    protected String restId;
    protected String foodCategory;
    protected String foodPrice;

    public Food() {
    }

    public Food(String foodName, String restId, String foodCategory, String foodPrice) {
        this.foodName = foodName;
        this.restId = restId;
        this.foodCategory = foodCategory;
        this.foodPrice = foodPrice;
    }

    public Food(String foodId, String foodName, String restId, String foodCategory, String foodPrice) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.restId = restId;
        this.foodCategory = foodCategory;
        this.foodPrice = foodPrice;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getRestId() {
        return restId;
    }

    public void setRestId(String restId) {
        this.restId = restId;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }
    
    
}
