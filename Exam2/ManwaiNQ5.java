/********************************
  * Program Title: ManwaiNQ5.java
  * Purpose: Setting up the frame to display the clock program
  * Date: 11/3/17
  * Input: Hours, Minutes
  * Output: Clock Component
  * *******************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ManwaiNQ5 extends JFrame {
  // initialize variables
  private static final int FRAME_WIDTH = 1000;
  private static final int FRAME_HEIGHT = 1000;
  
  private JLabel hourLabel, minLabel;
  private JTextField hourField, minField;
  private JButton button;
  private ManwaiNQ5Component clock;
  private int hour, min;
  
  /*Purpose of Method: setting up the frame to view the clock program
   * */
  public ManwaiNQ5() {
    clock = new ManwaiNQ5Component();
    clock.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
    
    createTextField();
    createButton();
    createPanel();
    
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }
  
  /*Purpose of method: create text areas for users to enter hours and minutes
   * */
  public void createTextField() {
   hourLabel = new JLabel("Hour: ");
   minLabel = new JLabel("Minutes: ");

   final int FIELD_WIDTH = 10; 
   hourField = new JTextField(FIELD_WIDTH);
   minField = new JTextField(FIELD_WIDTH);
  }
  
  /*Purpose of method: Show you the time when you press the action button
   * */
  class AddTimeListener implements ActionListener {
   public void actionPerformed(ActionEvent event) {
    int hour = Integer.parseInt(hourField.getText());
    int min = Integer.parseInt(minField.getText());
    clock.time(hour, min);
   }
  }

  /*Purpose of method: to create the button for you to confirm hour and minutes 
   * */
  private void createButton() {
   button = new JButton("TIME!!!!!");

   ActionListener listener = new AddTimeListener();
   button.addActionListener(listener);
  }

  /*Purpose of method: display the text areas and buttons onto the screen
   * */
  private void createPanel() {
   JPanel panel = new JPanel();
   panel.add(hourLabel);
   panel.add(hourField);
   panel.add(minLabel);
   panel.add(minField);
   panel.add(button);
   panel.add(clock);
   add(panel);
  }
}