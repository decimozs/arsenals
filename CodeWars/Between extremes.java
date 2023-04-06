public class Kata {
    public static int betweenExtremes(int[] numbers){
        int size = numbers.length;
        int difference = 0;
        int maxVal = numbers[0];
        int lowVal = numbers[0];
        
        for(int i = 0; i < size; i++){
          if(numbers[i] > maxVal){
            maxVal = numbers[i];
          }if(numbers[i] < lowVal){
            lowVal = numbers[i];
          }
        }
        
        difference = maxVal - lowVal;
        
        return difference;
      }
}
