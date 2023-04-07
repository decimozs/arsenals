public class Kata {
    public static int cubeOdd(int arr[]) {
    int size = arr.length;
    int sum = 0;
    
    for(int i = 0; i < size; i++){
      if(arr[i] % 2 != 0){
        sum += arr[i] * arr[i] * arr[i];
      }
    }
    
    return sum;
  }
}
