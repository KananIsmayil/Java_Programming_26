package day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String address,nameOfOwner, ownersPhoneNumber;
        int numberOfUnits,numberOfWasherAndDryer,lengthOfLease,totalNumberOfResidents,numberOfFloors,numberOfParkingSpots;
        double avgSizeOfUnit,monthlyRent;
        boolean allowsPets, hasPool, nearGasStation, hasBasement, unitsAvialeble, hasAirConditioning,
                wheelChairAccessibility;

        System.out.println("please enter the address");
        address = input.nextLine();
        System.out.println("Please enter the name of the owner");
        nameOfOwner = input.nextLine();
        System.out.println("please enter the " + nameOfOwner + " 's phone number");
        ownersPhoneNumber = input.nextLine();
        System.out.println("please enter the number of units");
        numberOfUnits = input.nextInt();
        System.out.println("please enter number of washers and dryers");
        numberOfWasherAndDryer = input.nextInt();
        System.out.println("please enter the length of the lease");
        lengthOfLease = input.nextInt();
        System.out.println("Please enter the total number of residents");
        totalNumberOfResidents = input.nextInt();
        System.out.println("please enter the number of floors");
        numberOfFloors = input.nextInt();
        System.out.println("please enter the number parking spaces");
        numberOfParkingSpots = input.nextInt();
        System.out.println("Please enter the average size of the units");
        avgSizeOfUnit = input.nextDouble();
        System.out.println("please enter monthly rent");
        double monthlyRentPayment = input.nextDouble();




        int avgNumberOfResidentsPerUnit = totalNumberOfResidents/numberOfUnits;
        int avgNumberOfParkingSpotPerUnit = numberOfParkingSpots/numberOfUnits;
        int avgNumberOfUnitsPerFloor = numberOfUnits/numberOfFloors;





    }





}
