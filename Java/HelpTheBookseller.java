import java.util.Arrays;
import java.util.*;
public class StockList { 
	
  // 1st parameter is the stocklist (L in example), 
	// 2nd parameter is list of categories (M in example)
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0){
      return "";
    }
    else{
      Map map = new HashMap();
      for (String word: lstOfArt){
        for (String w: lstOf1stLetter){
          if (w.equals(String.valueOf(word.charAt(0)))){
            System.out.println(w);
            if (!map.containsKey(w)){
              map.put(w, Integer.parseInt(word.split(" ")[1]));
            }
            else{
              var number = map.get(w);
              Integer new_n = (int)number + Integer.parseInt(word.split(" ")[1]);
              map.put(w, new_n);
            }
            
          }
        }

      }
      String result = "";
      Set set=map.entrySet();
      Iterator itr=set.iterator();  
      while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());
        String toAdd = "(" + entry.getKey() + " : " + entry.getValue() + ")" + " - " ;
        result += "(" + entry.getKey() + " : " + entry.getValue() + ")";
        if (itr.hasNext()){
          result += " - ";
        }
      }  
      
      
      return result;
    }
	}
}

