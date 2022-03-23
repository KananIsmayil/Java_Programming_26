package day_05variables;

public class EmployeeInfo {
    public static void main(String[] args) {

        String name = "Obama";
        String lastName = "Barack";
        String gender = "Male";
        char suite = 'D';
        int age = 55;
        String companyName = "White House";
        String workSchedule = "full time";
        String jobTitle = "president";
        double salary = 25000;
        int numberOfPto = 17;
        boolean isFullTime = true;
        boolean isMarried = false;


        String fullDetails = "Emloyment information for " + name + " " + lastName + ".\n" + jobTitle + " at " + companyName + " currently " + age + " years old. \n"
                + companyName + " is located in suite " + suite + ". This year salary comes to $" + salary;

        System.out.println(fullDetails);




    }



}
