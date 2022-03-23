package day18_string;

import java.util.Scanner;

public class JamesBond {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a username");
        String username = input.next();
        username.toLowerCase();
        System.out.println("please enter a password");
        String password = input.next();
        if(password.length() >= 8 ){
            System.out.println("logged in with " + username);
        }
        System.out.println(username);







    }




}
