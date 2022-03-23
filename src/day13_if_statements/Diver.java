package day13_if_statements;

public class Diver {

    public static void main(String[] args) {

    int oxygenLevel = 90;
    if(oxygenLevel >= 90){
        System.out.println("Your tank is full");
    } else if ( oxygenLevel > 80){
        System.out.println("Still okay");
    }else if(oxygenLevel > 70){
        System.out.println("Don't go too far");
    } else if(oxygenLevel > 60){
        System.out.println("Start to head back");
    }else if(oxygenLevel > 50){
        System.out.println("Be carefull now you at 50 %");
    } else {
        System.out.println("Dangerous");
    }








    }









}
