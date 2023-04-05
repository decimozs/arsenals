public class Kata {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int size = numbers.length;
        int count = 0;
        int index = 0;
    
        for(int i = 0; i < size; i++){
          if(numbers[i] % divider == 0){
            count++;
          }
        }
    
        int[] result = new int[count];
    
        for(int i = 0; i < size; i++){
          if(numbers[i] % divider == 0){
            result[index] = numbers[i];
            index++;
          }
        }
        
        return result;
      }
}
