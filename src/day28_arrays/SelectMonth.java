package day28_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which month number do you want");
        int mon = input.nextInt();  // 4

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        System.out.println(months[mon - 1]);




    }






}
