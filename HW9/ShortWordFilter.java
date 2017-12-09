/* Creates a Short Word Filter that uses Filter */

public class ShortWordFilter implements Filter {
  
    public boolean accept(Object obj) {
      return obj.toString().length() < 5;    
    }
}