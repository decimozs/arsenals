public class Kata {
    public static int minSum(int[] passed){
    int size = passed.length;
    int sum = 0;
    
    Arrays.sort(passed);
    
    for(int i = 0; i < size / 2; i++){
      sum += passed[i] * passed[passed.length - i - 1];
    }
    
    return sum;
  }
}