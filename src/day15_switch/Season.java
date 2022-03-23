package day15_switch;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNumber = input.nextInt();
        String season = "";

        switch (monthNumber){
            case 12 :
            case 1:
            case 2:
                season = "It is winter, so wear a winter coat, gloves and a hat";
                 break;
            case 3:
            case 4:
            case 5:
                season = "It is spring you can to go picnic";
                break;
            case 6:
            case 7:
            case 8:
                season = "It is summer go swimming";
            break;
            case 9:
            case 10:
            case 11:
                season = "It is fall, I like this season";




        }
        System.out.println(season);

       /* Season Finder

        declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
        12, 1, 2 	--> Winter
        3, 4, 5 	--> Spring
        6, 7, 8 	--> Summer
        9, 10, 11 	--> Fall

        Ex:
        2
        It is winter, so wear a winter coat, gloves and a hat */


    }






}
