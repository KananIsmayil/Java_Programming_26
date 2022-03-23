package day06_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {

        //add a main method
        //declare and assign these variables:
        //
        //   type of pizza,  the number of slices,  the number of people eating
        //
        //calculate how many slices each person will get
        //calculate how many slices are left over
        //
        //Sample print statement:
        //
        //   We ordered  with 8 slices, 4 people ate 2 slices each with 0 left over

        String pizzaType = "Cheese pizza";
        int numberOfSlicesPizza = 8;
        int numberOfEatingPeople= 4;
        int division = numberOfSlicesPizza/numberOfEatingPeople;
        int remainder=numberOfSlicesPizza % numberOfEatingPeople;

        System.out.println("We ordered pizza with "+numberOfSlicesPizza + " slices, "+ numberOfEatingPeople +" " +
                "people ate "+division+ " slices each with " + remainder + " left over"   );





    }










}
