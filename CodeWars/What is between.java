public class Kata {
    public static int[] between(int a, int b) {
      int size = b - a + 1;
          int[] range = new int[size];
          for (int i = 0; i < size; i++) {
              range[i] = a + i;
          }
          return range;
    }
}