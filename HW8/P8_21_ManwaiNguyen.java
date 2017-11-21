/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 8, 2017
  * Excercise: P8.21
  * Purpose: Utilize the Message constructor and create an email with it
  * Input: Sender, Recipient, and message
  * Outputs: The email in the string
  * *******************************************/

public class P8_21_ManwaiNguyen {  
  public static void main(String[] args) { 
    // create a Message
    Message email = new Message("Harry Morgan" , "Rudolf Reindeer"); 

    // write the email
    email.append("I'm not coming this Christmas");
    email.append("");
    email.append("Best, ");
    email.append("Red Nose");

    // print email out to screen
    System.out.println(email.toString());
    
  }
}