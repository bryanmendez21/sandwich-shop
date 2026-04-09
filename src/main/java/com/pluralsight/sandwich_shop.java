package com.pluralsight;

import java.util.Scanner;

public class sandwich_shop {
    public static void main(String[] args) {
            // Variables
            double regular = 5.45;
            double large = 8.95;
            double base_price = 0;
            double loaded_price_regular = 1.0;
            double loaded_price_large = 1.75;
            double discount = 1.0;

            // Inputs
            Scanner shop_questions = new Scanner(System.in);

            System.out.println("Which size sandwich would you like (1) REGULAR: $5.45 or (2) Large: $8.95 input number: ");
            int size_chosen = shop_questions.nextInt();

            System.out.println("How old are you: ");
            int age = shop_questions.nextInt();
            shop_questions.nextLine();

            System.out.println("do you want your sandwich loaded? (yes/no): ");
            String loaded = shop_questions.nextLine();

            if (age <= 17){
                discount = 0.90;
            }
            else if (age >= 65){
                discount = 0.80;
            }

            // Logic
            if (size_chosen == 1) {
                // Regular logic
                base_price = regular;


                if (loaded.equalsIgnoreCase("yes")){
                    base_price += loaded_price_regular;
                }

                double final_price = base_price * discount;
                System.out.printf("Price is: %.2f" ,final_price);
            }
            else if (size_chosen == 2) {
                // Large logic
                base_price = large;

                if (loaded.equalsIgnoreCase("yes")){
                    base_price += loaded_price_large;
                }

                double final_price = base_price * discount;
                System.out.printf("Price is: %.2f" ,final_price);
            }

            else {
                System.out.println("Choose between 1 and 2");
            }


    }
}
