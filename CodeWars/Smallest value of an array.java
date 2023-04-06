public class Kata {
    public static int findSmallest(int[] arr, String toReturn) {
        int smallestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i;
            }
        }
        if (toReturn.equals("index")) {
            return smallestIndex;
        } else {
            return arr[smallestIndex];
        }
      }
}
