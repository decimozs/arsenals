
class Kata {
  public static int findSmallest(int[] arr, String mode) {
    int smallestIndex = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[smallestIndex]) {
            smallestIndex = i;
        }
    }
    if (mode.equals("index")) {
        System.out.println(smallestIndex);
        return smallestIndex;
    } else {
        System.out.println(arr[smallestIndex]);
        return arr[smallestIndex];
    }
}

  public static void main(String[] args){
    Kata.findSmallest( new int [] {1, 2, 3} , "index");
    Kata.findSmallest( new int [] {7, 12, 3, 2, 27} , "value");
    Kata.findSmallest( new int [] {7, 12, 3, 2, 27} , "index");
  }

}