import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(String id) {
        for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
            Student s = it.next();
            if (s.getStudentId().equals(id)) {
                it.remove();
            }
        }
    }

    public Student getStudent(String id) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void saveToFile(String f) {
        // Placeholder for file saving
        System.out.println("Saving students to " + f);
    }

    public void loadFromFile(String f) {
        // Placeholder for file loading
        System.out.println("Loading students from " + f);
    }
}
