class Solution {
    public int numIdenticalPairs(int[] nums) {
        int size = nums.length;
        int answer = 0;

        int[] freq = new int[101];

        for(int i = 0; i < size; i++){
            answer += freq[nums[i]];
            freq[nums[i]]++;
        }

        return answer;
    }
}