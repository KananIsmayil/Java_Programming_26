package day29_arrays;

public class Initials {
    public static void main(String[] args) {

        String [] names = {"James Bond", "Eve Rell", "Anna Johnson"};
        for (String str : names) {

            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf(" ") + 1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));
        }

    }




}
