package SoftwareEngineering.Algorithms;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid + 1;
            }
        }

        return -1;
    }
}
