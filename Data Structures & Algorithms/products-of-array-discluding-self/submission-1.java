class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lengthOfNums = nums.length; 
       int[] prefix = new int[lengthOfNums]; //everything to the left of i (left to right)
       int[] suffix = new int [lengthOfNums]; //everything to the right of i (right to left)
       int[] output = new int [lengthOfNums]; // prefix * suffix
        prefix[0] = 1; //hardcoded 
        for (int i = 1 ; i < lengthOfNums ; i++){ //prefix loop
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[lengthOfNums-1] = 1;
        for (int i = lengthOfNums - 2 ; i >= 0 ; i--){ //suffix loop
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for (int i = 0 ; i < lengthOfNums ; i++){
            output[i] = prefix[i] * suffix[i];
        }
        return output;
    }
}  
