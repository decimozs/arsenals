public class Kata {
  public static double findUniq(double arr[]) {
    double n1 = arr[0];
    double n2 = arr[1];
    
    for(int i = 2; i < arr.length; i++){
      if(n1 == n2){
        if(arr[i] != n1){
          return arr[i];
        }
      }else{
        if(arr[i] == n1){
          return n2;
        }else{
          return n1;
        }
      }
    }
    
    return 0;
  }
}