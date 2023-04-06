public class Kata {
    public static int consecutive(final int[] arr) {
        int size = arr.length;
        int consecutives = 0;
        
        if(arr == null || size == 0){
          return 0;
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < size - 1; i++){
          if(arr[i] + 1 != arr[i + 1]){
            consecutives += arr[i + 1] - arr[i] - 1;
          }
        }
        
        return consecutives;
      }
}
