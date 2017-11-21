/********************************
  * Program Title: ManwaiNQ4.java
  * Purpose: Calculate the interest of the inputted investments
  * Date: 11/3/17
  * Input: initial deposit, rate of interest, number of years
  * Output: new balance of each year and bar chart to help you see the increase.
  * *******************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ManwaiNQ4 extends JFrame {
  // initialize variables
  private static final int FRAME_WIDTH = 1000;
  private static final int FRAME_HEIGHT = 1000;

  private static final int CHART_WIDTH = 1000;
  private static final int CHART_HEIGHT = 1000;
  
  private JLabel rateLabel, initLabel, yearLabel;
  private JTextField rateField, initField, yearField;
  private JButton button;
  private ManwaiNQ4Component chart;
  private double balance;

  /* purpose of method: create a chart 
   * */
  public ManwaiNQ4() {
    chart = new ManwaiNQ4Component(3.0 * 1000);// max value
    chart.setPreferredSize(new Dimension(CHART_WIDTH, CHART_HEIGHT));

    createTextField();
    createButton();
    createPanel();

    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }
  
  /* purpose of method: create areas we can enter values
   * */
  private void createTextField() {
    initLabel = new JLabel("Initial Deposit: ");
    rateLabel = new JLabel("Interest Rate: ");
    yearLabel = new JLabel("How many years: ");

    final int FIELD_WIDTH = 10;
    initField = new JTextField(FIELD_WIDTH);
    rateField = new JTextField(FIELD_WIDTH);
    yearField = new JTextField(FIELD_WIDTH); 
  }

  /* purpose of method: show you the balance of the next few years after button press
   * */
  class AddInterestListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      balance = Double.parseDouble(initField.getText());
      chart.append(balance);
      int year = Integer.parseInt(yearField.getText());
      for (int i=0; i<year; i++) {
        double rate = Double.parseDouble(rateField.getText());
        double interest = balance * rate / 100;
        balance = balance + interest;
        chart.append(balance);
      }
    }
  }

  /* purpose of method: create a button for you to press
   * */
  private void createButton() {
    button = new JButton("Calculate");
    ActionListener listener = new AddInterestListener();
    button.addActionListener(listener);
  }

  /* purpose of method: display the text areas and buttons onto the screen
   * */
  private void createPanel() {
    JPanel panel = new JPanel();
    panel.add(initLabel);
    panel.add(initField);
    panel.add(rateLabel);
    panel.add(rateField);
    panel.add(yearLabel);
    panel.add(yearField);
    panel.add(button);
    panel.add(chart);
    add(panel);
  }
}
