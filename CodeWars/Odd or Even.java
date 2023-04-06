public class Kata {
    public static String oddOrEven (int[] array) {
        int size = array.length;
        int sum = 0;
        
        for(int i = 0; i < size; i++){
          sum += array[i];
        }
        
        for(int i = 0; i < size; i++){
          if(sum % 2 == 0){
            return "even";
          }  
        }
        
        return "odd";
      }
}
