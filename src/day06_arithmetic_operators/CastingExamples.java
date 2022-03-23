package day06_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne; // short is smaller than float

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short)num3;


        int a=80;
        float b= 2500;
        a=(int)(a+b);
        float c=a+b;
        System.out.println(a);

        short number5= 15;
        double number7= 65000;
        float number8 = 100;
        number8=(float) (number7+number5);


        double ios =25;
        short apple =(short)ios ;


        byte x=25;
        short y=75;
        int z= x+y;

        short h= 55;
        long t=85;
        long f=t+h;








    }





}
