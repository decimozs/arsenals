public class Kata {
    public static int findAverage(int[] nums){
        int sum = 0;
        int avg = 0;
        int size = nums.length;
        
        for(int i = 0; i < size; i++){
          sum += nums[i];
        }
        
        avg = sum / size;
        
        return avg;
      }
}
