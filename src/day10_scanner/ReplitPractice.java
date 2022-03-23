package day10_scanner;

import java.util.Scanner;

public class ReplitPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the patient portal! \n Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your email");
        String email = input.next();
        input.nextLine();

        System.out.println("Enter your street");
        String street = input.next();

        System.out.println("Enter your city");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = input.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = input.nextLong();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your height");
        double height =input.nextDouble();

        System.out.println("Enter your weight");
        double weight =input.nextDouble();

        System.out.println("Are you married");
        boolean isMarried = input.nextBoolean();
        input.nextLine();

        String address = street + city + state + zipCode;
        String fullName = firstName + lastName;
        long contact = workPhoneNumber + personalPhoneNumber;
        System.out.println("Patient personal information");
        System.out.println("Full name:" + fullName );
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact + email);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height);
        System.out.println("Weight: " + weight + "pounds");
        System.out.println("Married: " + isMarried );



    }







}
