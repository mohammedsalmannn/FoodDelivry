package com.bridgelabz;

import java.util.ArrayList;

 class Footsore {

     ArrayList<FoodItem> list = new ArrayList();

     public void add(Dal dal) {
         list.add(dal);
     }

     public void add(MuttanCaury muttanCaury) {
         list.add(muttanCaury);
     }

     public void add(ChickanTika chickanTika) {
         list.add(chickanTika);
     }

//    public void printFoodItems(){
//        for (FoodItem obj :list ){
//            list.stream().filter(FoodCategories.STATER);
//            System.out.println(obj);
//        }
//    }

     public void printStarter() {
         for (FoodItem obj : list) {
             if (obj.getFoodCategories() == FoodCategories.STATER) {
                 System.out.println("Stater items" + obj);

             }
         }
     }

     public void printMainDish() {
         for (FoodItem obj : list) {
             if (obj.getFoodCategories() == FoodCategories.MAIN_DISH) {
                 System.out.println("Main Dish" + obj);


             }
         }
     }

     public void printJuice() {
         for (FoodItem obj : list) {
             if (obj.getFoodCategories() == FoodCategories.JUICE) {
                 System.out.println("Main Dish" + obj);

             }
         }
     }

     public void printPrepareFood() {
         printMainDish();
     }

     public void printDeliveryFood() {

     }
 }