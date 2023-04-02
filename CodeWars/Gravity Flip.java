import java.util.Arrays;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
    switch(dir){
            case 'R' : {
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            }
            case 'L' : {
                Arrays.sort(arr);
                for (int i = 0; i < arr.length / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - i - 1];
                    arr[arr.length - i - 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
                break;
            } 
            default : {
                break;
            }
        }

        return arr;
  }
}