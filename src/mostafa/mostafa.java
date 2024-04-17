package mostafa;

// Interface for objects that can be assessed
interface Assessable {
    void assess();
}

// Abstract class representing a generic user in the system
abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    abstract void displayInfo();
}

// Concrete class representing a student, inheriting from User and implementing
// Assessable
class Student extends User implements Assessable {
    private int studentId;

    public Student(String name, String email, int studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Email: " + email + ", ID: " + studentId);
    }

    @Override
    public void assess() {
        System.out.println(name + " is taking a quiz.");
    }
}

// Concrete class representing an instructor, inheriting from User
class Instructor extends User {
    public Instructor(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Instructor Name: " + name + ", Email: " + email);
    }
}

// Abstract class representing a generic course
abstract class Course implements Comparable<Course> {
    protected String title;

    public Course(String title) {
        this.title = title;
    }

    abstract void displayCourseInfo();

    // Implementing the compareTo method to allow sorting of courses by title
    @Override
    public int compareTo(Course other) {
        return this.title.compareTo(other.title);
    }
}

// Concrete class representing a specific type of course, inheriting from Course
class MathCourse extends Course {
    public MathCourse(String title) {
        super(title);
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Math Course: " + title);
    }
}

// Another concrete class representing a different type of course
class ScienceCourse extends Course {
    public ScienceCourse(String title) {
        super(title);
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Science Course: " + title);
    }
}

// Main class to demonstrate the usage of the classes
public class mostafa {
    public static void main(String[] args) {
        // Create instances of courses
        Course math = new MathCourse("Algebra");
        Course science = new ScienceCourse("Biology");

        // Create instances of users
        User student = new Student("John Doe", "john@example.com", 12345);
        User instructor = new Instructor("Jane Smith", "jane@example.com");

        // Display user info
        student.displayInfo();
        instructor.displayInfo();

        // Display course info
        math.displayCourseInfo();
        science.displayCourseInfo();

        // Assess the student
        ((Assessable) student).assess();

        // Sort courses (if there is a collection of courses)
        // Collections.sort(listOfCourses);
    }
}
