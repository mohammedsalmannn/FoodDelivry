package com.bridgelabz;

import java.util.Scanner;

public class Application {

    static Footsore footsore =  new Footsore();
    public static void createSystemMenu(){
        System.out.println("1 Show all the Starter's ");
        System.out.println("2 Show all the Main_Dish ");
        System.out.println("3 Show all the Juice's ");
        System.out.println("4 Prepare Food ");
        System.out.println("5 Delivery Food ");
        System.out.println("Enter your Chocies ");
       Scanner input =  new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice){
            case 1:
                footsore.printStarter();
                break;
            case 2:
                footsore.printMainDish();
                break;
            case 3:
                footsore.printJuice();
                break;
            case 4:
                footsore.printPrepareFood();
                break;
            case 5:
                footsore.printDeliveryFood();
                break;

        }
    }


    private void printStarterItems() {
        footsore.printStarter();

    }

    public static void main(String[] args) {




        Dal dal = new Dal();

        dal.setPrice(100);
        dal.setTaste(Taste.SALTY);

        ChickanTika chickanTika = new ChickanTika();

        chickanTika.setPrice(200);
        chickanTika.setTaste(Taste.SPICY);

        MuttanCaury muttancury = new MuttanCaury();

        muttancury.setPrice(300);
        muttancury.setTaste(Taste.SPICY);


        footsore.add(dal);
        footsore.add(muttancury);
        footsore.add(chickanTika);

        Juice juice =  new Juice();

        juice.setFoodName("juice");
        juice.setPrice(90);

        createSystemMenu();
        //footsore.printFoodItems();
        //footsore.printStarter();
        //footsore.printMainDish();
    }

}


