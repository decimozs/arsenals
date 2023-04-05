public class Kata {
    public static String findNeedle(Object[] haystack) {
        int size = haystack.length;
        String target = "needle";
        int pos = 0;
        
        for(int i = 0; i < size; i++){
          if(target.equals(haystack[i])){
            pos = i;
            break;
          }
        }
        
        return pos >= 0 ? "found the needle at position " + pos : "";
      }
}
