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

//        ArrayList<String> student = new ArrayList<String>();
//        student.add("Derek");
//        student.add("LJ");
//        student.add("Bereket");
//        student.add("Amadou");

        Student student = new Student("Derek", "2342499932");
        Student student1 = new Student("Juan", "1021023939");
        Student student2 = new Student("Andy", "2234345667");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        System.out.println(lengthOfStudentIDIs10(students));
    }

    public static boolean lengthOfStudentIDIs10(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName());
            if (student.getStudentID().length() != 10) {
                return false;
            }
        }
        return true;
    }
}
