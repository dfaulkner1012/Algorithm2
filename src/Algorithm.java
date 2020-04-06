import java.util.ArrayList;

public class Algorithm {
    public static void main(String[] args) {
        /*
            - Create an ArrayList of Student objects that have names, and ID numbers.
            Create a method that loops through each object and returns true if all
            IDs have a length of 10.
            To accomplish this you'll need to create a Student class. Aside form your Main class,
            that should be the only class you need to create.
        */

        ArrayList<String> student = new ArrayList<String>();
        student.add("Derek");
        System.out.println(lengthOfStudentIDIs10("100909090909090909"));
    }

    public static boolean lengthOfStudentIDIs10(String studID) {
        for (int i = 0; i < studID.length(); i++) {
            if (studID.length() < 10) {
                return false;
            }
        }
        return true;
    }
}
