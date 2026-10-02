class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num = new HashSet<>();

        for (int i = 0 ; i < nums.length; i++){
            num.add(nums[i]);
        }

        int longestSequence = 0;
        for (int c : num){
            int currSeq = 0;
            if (!num.contains(c-1)){
                currSeq++;
                while(num.contains(c+1)){
                    currSeq++;
                    c++;
                }
                if (currSeq > longestSequence){
                    longestSequence = currSeq;
                }
            }
        }
        return longestSequence;
    }
}
