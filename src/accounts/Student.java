package accounts;

import Material.Course;
import java.util.ArrayList;

public class Student extends User {
    private ArrayList<Course> enrolledcourses = new ArrayList<Course>();
    private ArrayList<Course> finishedcourses = new ArrayList<Course>();
    static int no_students;

    public Student(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender, "STUDENT");
        no_students++;
    }

    public ArrayList<Course> getEnrolledcourses() {
        return enrolledcourses;
    }

    public static int getNo_students() {
        return no_students;
    }

    public void setEnrolledcourses(Course c) { // added by me
        c.enroll(this);
        System.out.println("done");
    }

    public void removeEnrolledcourses(Course c) { // added by me
        c.unenroll(this);
    }

    public int getNo_Courses() { // added by me
        return enrolledcourses.size();
    }

    public ArrayList<Course> getFinishedcourses() {
        return finishedcourses;
    }

    public void complete(Course c) {
        try {
            if (c == null) {
                throw new NullPointerException("Course cannot be null");
            }
            int x = getEnrolledcourses().indexOf(c);
            if (x == -1) {
                throw new IllegalArgumentException("Must be enrolled in the course to complete it");
            }
            finishedcourses.add(c);
        } catch (NullPointerException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
