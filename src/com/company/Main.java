package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double price = 0;
        System.out.println("Would you like a small, medium or large pizza?");
        String size = input.next();
        try {
            if (size .equalsIgnoreCase("small")){
                price = price + 7.99;
            } else if (size .equalsIgnoreCase("medium")) {
                price = price + 10.99;
            } else if (size .equalsIgnoreCase("large")) {
                price = price + 13.99;
            }
        }catch (Exception e){
            System.out.println("error" + e);
            break

        }
        System.out.println("Would you like any toppings?");
        String WantToppings = input.next();
        int topping_amount = 0;
        ArrayList <String> toppings = new ArrayList <String>();
        while (WantToppings .equals("yes")){
            System.out.println("what toppings would you like?");
            String topping = input.next();
            toppings.add(topping);
            topping_amount = topping_amount + 1;
            if (topping_amount > 2) {
                price = price + 1.25;
            }
            System.out.println("Would you like any more topping?");
            WantToppings = input.next();
        }
        System.out.println(price);
        System.out.print(toppings);





    }
}
