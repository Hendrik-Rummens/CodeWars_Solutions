public class Solution {

    public static String camelCase(String str) {
        String result = "";
      
        String[] words = str.split(" ");
        for (String w: words){
          if (w != ""){
             result += w.toUpperCase().charAt(0)+w.substring(1, w.length());
          }
        }
        return result;
    }

}

