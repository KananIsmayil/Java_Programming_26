package day25_recap;

import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = input.next().toLowerCase().trim();
        System.out.println("Enter your last name");
        String lastName = input.next().toLowerCase().trim();

        String id = firstname.substring(0, 1);
        id += lastName.substring(0,1).toUpperCase() + lastName.substring(1, 3);
        id += firstname.length() * 2;
        System.out.println(id);







    }




}
