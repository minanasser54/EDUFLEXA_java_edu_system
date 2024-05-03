package Material;

import java.util.ArrayList;

public class Chapter {
    private String title;
    private ArrayList<Lesson> lessons = new ArrayList<Lesson>();
    private ArrayList<Quiz> quizs = new ArrayList<Quiz>();
    private Course course;

    public Chapter(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public ArrayList<Lesson> getLessons() {
        if (lessons == null) {
            throw new NullPointerException("Lessons is not initialized");
        }
        return lessons;
    }

    public ArrayList<Quiz> getQuizs() {
        if (quizs == null) {
            throw new NullPointerException("Quizzes is not initialized");
        }
        return quizs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void addLesson(String text, String url) {
        try {
            Lesson e = new Lesson(text, url, this);
            lessons.add(e);
        } catch (NullPointerException en) {
            System.out.println("Lessons is not initialized");
        }
    }

    public void dropLesson(Lesson e) {
        try {
            lessons.remove(e);
        } catch (NullPointerException en) {
            System.out.println("Lessons is not initialized");
        }
    }

    public void updateLesson(String text, String url, Lesson e) {
        try {
            Lesson ne = new Lesson(text, url, this);
            lessons.add(lessons.indexOf(e), ne);
            lessons.remove(e);
        } catch (NullPointerException en) {
            System.out.println("Lessons is not initialized");
        } catch (IndexOutOfBoundsException en) {
            System.out.println("Lesson is not found in the list");
        }
    }

    public void addQuiz() {
        try {
            Quiz q = new Quiz(this);
            quizs.add(q);
        } catch (NullPointerException en) {
            System.out.println("Quizzes is not initialized");
        }
    }

    public void dropQuiz(Quiz e) {
        try {
            quizs.remove(e);
        } catch (NullPointerException en) {
            System.out.println("Quizzes is not initialized");
        }
    }

    @Override
    public String toString() {
        try {
            return ("Chapter: " + this.title + "\n" +
                    "Lessons: " + this.lessons.size() + "\n" +
                    "Quizes: " + this.quizs.size() + "\n");
        } catch (NullPointerException en) {
            System.out.println("Some properties are not initialized");
            return null;
        }
    }
}