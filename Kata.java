import java.util.*;

class Kata {
  public static int[] divisibleBy(int[] numbers, int divider) {
    int size = numbers.length;
    int count = 0;
    int index = 0;

    for(int i = 0; i < size; i++){
      if(numbers[i] % divider == 0){
        count++;
      }
    }

    int[] result = new int[count];

    for(int i = 0; i < size; i++){
      if(numbers[i] % divider == 0){
        result[index] = numbers[i];
        index++;
      }
    }
    

    System.out.println(Arrays.toString(result));
    return result;
  }
  public static void main(String[] args){
    Kata.divisibleBy(new int[] {1,2,3,4,5,6},2);
    Kata.divisibleBy(new int[] {1,2,3,4,5,6},3);
    Kata.divisibleBy(new int[] {0,1,2,3,4,5,6},4);
  }

}