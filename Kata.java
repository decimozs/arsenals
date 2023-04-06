import java.util.*;

class Kata {
  public static int[] mergeArrays(int[] first, int[] second) {
    if(first.length == 0 && second.length == 0){
      return new int[0];
    }

    int[] result = new int[first.length + second.length];
    int index = 0;

    for(int i = 0; i < first.length; i++){
      result[index++] = first[i];
    }

    for(int i = 0; i < second.length; i++){
      result[index++] = second[i];
    }

    for(int i = 0; i < result.length; i++){
      for(int j = i + 1; j < result.length; j++){
        if(result[i] > result[j]){
          int temp = result[i];
          result[i] = result[j];
          result[j] = temp;
        }
      }
    }

    index = 0;
    for(int i = 0; i < result.length - 1; i++){
      if(result[i] != result[i + 1]){
        result[index++] = result[i];
      }
    }

    result[index++] = result[result.length - 1];

    int[] answer = Arrays.copyOf(result, index);

    System.out.println(Arrays.toString(answer));

    return answer;
	}
  public static void main(String[] args){
    Kata.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 });
		Kata.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 });
  }

}