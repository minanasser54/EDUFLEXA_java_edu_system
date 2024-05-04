package Controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Material.Chapter;
import Material.Course;
import Material.Lesson;
import Material.Quiz;
import Utility.Init;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class mainframe4 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;




    @FXML
    private TextField Add_Chapter_Title;

    @FXML
    private TextField Add_Lesson_Attribute;

    @FXML
    private TextField Add_Quiz_Attribute;

    @FXML
    private TextField Course_Code;

    @FXML
    private TextField Course_Duration;

    @FXML
    private TextField Course_Outcomes;

    @FXML
    private TextField Course_Price;

    @FXML
    private TextField Course_Title;





    @FXML
    private ListView<String> Lesson_List;

    @FXML
    private ListView<String> Quiz_List;

    
    @FXML
    private ListView<String> Chapter_List;




    @FXML
    private TextField Lesson_Text;

    @FXML
    private TextField Lesson_URL;

    @FXML
    private TextField Quiz_Answers;


    @FXML
    private TextField Quiz_Questions;
    



    @FXML
    private ChoiceBox<String> Select_Course;

    @FXML
    private ChoiceBox<String> Select_Chapter;



    


    @FXML
    void Add_Course(MouseEvent event) {
        Lesson_List.getItems().clear();
        Quiz_List.getItems().clear();
        Select_Chapter.getItems().clear();

        Lesson_Text.clear();
        Lesson_URL.clear();
        Quiz_Answers.clear();
        Quiz_Questions.clear();


        
        Init.Availablecourses.add( new Course(Course_Title.getText(), Init.Mentors.get(Init.accessed_Mentor_index),
        Integer.parseInt(Course_Price.getText()), Integer.parseInt(Course_Duration.getText()), Course_Outcomes.getText()));
        Init.Availablecourses.get(Init.Availablecourses.size()-1).setCode(Integer.parseInt(Course_Code.getText()));

        Select_Course.getItems().add(Course_Title.getText());

        Course_Title.clear();
        Course_Price.clear();
        Course_Code.clear();
        Course_Duration.clear();
        Course_Price.clear();
        Course_Outcomes.clear();


    }
    
    @FXML
    void Add_chapter(MouseEvent event) {



        String s     = Select_Course.getValue();
        int    index = 0;
        for(int i = 0 ; i<Init.Availablecourses.size() ; i++ )
        {
            if (Init.Availablecourses.get(i).getTitle().equals(s)) 
            {
                index = i;
                break;
            }
        }   
        
        Init.Availablecourses.get(index).addChapters(new Chapter (Add_Chapter_Title.getText()));


        Chapter_List.getItems().add(Add_Chapter_Title.getText());
        Select_Chapter.getItems().add(Add_Chapter_Title.getText());
        Add_Chapter_Title.clear();

        
    }

    
    @FXML
    void Chapter_remove(MouseEvent event) {

        /* ############ Specify The selected Course From ChoiceBox Course ############ */

        String s     = Select_Course.getValue();
        int    index = 0;
        for(int i = 0 ; i<Init.Availablecourses.size() ; i++ )
        {
            if (Init.Availablecourses.get(i).getTitle().equals(s)) 
            {
                index = i;
                break;
            }
        }  


        /* ############ ############ ############ ############ ############ ############ */

        /* ############ Specify The selected Chapter From ChoiceBox chapter ############ */


        int selectID = Chapter_List.getSelectionModel().getSelectedIndex();
        s = Chapter_List.getItems().get(selectID);

        for(int j = 0 ; j<Init.Availablecourses.get(index).getChapters().size() ; j++ )
        {
            if ( (  Init.Availablecourses.get(index).getChapters().get(j).getTitle()   ).equals(s)) 
            {
                Init.Availablecourses.remove(   Init.Availablecourses.get(index).getChapters().get(j)  );    
                break;
            }
        }  

        Select_Chapter.getItems().remove(selectID);
        Chapter_List.getItems().remove(selectID);  
    }



    @FXML
    void Add_Lesson(MouseEvent event) {

         /* ############ Specify The selected Course From ChoiceBox Course ############ */
         String s     = Select_Course.getValue();
         int    index = 0;

         for(int i = 0 ; i<Init.Availablecourses.size() ; i++ )
         {
             if (Init.Availablecourses.get(i).getTitle().equals(s)) 
             {
                 index = i;
                 break;
             }
         }  



        /* ############ ############ ############ ############ ############ ############ */

        /* ############ Specify The selected Chapter From ChoiceBox chapter ############ */

        s   = Select_Chapter.getValue();

        for(int j = 0 ; j<Init.Availablecourses.get(index).getChapters().size() ; j++ )
        {
            if ( (  Init.Availablecourses.get(index).getChapters().get(j).getTitle()   ).equals(s)) 
            {
                Init.Availablecourses.get(index).getChapters().get(j).addLesson(Lesson_Text.getText(), Lesson_URL.getText());
                break;
            }
        }
        /* ############ ############ ############ ############ ############ ############ */


        s = "Text: " + Lesson_Text.getText() + " $Video URL: "+  Lesson_URL.getText();

        Lesson_List.getItems().add(s);

        Lesson_Text.clear();
        Lesson_URL.clear();
    }








    @FXML
    void Add_Quiz(MouseEvent event) {

         /* ############ Specify The selected Course From ChoiceBox Course ############ */
         String s     = Select_Course.getValue();
         int    index = 0;

         for(int i = 0 ; i<Init.Availablecourses.size() ; i++ )
         {
             if (Init.Availablecourses.get(i).getTitle().equals(s)) 
             {
                 index = i;
                 break;
             }
         }  



        /* ############ ############ ############ ############ ############ ############ */

        /* ############ Specify The selected Chapter From ChoiceBox chapter ############ */

        s   = Select_Chapter.getValue();

        for(int j = 0 ; j<Init.Availablecourses.get(index).getChapters().size() ; j++ )
        {
            if ( (  Init.Availablecourses.get(index).getChapters().get(j).getTitle()   ).equals(s)) 
            {
                Init.Availablecourses.get(index).getChapters().get(j).addQuiz(Quiz_Questions.getText(),Quiz_Answers.getText()); //each Quiz Take one Question and one Answer
                break;
            }
        }
        /* ############ ############ ############ ############ ############ ############ */


        s = "Question: " + Quiz_Questions.getText() + " $Answer: "+  Quiz_Answers.getText();

        Quiz_List.getItems().add(s);

        Quiz_Questions.clear();
        Quiz_Answers.clear();

    }





    @FXML
    void Remove_Lesson(MouseEvent event) {

        
         /* ############ Specify The selected Course From ChoiceBox Course ############ */

         String s     = Select_Course.getValue();
         int    index1 = 0;

         for(int i = 0 ; i<Init.Availablecourses.size() ; i++ )
         {
             if (Init.Availablecourses.get(i).getTitle().equals(s)) 
             {
                 index1 = i;
                 break;
             }
         }  



        /* ############ ############ ############ ############ ############ ############ */

        /* ############ Specify The selected Chapter From ChoiceBox chapter ############ */

        s   = Select_Chapter.getValue();
        int    index2 = 0;

        for(int j = 0 ; j<Init.Availablecourses.get(index1).getChapters().size() ; j++ )
        {
            if ( (  Init.Availablecourses.get(index1).getChapters().get(j).getTitle()   ).equals(s)) 
            {
                index2 = j;
                break;
            }
        }

        /* ############ ############ ############ ############ ############ ############ */

        /* ############ Specify The selected Lesson From Listview Lesson ############ */


        int selectID = Lesson_List.getSelectionModel().getSelectedIndex();
        s    = Lesson_List.getItems().get(selectID);

        String tx = s.substring(6, s.indexOf('$')-1);
        String url = s.substring(s.indexOf('$')+12, s.length());
        


        for(int v = 0 ; v<Init.Availablecourses.get(index1).getChapters().get(index2).getLessons().size() ; v++ )
        
        {
            if ( (  Init.Availablecourses.get(index1).getChapters().get(index2).getLessons().get(v).getText()   ).equals(tx) && 
                (Init.Availablecourses.get(index1).getChapters().get(index2).getLessons().get(v).getVideo_url()   ).equals(url)) 
            {
                Init.Availablecourses.get(index1).getChapters().get(index2).dropLesson(Init.Availablecourses.get(index1).getChapters().get(index2).getLessons().get(v));
                System.out.println("Done");
                break;
            }
        }

        /* ############ ############ ############ ############ ############ ############ */



        Lesson_List.getItems().remove(selectID);
    }

    @FXML
    void Remove_Quiz(MouseEvent event) {

        
        
         /* ############ Specify The selected Course From ChoiceBox Course ############ */

         String s     = Select_Course.getValue();
         int    index1 = 0;

         for(int i = 0 ; i<Init.Availablecourses.size() ; i++ )
         {
             if (Init.Availablecourses.get(i).getTitle().equals(s)) 
             {
                 index1 = i;
                 break;
             }
         }  



        /* ############ ############ ############ ############ ############ ############ */

        /* ############ Specify The selected Chapter From ChoiceBox chapter ############ */

        s   = Select_Chapter.getValue();
        int    index2 = 0;

        for(int j = 0 ; j<Init.Availablecourses.get(index1).getChapters().size() ; j++ )
        {
            if ( (  Init.Availablecourses.get(index1).getChapters().get(j).getTitle()   ).equals(s)) 
            {
                index2 = j;
                break;
            }
        }

        /* ############ ############ ############ ############ ############ ############ */

        /* ############ Specify The selected Lesson From Listview Quiz ############ */


        int selectID = Quiz_List.getSelectionModel().getSelectedIndex();
        s    = Quiz_List.getItems().get(selectID);

        String Q = s.substring(10, s.indexOf('$')-1);
        String A = s.substring(s.indexOf('$')+9, s.length());


        for(int v = 0 ; v<Init.Availablecourses.get(index1).getChapters().get(index2).getQuizs().size() ; v++ )
        {
            for(int r = 0 ; r<Init.Availablecourses.get(index1).getChapters().get(index2).getQuizs().get(v).getQuestions().size() ; r++ )

            {
                if ( (  Init.Availablecourses.get(index1).getChapters().get(index2).getQuizs().get(v).getQuestions().get(r)   ).equals(Q) && 
                    (Init.Availablecourses.get(index1).getChapters().get(index2).getQuizs().get(v).getAnswers().get(r)   ).equals(A)) 
                {
                    Init.Availablecourses.get(index1).getChapters().get(index2).dropQuiz((Init.Availablecourses.get(index1).getChapters().get(index2).getQuizs().get(v)));
                    break;
                }
            }
        }
        /* ############ ############ ############ ############ ############ ############ */

        Quiz_List.getItems().remove(selectID);

    }


    @FXML
    void Change_Chapter_List(MouseEvent event) {

        Select_Course.setOnAction(e -> 
        {
                Chapter_List.getItems().clear();

                String s     = Select_Course.getValue();
                int    index = 0;
                for(int i = 0 ; i<Init.Availablecourses.size() ; i++ )
                {
                    if (Init.Availablecourses.get(i).getTitle().equals(s)) 
                    {
                        index = i;
                        for(int j = 0 ; j<Init.Availablecourses.get(index).getChapters().size() ; j++ )
                        {
                            Chapter_List.getItems().add(Init.Availablecourses.get(index).getChapters().get(j).getTitle());
                        }
                        break;
                    }
                }   
        });
       

    }

    @FXML
    void Change_Lesson_Quiz_List(MouseEvent event) {

        Select_Chapter.setOnAction(e -> 
        {
                Lesson_List.getItems().clear();
                Quiz_List.getItems().clear();



                        
                String s     = Select_Course.getValue();
                int    index1 = 0;
                for(int i = 0 ; i<Init.Availablecourses.size() ; i++ )
                {
                    if (Init.Availablecourses.get(i).getTitle().equals(s)) 
                    {
                        index1 = i;
                        break;
                    }
                }  


                

                s     = Select_Chapter.getValue();
                int    index2 = 0;
                for(int i = 0 ; i<Init.Availablecourses.get(index1).getChapters().size() ; i++ )
                {
                    if ((Init.Availablecourses.get(index1).getChapters().get(i).getTitle()).equals(s)) 
                    {
                        
                        index2 = i;
                        for(int j = 0 ; j<Init.Availablecourses.get(index1).getChapters().get(index2).getLessons().size() ; j++ )
                        {
                            String txt = Init.Availablecourses.get(index1).getChapters().get(index2).getLessons().get(j).getText();
                            String url = Init.Availablecourses.get(index1).getChapters().get(index2).getLessons().get(j).getVideo_url();
                            
                            Lesson_List.getItems().add("Text: " + txt + " $Video URL: "+  url);
 
                        }


                        for(int u = 0 ; u<Init.Availablecourses.get(index1).getChapters().get(index2).getQuizs().size() ; u++ )
                        {
                                String Q = Init.Availablecourses.get(index1).getChapters().get(index2).getQuizs().get(u).getQuestions().get(0);
                                String A = Init.Availablecourses.get(index1).getChapters().get(index2).getQuizs().get(u).getAnswers().get(0);                           
                                Quiz_List.getItems().add("Question: " + Q  + " $Answer: "+  A);
                        }

                        break;
                    }
                }   
        });
       

    }


    @FXML
    void Finish(MouseEvent event) {
    


        for(int v = 0 ; v<Init.Availablecourses.size() ; v++ )
        {
            System.out.println( Init.Availablecourses.get(v).toString());

            for(int i = 0 ; i<Init.Availablecourses.get(v).getChapters().size() ; i++ )
            {
                System.out.println( Init.Availablecourses.get(v).getChapters().get(i).toString());

                
                for(int j = 0 ; j<Init.Availablecourses.get(v).getChapters().get(i).getLessons().size() ; j++ )
                {
                    System.out.println("======================        LESSONS                      ======================");
                    System.out.println("==============================================================================");
                    System.out.println( Init.Availablecourses.get(v).getChapters().get(i).getLessons().get(j).toString());
                }
                
                for(int n = 0 ; n<Init.Availablecourses.get(v).getChapters().get(i).getQuizs().size() ; n++ )
                {
                    System.out.println("======================        QUIZZES                      ======================");
                    System.out.println("==============================================================================");
                    System.out.println(  Init.Availablecourses.get(v).getChapters().get(i).getQuizs().get(n).toString());
                }
                
            }
            System.out.println("==============================================================================");
            System.out.println("==============================================================================");
        }

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
           



        assert Add_Chapter_Title != null : "fx:id=\"Add_Chapter_Title\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Add_Lesson_Attribute != null : "fx:id=\"Add_Lesson_Attribute\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Add_Quiz_Attribute != null : "fx:id=\"Add_Quiz_Attribute\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Chapter_List != null : "fx:id=\"Chapter_List\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Course_Code != null : "fx:id=\"Course_Code\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Course_Duration != null : "fx:id=\"Course_Duration\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Course_Outcomes != null : "fx:id=\"Course_Outcomes\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Course_Price != null : "fx:id=\"Course_Price\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Course_Title != null : "fx:id=\"Course_Title\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Lesson_List != null : "fx:id=\"Lesson_List\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Quiz_List != null : "fx:id=\"Quiz_List\" was not injected: check your FXML file 'mainframe4.fxml'.";
        assert Select_Chapter != null : "fx:id=\"Select_Chapter\" was not injected: check your FXML file 'mainframe4.fxml'.";

    }

}




