import java.util.ArrayList;

/**
   A Student has a name, quiz scores, the average and total of the scores
*/
public class Student {
  private String name;
  private ArrayList<Integer> quizScores = new ArrayList<Integer>();
  private int totalScore = 0;
  private double averageScore;
  
  /**
     Constructs a student without any quizes
     @param n student's name
  */ 
  public Student(String n) {
    name = n;
  }
  
  /**
     Gets the name of the student
     @return the name of the student
  */
  public String getName() {
   return name; 
  }
  
  /**
     Adds a quiz score to the students grades
     @param score the score the student got
  */
  public void addQuiz(int score) {
    quizScores.add(score);
  }
  
  /**
     Gets the total quiz score the student
     @return the total score of the student
  */
  public int getTotalScore() {
    for (int i=0; i<quizScores.size(); i++) {
     totalScore += quizScores.get(i); 
    }
    return totalScore;
  }
  
  /**
     Gets the average score of the students quiz score
     @return student score average
  */
  public double getAverageScore() {
   return totalScore/quizScores.size(); 
  }
}