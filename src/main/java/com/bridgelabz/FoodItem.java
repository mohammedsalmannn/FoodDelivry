package com.bridgelabz;

import java.util.function.Predicate;

enum Taste {
    SWEET, SPICY, SALTY;
}

enum FoodType {
    VEG, NON_VEG;
}

enum FoodCategories {
    STATER, MAIN_DISH, JUICE;

    public boolean test(Object o) {
        return false;
    }
}

public class FoodItem {
    private String foodName;
    private FoodType foodType;

    public FoodCategories getFoodCategories() {
        return foodCategories;
    }

    public void setFoodCategories(FoodCategories foodCategories) {
        this.foodCategories = foodCategories;
    }

    private FoodCategories foodCategories;
    private int price;
    private  Taste taste;

    public String getFoodName(String juice) {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", price='" + price + '\'' +
                ", test='" + taste + '\'' +
                '}';
    }
}