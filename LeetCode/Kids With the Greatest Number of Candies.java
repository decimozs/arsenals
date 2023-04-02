class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);

        int maxCandy = 0;

        for(int i : candies){
            maxCandy = Math.max(i, maxCandy);
        }

        for(int i : candies){
            list.add(i + extraCandies >= maxCandy);
        }

        return list;
    }
}