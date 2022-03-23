package day06_arithmetic_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

//create a class SalaryCalculator
//add a main method
//declare and assign these variables:
//
//   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
//
//Sample date:
//   100000 (salary)
//   0.08 (state tax rate)
//   0.21 (federal tax rate)
//
//Hint: use tax rates of 0.08 and 0.21 for 8% and 21%
//
//Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes

        double salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double totalStateTax= salary * stateTaxRate;
        double totalFederalTax= salary*federalTaxRate;
        double totalTaxAmount=totalFederalTax+totalStateTax;
        double netSalary = salary-totalTaxAmount;

        System.out.println("Total tax amount " + totalTaxAmount +  "\nSalary after all taxes " + netSalary);











    }



}
