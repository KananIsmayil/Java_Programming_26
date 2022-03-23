package day08_relational_operators;

public class Update_variables {

    public static void main(String[] args) {

        double giftcard = 200;
        System.out.println("buy item 1 for 100$");
        giftcard -=100.5; // giftcard = giftcard -100;

        System.out.println("Buy item 2 for $40");
        giftcard -= 40;
        System.out.println("Your gift card balance is now: " + giftcard);


    }




}
