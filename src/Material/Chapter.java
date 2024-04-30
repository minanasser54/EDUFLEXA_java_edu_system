package Material;

import java.util.ArrayList;

public class Chapter {
    private String title;
    private ArrayList<Lesson> lessons = new ArrayList<Lesson>();
    private ArrayList<Quiz> quizs = new ArrayList<Quiz>();
    private Course course;

    public Chapter(String title) {
        this.title = title;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public ArrayList<Quiz> getQuizs() {
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
        Lesson e = new Lesson(text, url, this);
        lessons.add(e);
    }

    public void dropLesson(Lesson e) {
        lessons.remove(e);
    }

    public void updateLesson(String text, String url, Lesson e) {
        Lesson ne = new Lesson(text, url, this);
        lessons.add(lessons.indexOf(e), ne);
        lessons.remove(e);
    }

    public void addQuiz() {
        Quiz q = new Quiz(this);
        quizs.add(q);
    }

    public void dropQuiz(Quiz e) {
        quizs.remove(e);
    }

    @Override
    public String toString() {
        return ("Chapter: " + this.title + "\n" +
                "Lessons: " + this.lessons.size() + "\n" +
                "Quizes: " + this.quizs.size() + "\n" +

                "");
    }
}
