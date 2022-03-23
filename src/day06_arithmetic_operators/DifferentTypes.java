package day06_arithmetic_operators;

public class DifferentTypes {

    public static void main(String[] args) {

        System.out.println(10-5);
        System.out.println(10*5);
        System.out.println(10.0 / 5);
        System.out.println(10./5.0);
        System.out.println((int)(10.0/5.0));

        byte b1 = 10;
        byte b2 = 20;

        int sum =b1 + b2;
        byte sumByte = (byte)(b1 + b2);
        System.out.println(sum);
        System.out.println(sumByte);

    }







}
