package day15_switch;

public class ArmyQualify {

    public static void main(String[] args) {
        int n = 5;
        if(n ==1){
            System.out.println("one");
        }else if(n==2){
            System.out.println("Two");
        }else if(n==3){
            System.out.println("three");
        }else if(n == 4){
            System.out.println("Four");
        }else if(n == 5){
            System.out.println("Five");
        }else{
            System.out.println("invalid number");
        }

        System.out.println("---------------------------------------------");

    switch (n) {
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("Three");
            break;
        case 4:
            System.out.println("Four");
            break;
        case 5:
            System.out.println("Five");
            break;
        default:
            System.out.println("Invalid number from switch");
            break;
    }




    }





}
