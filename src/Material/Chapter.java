package Material;

import java.util.ArrayList;

public class Chapter {
    private String title;
    private ArrayList<Lesson> lessons = new ArrayList<Lesson>();
    private ArrayList<Quiz> quizs=new ArrayList<Quiz>();
    private Course course;

    public Chapter(String title) {
        this.title=title;
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
    @Override
    public String toString(){
        return (
            "Chapter: "+this.title+"\n"+
            "Lessons: "+this.lessons.size()+"\n"+
            "Quizes: "+this.quizs.size()+"\n"+
            
            ""
        );
    }
}
