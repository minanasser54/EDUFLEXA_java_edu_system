package Material;

import java.util.ArrayList;
import accounts.Mentor;
import accounts.Student;
import java.util.Collections;
import java.util.Comparator;

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
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;

        if (owner == null) {
            throw new NullPointerException("Owner cannot be null");
        }
        this.owner = owner;

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;

        if (week_duration <= 0) {
            throw new IllegalArgumentException("Week duration must be positive");
        }
        this.week_duration = week_duration;

        this.outcomes = Outcomes;

        this.code = no_courses;
        no_courses++;

        try {
            owner.getOwnedcourses().add(this);
        } catch (NullPointerException e) {
            System.out.println("Owner does not have any courses associated with it");
        }

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
        try {
            for (Chapter chapter : chapters) {
                if (chapter.getTitle().equals(title)) {
                    c = chapter;
                } else {
                    c = null;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Chapters is not initialized");
        }
        return c;
    }

    public void addChapters(Chapter c) {
        try {
            this.chapters.add(c);
            c.setCourse(this);
        } catch (NullPointerException e) {
            System.out.println("Chapter is not initialized");
        }
    }

    public void removeChapters(Chapter c) {            //added by me
        this.chapters.remove(c);
    }

    public void addChapters(ArrayList<Chapter> c) {
        try {
            this.chapters.addAll(c);
            for (Chapter chapter : c) {
                chapter.setCourse(this);
            }
        } catch (NullPointerException e) {
            System.out.println("Chapters is not initialized");
        }
    }

    public static ArrayList<Course> sortCourses(ArrayList<Course> courses, char mode) {
        ArrayList<Course> innercourses = new ArrayList<>();
        if (courses != null) {
            innercourses.addAll(courses);
        }
        try {
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
        } catch (NullPointerException | ClassCastException e) {
            e.printStackTrace();
        }
        return innercourses;
    }

    @Override
    public int compareTo(Course course) {
        try {
            if (this.code > course.code) {
                return 1;
            } else if (this.code < course.code) {
                return -1;
            } else {
                return 0;
            }
        } catch (NullPointerException e) {
            System.out.println("Course is not initialized");
            return 0;
        }
    }

    @Override
    public void enroll(Student s) {
        try {
            if (this.getPublished() == true) {
                this.getStudents().add(s);
                s.getEnrolledcourses().add(this);
            } else {
                throw new IllegalStateException("Cannot enroll in an unpublished course");
            }
        } catch (NullPointerException | IllegalStateException e) {
            System.out.println("Student or students is not initialized or course is not published");
        }
    }

    @Override
    public void unenroll(Student s) {
        try {
            if (this.getPublished() == true) {
                this.getStudents().remove(s);
                s.getEnrolledcourses().remove(this);
            }
        } catch (NullPointerException e) {
            System.out.println("Student or students is not initialized");
        }
    }

    @Override
    public String toString() {
        try {
            return ("Course: " + this.title + "\n" +
                    "Code: " + this.code + "\n" +
                    "Price: " + this.price + "\n" +
                    "Owner: " + this.owner.getUsername() + "\n" +
                    "Duration: " + this.week_duration + "\n" +
                    "Chapters: " + this.chapters.size() + "\n" +
                    "Students: " + this.students.size() + "\n" +
                    "");
        } catch (NullPointerException e) {
            System.out.println("Some properties are not initialized");
            return null;
        }
    }
}