public class VotingMachine {
 private int democrat = 0;
 private int republican = 0;
 private int total= 0;
 
 public VotingMachine() {
   
 }
 
 public void voteDemocrat() {
  democrat++; 
  total++;
 }
 
 public void voteRepublican() {
  republican++;
  total++;
 }
 
 public int tallies() {
  return total; 
 }
 
 public void clearVotes() {
  democrat = 0;
  republican = 0;
  total = 0;
 }
}