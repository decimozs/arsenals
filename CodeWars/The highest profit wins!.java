public class Kata {
    public static int[] minMax(int[] arr) {
        int size = arr.length;
        int maxVal = arr[0];
        int minVal = arr[0];
        
        for(int i = 0; i < size; i++){
          if(arr[i] > maxVal){
            maxVal = arr[i];
          }if(arr[i] < minVal){
            minVal = arr[i];
          }
        }
        
        return new int[] {minVal, maxVal};
      }
}
