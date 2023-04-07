public class Kata {
   public static int solve(int [] arr){
      int size = arr.length;
      int count = 0;
      
      for(int i = 0; i < size - 1; i+=2){
        if (Math.abs(arr[i] - arr[i + 1]) == 1){
          count++;
        }
      }
      
      return count;
    } 
}
