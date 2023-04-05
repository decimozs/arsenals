public class Kata {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;
        
        for(int i = 0; i < size1; i++){
          sum1 += arr1[i];
        }
        
        for(int i = 0; i < size2; i++){
          sum2 += arr2[i];
        }
        
        sum = sum1 + sum2;
        
        return sum;
      }
}
