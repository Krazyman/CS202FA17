/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 8, 2017
  * Excercise: P8.7
  * Purpose: calls the student class and retrieve information about the student created
  * Input: name of student
  * Outputs: name, total score, average score, and number of quizzes the student took
  * *******************************************/

public class P8_7_ManwaiNguyen {  
  public static void main(String[] args) { 
    Student manwai = new Student("Manwai"); // create a student
    
    // add quizes
    manwai.addQuiz(96);
    manwai.addQuiz(86);
    manwai.addQuiz(76);

    // show the student and their score
    System.out.println("Name: " + manwai.getName());
    System.out.println("Total Score: " + manwai.getTotalScore());
    System.out.println("Average Score: " + manwai.getAverageScore());
  }
}