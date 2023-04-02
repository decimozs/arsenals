class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        if(x < 0){
            return false;
        }

        while(x != 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x/=10;
        }

        return original == reversed;
    }
}