package accounts;

import java.util.*;

public interface Courses 

{
    ArrayList<String> title             = new ArrayList<String>();
    ArrayList<Integer> code             = new ArrayList<Integer>();
    ArrayList<Integer> price              = new ArrayList<Integer>();
    ArrayList<Integer> week_duration    = new ArrayList<Integer>();
    ArrayList<String> Outcomes          = new ArrayList<String>();
    ArrayList<Integer> no_quize = new ArrayList<Integer>();

    
    static String[][] Chapters = new String[100][20];                  // suppose maximum courses 100, each course has 20 Chapter
    static String[][] Students = new String[100][100];                 // suppose maximum courses 100, each course has 100 student
    
}
