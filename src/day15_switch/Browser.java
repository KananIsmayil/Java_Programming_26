package day15_switch;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your browser");
        String browser = input.nextLine();
        String url = input.nextLine();
    //String browser = "Chrome";
    //String url = "www.google.com";

    switch (browser){
        case "chrome":
            System.out.println("opening " + url + " in the chrome browser");
            System.out.println("loading...");
            break;
        case "safari":
            System.out.println("opening " + url + " in safari");
            break;

            case "Firefox":
                System.out.println("opening " + url + "in firefox");
                break;
        default:
            System.out.println(browser + " is not a valid browser");

    }






    }





}
