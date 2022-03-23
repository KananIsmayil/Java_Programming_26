package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to starbucks. What size coffee would you like?");
        String size = input.nextLine();
        double price = 0;
        int calories = 0;
        boolean validOrder = true;
        switch (size){
            case "tall":
                price = 2.5;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.5;
                calories =200;
                break;
            default:
                System.out.println("We don't have that size");
        }

        System.out.println("Your order for a " + size + "coffee is $" + price + "and has" + calories + " calories");






    }


}
