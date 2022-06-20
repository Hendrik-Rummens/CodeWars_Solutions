
import java.util.Arrays;

public class Kata {
  public static String highAndLow(String numbers) {
    String n_numbers[] = numbers.split(" ");
    int size = n_numbers.length;
    
    int[] ns = new int[size];
    
   
    int i = 0;
    for (String word: numbers.split(" ")){
      ns[i] = Integer.parseInt(word);
      i+=1;
    }
    
    Arrays.sort(ns);
    return String.valueOf(ns[ns.length -1]) + " " + String.valueOf(ns[0]);
  }
}
