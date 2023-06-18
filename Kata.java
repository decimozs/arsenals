
class Kata {
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

  public static void main(String[] args){
    Kata.flattenAndSort(new int[][]{});
    Kata.flattenAndSort(new int[][]{{}, {1}});
    Kata.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}});
    Kata.flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}});
    Kata.flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}});
  }

}