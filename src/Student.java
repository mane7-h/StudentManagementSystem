import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private List<Course> courses;

    public Student(String name, int age, Address address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getDetails() {
        return "Student ID: " + studentId + "\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Address: " + getAddress().toString() + "\n" +
                "Courses Enrolled: " + courses.size();
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void save() {
        // Placeholder for saving
    }

    public void load() {
        // Placeholder for loading
    }
}
