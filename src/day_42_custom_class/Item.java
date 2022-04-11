package day_42_custom_class;

public class Item {

    String name;
    double price;

    @Override // can ignore, even delete if you want
    public String toString() {
        return "name: '" + name + '\'' +
                ", price: " + price;
    }




}
