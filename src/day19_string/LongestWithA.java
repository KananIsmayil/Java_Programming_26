package day19_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words:");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();
       int oneLen = wordOne.length();
       int twoLen = wordTwo.length();
       int threeLen = wordThree.length();

        if(wordOne.length() > wordTwo.length() && wordOne.length() > wordThree.length() && wordOne.contains("a")){
            System.out.println(wordOne + "is the biggest with a");
        }else if (wordTwo.contains("a") && wordTwo.length() > wordOne.length());










    }



}
