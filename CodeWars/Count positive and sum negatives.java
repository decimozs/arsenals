public class Kata{
    public static int[] countPositivesSumNegatives(int[] input){
      if(input == null || input.length == 0){
        return new int[0];
      };
      
      int sum = 0;
      int count = 0;

      for(int i = 0; i < input.length; i++){
        if(input[i] > 0){
          count++;
        }
        if(input[i] < 0){
            sum += input[i];
          }
      }

        return new int[] {count, sum};   
    }
}