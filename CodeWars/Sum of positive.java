public class Kata{
    public static int sum(int[] arr){
        int size = arr.length;
        int sumP = 0;
        
        for(int i = 0; i < size; i++){
          if(arr[i] > 0){
            sumP += arr[i];
          }
        }
        
        return sumP;
      }
}
