package day_42_custom_class;

public class Coffee {

    double price;
    double size;
    String brand;
    String type;

    public String toString(){
        return type + " from " + brand + " size of " + size + " oz. For a total price of " + price;
    }

    public void drink(){
        System.out.println("Drinking " + type);
    }

    public void refill(double amount){
        System.out.println("Refilling " + amount + " oz of coffee");
        size += amount;
    }




}
