package day_05variables;

public class Computer {
    public static void main(String[] args) {

    /* Create variables with most appropriate datatypes:

        - brand, processor, ram memory, storage memory, has monitor, has wifi card, description, price, cpu, color, number of monitors, number of usb slots, has usb 3.0

        - Print out all the variables and values of the computer */

        String brand , processor , description , color;
        int storageMemory,cpu,numberOfUsbSlots;
        double numberOfMonitor,price;
        boolean hasMonitor,hasWifiCard,hasUsb3;
        char ramMemory;


        brand = "Dell";
        processor = "intel Core i5";
        description = "Windows 11";
        color = "Silver";
        ramMemory = '8';
        storageMemory = 512;
        cpu = 64;
        numberOfUsbSlots = 3;
        price = 699.99;
        numberOfMonitor = 2;
        hasMonitor = true;
        hasWifiCard = false;
        hasUsb3 = true;

        String fullDetailsOfComputer = brand + "\n" + processor + "\n " + description +" \n" + color +"\n" + ramMemory + "\n" + storageMemory+"GB\n"+ cpu + "\n" +
                numberOfUsbSlots+ "\n$" + price+ "\n"+numberOfMonitor+ "\n" + hasMonitor+ "\n" + hasWifiCard+ "\n" + hasUsb3;


        System.out.println(fullDetailsOfComputer);






    }








}
