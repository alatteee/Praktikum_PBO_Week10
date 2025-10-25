import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // --- TASK 2: ArrayList + Sort by name ---
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1003, "Budi", "Computer Science", "Bandung"));
        students.add(new Student(1001, "Andi", "Information Systems", "Jakarta"));
        students.add(new Student(1005, "Citra", "Mechanical", "Surabaya"));
        students.add(new Student(1002, "Dewi", "Computer Science", "Bandung"));
        students.add(new Student(1004, "Eka", "Electrical", "Bekasi"));

        System.out.println("Sebelum sort:");
        students.forEach(System.out::println);

        // Sort berdasarkan name (A-Z)
        students.sort(Comparator.comparing(Student::getName));

        System.out.println("\nSetelah sort by name:");
        students.forEach(System.out::println);

        // --- TASK 3: Vector + filter department = "Computer Science" ---
        Vector<Student> studentVector = new Vector<>();
        studentVector.add(new Student(2001, "Ayu", "Computer Science", "Jakarta"));
        studentVector.add(new Student(2002, "Rian", "Mechanical", "Bandung"));
        studentVector.add(new Student(2003, "Sinta", "Computer Science", "Depok"));
        studentVector.add(new Student(2004, "Yoga", "Civil", "Bogor"));
        studentVector.add(new Student(2005, "Lina", "Information Systems", "Cimahi"));

        System.out.println("\nMahasiswa di Vector dengan department = Computer Science:");
        for (Student s : studentVector) {
            if ("Computer Science".equalsIgnoreCase(s.getDepartment())) {
                System.out.println(s);
            }
        }
    }
}
