package day11_if_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SingleIfExamples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");

        int month = input.nextInt();

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");

        }
        if (month == 4 || month == 6 || month ==9 || month == 11 ){
            System.out.println("30 days");

        }
            if(month == 2){
                System.out.println("28 days");
            }






    }

}








