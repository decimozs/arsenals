class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int res = 0;

        for(String i : operations){
            if(i.equals("X++") || i.equals("++X")){
                res++;
            }else{
                res--;
            }
        }

        return res;
    }
}