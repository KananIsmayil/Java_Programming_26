package day_42_custom_class;

public class UsingAnimal {

    public static void main(String[] args) {

        Animal bird = new Animal();
        bird.population = 10000000;
        bird.species = "Bird";

        System.out.println(bird);
        System.out.println(bird.toString()); // no how we will use it


    }



}
