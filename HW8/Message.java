import java.util.ArrayList;

/** 
    A Message has a sender, recipient, and a body. 
*/
public class Message {
  private String recipient;
  private String sender;
  private ArrayList<String> messageBody = new ArrayList<String>();
  
  /**
      Constructs a Message with the given sender and recipient 
      @param r recipient
      @param s sender
  */ 
  public Message(String r, String s) {
    recipient = r;
    sender = s;
    String first = "From: ".concat(sender.concat("\n"));
    String second = "To: ".concat(recipient.concat("\n"));
    messageBody.add(first);
    messageBody.add(second);
  }
  
  /**
      Add message to the body of the message
      @param text each line of message
  */
  public void append(String text) {
    messageBody.add(text);
  }
  
  /**
      Make the whole email into one string
      @return the entire email  
  */
  public String toString() {
    String body = "";
    for (int i=0; i<messageBody.size(); i++) {
     body = body.concat(messageBody.get(i));
     body = body.concat("\n");
    }
    return body;
  } 
}