package Material;

import java.util.ArrayList;

public class Quiz {
    private int quiz_num;
    private Chapter chapter;
    private Course course;
    private ArrayList<String> questions = new ArrayList<String>();
    private ArrayList<String> answers = new ArrayList<String>();

    public Quiz(Chapter c) {
        this.chapter = c;
        course = c.getCourse();
        try {
            quiz_num = c.getQuizs().indexOf(c.getQuizs().getLast()) + 1;
        } catch (Exception e) {
            quiz_num = 1;
        }
    }

    public void addQuestion(String question, String answer) {
        this.questions.add(question);
        this.answers.add(answer);
    }

    public void dropQuestion(int i) {
        this.questions.remove(i);
        this.answers.remove(i);
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public int getQuiz_num() {
        return quiz_num;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return ("Quiz: " + this.quiz_num + "\n" +
                "Questions: " + this.questions.size() + "\n" +
                "Chapter: " + this.chapter + "\n" +
                "Course: " + this.course + "\n" +
                "");
    }
}
