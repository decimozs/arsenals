public class Kata {
    public static double sum(double[] numbers) {
        int size = numbers.length;
        
        if(numbers == null || size == 0) return 0;
        
        double sum = 0;
        
        for(int i = 0; i < size; i++){
          sum += numbers[i];
        }
        
        return sum;
      }
}
