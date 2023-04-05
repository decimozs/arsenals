public class Kata {
    public static int[] map(int[] arr) {
        int size = arr.length;
        
        for(int i = 0; i < size; i++){
          arr[i] *= 2;
        }
        
        return arr;
      }
}
