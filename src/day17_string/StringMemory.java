package day17_string;

public class StringMemory {
    public static void main(String[] args) {


    String first ="java"; // String literal, in string pool
    String second = new String("java"); // String object , not in string pool,but directly in the heap
        System.out.println(first == second);
     String third = "java";
        System.out.println(first == third);
        String fourth ="Java";
        System.out.println(first == fourth);











    }


}
