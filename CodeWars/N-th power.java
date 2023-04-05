public class Kata {
    public static int nthPower(int[] array, int n) {
        int size = array.length;
        
        if(n >= size){
          return -1;
        }
        
        return (int) Math.pow(array[n], n);
      }
}
