/**
   A Voting machine has the total number of republican, democrat and both votes
*/
public class VotingMachine {
 private int democrat = 0;
 private int republican = 0;
 private int total= 0;
 
 /**
    Adds a vote to the democrat side and to the total number of votes
 */
 public void voteDemocrat() {
  democrat++; 
  total++;
 }
 
 /**
    Adds a vote to the republican side and to the total number of votes
 */
 public void voteRepublican() {
  republican++;
  total++;
 }
 
 /**
    Shows the number of votes that the indicated party has
    @param politician the party that you want to see
    @return the number of votes of the indicated party
 */
 public String viewVote(String politician) {
   if (politician == "democrat") {
     return String.valueOf(democrat);
   } else if (politician == "republican") {
    return String.valueOf(republican); 
   } else {
    return "No such party";
   }
 }
 
 /**
    Shows the total number of votes
 */
 public int tallies() {
  return total; 
 }
 
 /** 
    Clear votes from the voting machine
 */
 public void clearVotes() {
  democrat = 0;
  republican = 0;
  total = 0;
 }
}