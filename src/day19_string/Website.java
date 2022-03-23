package day19_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the url");
        String url = input.next();//www.google.com
        String website = url.substring(4,10);
        System.out.println(website);
        // url.substring(4,10); doesnt work all inputs because 10 is hardcoded








    }



}
