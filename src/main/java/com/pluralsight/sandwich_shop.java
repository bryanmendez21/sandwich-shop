package com.pluralsight;

import java.util.Scanner;

public class sandwich_shop {
    public static void main(String[] args) {
        // Variables
        double regular = 5.45;
        double large = 8.95;

        // Inputs
        Scanner shop_questions = new Scanner(System.in);

        System.out.println("Which size sandwich would you like (1) REGULAR: $5.45 or (2) Large: $8.95 input number: ");
        int size_chosen = shop_questions.nextInt();

        System.out.println("How old are you: ");
        int age = shop_questions.nextInt();

        // Logic
        if (size_chosen == 1){
            // Regular logic
            if (age <= 17){
                double price_17and_younger = regular * .90;
                System.out.println("price is: " + price_17and_younger);

            }
            else if (age >= 65){
                double price_65and_older = regular * .80;
                System.out.println("price is: " + price_65and_older);
            }
            else{
                System.out.println("price is: " + regular);
            }
        }
        else if (size_chosen == 2){
            // Large logic
            if (age <= 17){
                double price_17and_younger = large * .90;
                System.out.println("price is: " + price_17and_younger);

            }
            else if (age >= 65){
                double price_65and_older = large * .80;
                System.out.println("price is: " + price_65and_older);
            }
            else{
                System.out.println("price is: " + large);
            }
        }
        else{
            System.out.println("Choose between 1 and 2");
        }





    }
}
