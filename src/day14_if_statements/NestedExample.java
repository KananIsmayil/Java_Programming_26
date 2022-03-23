package day14_if_statements;

public class NestedExample {

    public static void main(String[] args) {
        double price = 30.99;
        boolean hasPrime = false;
        if(hasPrime){
            System.out.println("eligible for 2 day shipping");
        }else{
            if(price >= 25){
                System.out.println("eligible for regular free shipping");
            }else{
                System.out.println("not eligible for free shipping.Shipping fee: 3.99");
            }
        }
    }



}
