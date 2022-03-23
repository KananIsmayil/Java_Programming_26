package day15_switch;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine.Please select of the following:\n\tDrinks\n\tSnacks\n\tGum");
        String selection = input.next();
        String item = "";
        switch (selection){
            case "drinks":
                System.out.println("You choose drinks: press a number:\n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinkNumber = input.nextInt();
                if(drinkNumber == 1){
                    item = "water";
                }else if(drinkNumber == 2){
                    item = "soda";

                }else if (drinkNumber == 3){
                    item = "juice";
                }
                break;
            case "snacks":
                System.out.println("You choose snacks: press a number:\n\t4)chips\n\t5)cookies");
                int snackNumber = input.nextInt();
                if(snackNumber == 4){
                    item = "chips";

                }else if(snackNumber == 5){
                    item = "cookies";
                }
                break;

            case "gum":
                item = "Gummies";
        }


        System.out.println("Vending ......" + item);

    }




}
