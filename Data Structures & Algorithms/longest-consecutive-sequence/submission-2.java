class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        int currLongest = 0;
        for (int i = 0 ; i < nums.length ; i++){
            temp.add(nums[i]);
        }
        for(int c : temp){
            int longestSeq = 0;
            if (!temp.contains(c-1)){
                longestSeq++;
                while(temp.contains(c+1)){
                    c++;
                    longestSeq++;
                }
                if (longestSeq > currLongest){
                    currLongest = longestSeq;
                }
            }
            longestSeq = 0;
        }
        return currLongest;
    }
}
