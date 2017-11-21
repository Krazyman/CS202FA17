/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 8, 2017
  * Excercise: P8.10
  * Purpose: Create a voting machine and vote randomly
  * Input: N/A
  * Outputs: The number of votes for each group of politicians
  * *******************************************/

public class P8_10_ManwaiNguyen {  
  public static void main(String[] args) { 
    double voteTimes = 100; // number of people that voted
    double times = Math.random() * voteTimes; // number of votes for one side
    VotingMachine vote2017 = new VotingMachine(); // create a voting machine
    
    // tally the number of republican votes
    for (int i=0; i<times; i++) { 
     vote2017.voteRepublican(); 
    }
    
    // tally the number of democrat votes
    for (int j=1; j<voteTimes - times; j++) {
     vote2017.voteDemocrat(); 
    }
    
    // total number of eaceh votes
    System.out.println("Republican: " + vote2017.viewVote("republican"));
    System.out.println("Democrat: " + vote2017.viewVote("democrat"));
    System.out.println("Total: " + vote2017.tallies());
    
    // clear the machine
    vote2017.clearVotes();
    System.out.println("\nVotes are now cleared");
    
    // show that its clear
    System.out.println("Republican: " + vote2017.viewVote("republican"));
    System.out.println("Democrat: " + vote2017.viewVote("democrat"));
    System.out.println("Total: " + vote2017.tallies());
  }
}