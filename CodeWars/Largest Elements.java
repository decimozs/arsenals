public class Kata {
    public static int[] largest(int n, int[] arr) {
     Arrays.sort(arr);
     int[] result = new int[n];
     int index = 0;
     
     for(int i = arr.length - 1; i >= arr.length - n; i--){
       result[index++] = arr[i];
     }
     
     for (int i = 0; i < result.length / 2; i++) {
        int temp = result[i];
        result[i] = result[result.length - i - 1];
        result[result.length - i - 1] = temp;
    }
     
     return result;
   }
}