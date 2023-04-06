public class Kata {
    public static int maxDiff(int[] lst) {
      int size = lst.length;
      
      if(lst == null || size == 0){
        return 0;
      }
      
      int difference = 0;
      int maxVal = lst[0];
      int minVal = lst[0];
      
      for(int i = 0; i < size; i++){
        if(lst[i] > maxVal){
          maxVal = lst[i];
        }if(lst[i] < minVal){
          minVal = lst[i];
        }
      }
      
      difference = maxVal - minVal;
      
      return difference;
    }
  }
