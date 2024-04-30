package Material;

import java.util.ArrayList;
import accounts.Mentor;
import accounts.Student;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Course implements Comparable<Course>, enrolable {

    static int no_courses = 0;
    private String title;
    private Mentor owner;
    private int code;
    private int price;
    private int week_duration;
    private String outcomes;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private boolean published;

    public Course(String title, Mentor owner, int price, int week_duration, String Outcomes) {
        this.title = title;
        this.owner = owner;
        this.code = no_courses;
        this.price = price;
        this.week_duration = week_duration;
        this.outcomes = Outcomes;
        no_courses++;
        owner.getOwnedcourses().add(this);

    }

    public int chaptersCount() {
        return chapters.size();
    }

    public boolean getPublished() {
        return this.published;
    }

    public void setPublished(boolean x) {
        this.published = x;
    }

    public int studentsCount() {
        return students.size();
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public static int getNo_courses() {
        return no_courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getCode() {
        return code;
    }

    public String getOutcomes() {
        return outcomes;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getWeek_duration() {
        return week_duration;
    }

    public String getOwner() {
        return owner.toString();
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setOutcomes(String outcomes) {
        this.outcomes = outcomes;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeek_duration(int week_duration) {
        this.week_duration = week_duration;
    }

    public void setOwner(Mentor owner) {
        this.owner = owner;
    }

    public static void setNo_courses(int no_courses) {
        Course.no_courses = no_courses;
    }

    public Chapter getChapter(String title) {
        Chapter c = null;
        for (Chapter chapter : chapters) {
            if (chapter.getTitle() == title) {
                c = chapter;
            } else {
                c = null;
            }
        }
        return c;
    }

    public void addChapters(Chapter c) {
        this.chapters.add(c);
        c.setCourse(this);
    }

    public void addChapters(ArrayList<Chapter> c) {
        this.chapters.addAll(c);
        for (Chapter chapter : c) {
            chapter.setCourse(this);
        }
    }

    public static ArrayList<Course> sortCourses(ArrayList<Course> courses, char mode) {
        ArrayList<Course> innercourses = courses;
        switch (mode) {
            case 't':
                Collections.sort(innercourses, Comparator.comparing(Course::getTitle));
                break;
            case 'p':
                Collections.sort(innercourses, Comparator.comparing(Course::getPrice));

                break;
            case 'd':
                Collections.sort(innercourses, Comparator.comparing(Course::getWeek_duration));

                break;
            case 'c':
                Collections.sort(innercourses, Comparator.comparing(Course::chaptersCount));

                break;
            case 's':
                Collections.sort(innercourses, Comparator.comparing(Course::studentsCount));
                break;

            default:
                Collections.sort(innercourses, Comparator.comparing(Course::getCode));
                break;
        }
        return innercourses;
    }

    @Override
    public int compareTo(Course course) {
        if (this.code > course.code) {
            return 1;
        } else if (this.code < course.code) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public void enroll(Student s) {
        if (this.getPublished() == true) {
            this.getStudents().add(s);
            s.getEnrolledcourses().add(this);
        }
    }

    @Override
    public String toString() {

        return ("Course: " + this.title + "\n" +
                "Code: " + this.code + "\n" +
                "Price: " + this.price + "\n" +
                "Owner: " + this.owner.getUsername() + "\n" +
                "Duration: " + this.week_duration + "\n" +
                "Chapters: " + this.chapters.size() + "\n" +
                "Students: " + this.students.size() + "\n" +
                "");
    }
}
