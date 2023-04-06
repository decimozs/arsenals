import java.util.*;

class Kata {
  public static String oddOrEven (int[] array) {
    int size = array.length;
    int sum = 0;
    
    for(int i = 0; i < size; i++){
      sum += array[i];
    }

    for(int i = 0; i < size; i++){
      if(sum % 2 == 0){
        System.out.println(sum);
        System.out.println("odd");
        return "even";
      }
    }

    System.out.println(sum);
    System.out.println("odd");
    return "odd";
  }
  public static void main(String[] args){
    Kata.oddOrEven(new int[] {2, 5, 34, 6});
  }

}