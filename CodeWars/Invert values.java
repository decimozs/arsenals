public class Kata {
  public static int[] invert(int[] array) {
    int size = array.length;

    for(int i = 0; i < size; i++){
      array[i] = -array[i];
    }

    return array;
  }
}