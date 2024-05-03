package Material;

import java.util.ArrayList;

public class Quiz {
    private int quiz_num;
    private Chapter chapter;
    private Course course;
    private ArrayList<String> questions;
    private ArrayList<String> answers;

    public Quiz(Chapter c) {
        try {
            this.chapter = c;
            course = c.getCourse();
            quiz_num = c.getQuizs().indexOf(c.getQuizs().getLast()) + 1;
            this.questions = new ArrayList<String>();
            this.answers = new ArrayList<String>();
        } catch (NullPointerException e) {
            System.out.println("Chapter is not initialized");
            quiz_num = 1;
        }
    }

    public void addQuestion(String question, String answer) {
        try {
            this.questions.add(question);
            this.answers.add(answer);
        } catch (NullPointerException e) {
            System.out.println("Questions or answers is not initialized");
        }
    }

    public void dropQuestion(int i) {
        try {
            this.questions.remove(i);
            this.answers.remove(i);
        } catch (NullPointerException e) {
            System.out.println("Questions or answers is not initialized");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        }
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
