import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // two Student objects
        Student student1 = new Student("Iresha", 22);
        Student student2 = new Student("Riccardo", 29);

        // the array.asList and printing it in console
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        System.out.println("my students information: " + studentList);

        // new Student objects
        Student student3 = new Student("Michele", 24);
        Student student4 = new Student("Andrea", 22);
        Student student5 = new Student("Ilenia",26);
        Student student6 = new Student("Santo", 26);

        // adding the new objects to the arraylist and printing it in console
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        System.out.println(studentList);
    }
    }