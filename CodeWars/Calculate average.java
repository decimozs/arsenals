public class Kata {
    public static double find_average(int[] array){
        int size = array.length;
          
        if(array == null || size == 0) return 0;
        
        int sum = 0;
        double avg = 0;
        
        for(int i = 0; i < size; i++){
          sum += array[i];
        }
        
        avg = (double) sum / size;
    
        System.out.println(avg);
        
        return avg;
      }
}