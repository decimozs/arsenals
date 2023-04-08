class Solution {
    public int search(int[] nums, int target) {
        int size = nums.length;
        int index = 0;

        for(int i = 0; i < size; i++){
            if(nums[i] == target){
                index = i;
                return index;
            }
        }

        return -1;
    }
}