package day15_switch;

import java.util.Scanner;

public class Author {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String genre ="";
        int pageLengh = 0;
        int profit = 0;
        int sequels=0;
        int countries =0;
        boolean notValid =true;
          System.out.println("PLease enter Genre");
          String genreInfo = input.nextLine();
          switch (genre){
              case "Fantasy":
                  pageLengh = 500;
                  profit = 1_000_000;
                  sequels = 5;
                  countries = 50;
                  break;
              case "Detective":
                  pageLengh = 350;
                  profit = 700_000;
                  sequels = 3;
                  countries = 45;
                  break;
              case "Science Fiction":
                  pageLengh = 720;
                  profit = 900_500;
                  sequels = 4;
                  countries = 30;
                  break ;
              case "short story":
                  pageLengh = 150;
                  profit = 300_000;
                  sequels = 1;
                  countries = 40;
                  break;
              default:
                  System.out.println("invalid information");
                  notValid = false;


          }

if (notValid){
    System.out.println("genre - "+genre+"\n page lengh- "+pageLengh+"");
}

    }




}
