/**
   A Portfolio has a savings and checkings bank account that can be 
   changed by deposits, withdrawals, and transfers.
*/

public class Portfolio {
  
  // creates bank accounts with zero balance
  private BankAccount savings = new BankAccount();
  private BankAccount checkings = new BankAccount();
  
  /**
     Deposits money into given account
     @param amount the amount to deposit
     @param account the acount to deposit to
  */
  public void deposit(double amount, String account) {
    if (account == "c") {
     checkings.deposit(amount);
    } else if (account == "s") {
     savings.deposit(amount);
    }
  }
  
  /**
     Withdraws money into given account
     @param amount the amount to withdraw
     @param account the acount to withdraw from
  */
  public void withdraw(double amount, String account) {
    if (account == "c" && amount <= checkings.getBalance()) {
     checkings.withdraw(amount);
    } else if (account == "s" && amount <= savings.getBalance()) {
     savings.withdraw(amount);
    } else {
     System.out.println("Error!! Please check your account balance to see if there is sufficient funds."); 
    }
  }
  
    /**
     transfer money into between bank accounts
     @param amount the amount to transfer
     @param account the acount to transfer from
  */
  public void transfer(double amount, String account) {
    if (account == "c" && amount <= checkings.getBalance()) {
     checkings.withdraw(amount);
     savings.deposit(amount);
    } else if (account == "s" && amount <= savings.getBalance()) {
     savings.withdraw(amount);
     checkings.deposit(amount);
    } else {
     System.out.println("Error!! Please check your account balance to see if there is sufficient funds.");  
    }
  }
  
  /**
     Gets the current balance of given account
     @param account the account you want to know the balance of 
     @return the current balance of that account
  */
  public double getBalance(String account) {
    if (account == "c") {
     return checkings.getBalance();
    } else if (account == "s") {
     return savings.getBalance();
    }
    return 0;
  }
}