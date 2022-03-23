package day12_if_statements;

public class OverTime {

    public static void main(String[] args) {

        double hourlyRate = 20.5;
        double numberOfHours = 40 ;
        double netPay;

        if (numberOfHours > 40){
            double overtimeHours = numberOfHours - 40;
        netPay = 40 * hourlyRate;
        netPay += overtimeHours * hourlyRate * 1.5;

        } else {
            netPay = numberOfHours * hourlyRate;
        }
        System.out.println("Total net pay is: $" + netPay);



    }






}
