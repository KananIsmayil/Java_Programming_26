package day29_arrays;

import java.util.Arrays;

public class BankAccount {
    public static void main(String[] args) {
        String [] bankAccountOne = {"Brad Smith", "Checking" , "100219482", "100,000,000"};
        System.out.println(bankAccountOne.length);
        System.out.println("Whole Array " + Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Account type: " + bankAccountOne[1]);
        System.out.println("Account number: " + bankAccountOne[2]);
        System.out.println("Balance " + bankAccountOne[3]);



    }



}
