package day14_if_statements;

import java.util.Scanner;

public class NestedPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your want check");
        int year = input.nextInt();
        //int year = 2022;
        String pandemic;
        if(year >= 1346 && year <=1353){
            pandemic = "The black Death";
        }else if(year >= 1665 && year <= 166){
            pandemic = "Great plagoe of London";
        }else if(year >=1770 && year <=1772){
            pandemic = "Russian plague";
        }else if(year >= 1889 && year <=1890){
            pandemic = "Flu pandemic";
        }else if(year == 1916){
            pandemic = "American polio epidemic";
        }else if(year >= 1918 && year <= 1920){
            pandemic = "spanish Flu";
        }else if(year >= 2009 && year <= 2010){
            pandemic = "H1N1 Swine flu pandemic";
        }else if(year >= 2014 && year <= 2016){
            pandemic = "Ebola";
        }else if(year >= 2019 && year <= 2022){
            pandemic = "Covid 19";
        }else{
            pandemic = "No pandemic";
        }
        System.out.println(pandemic);








    }






}
