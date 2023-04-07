class Solution {
    public int[] leftRigthDifference(int[] nums) {
       int size = nums.length;
       int[] rSum = new int[size];
       int[] lSum = new int[size];
       int[] answer = new int[size];

       for(int i = 1; i < size; i++){
           lSum[i] = lSum[i - 1] + nums[i - 1];
       }

       for(int i = size - 2; i >= 0; i--){
           rSum[i] = rSum[i + 1] + nums[i + 1];
       }

        for(int i = 0; i < size; i++){
            answer[i] = Math.abs(rSum[i] - lSum[i]);
        }

       return answer;
    }
}