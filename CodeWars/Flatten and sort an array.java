public class Kata {
    public static int[] flattenAndSort(int[][] array) {
    int size = array.length;

    int length = 0;
    for(int i = 0; i < size; i++){
      length += array[i].length;
    }

    int[] result = new int[length];

    int index = 0;
    for(int i = 0; i < size; i++){
      for(int j = 0; j < array[i].length; j++){
        result[index++] = array[i][j];
      }
    }

    int temp = 0;
    for(int i = 0; i < result.length; i++){
      for(int j = i + 1; j < result.length; j++){
        if(result[i] > result[j]){
          temp = result[i];
          result[i] = result[j];
          result[j] = temp;
        }
      }
    }

    return result;
	}
}
