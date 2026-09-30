class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lengthOfNums = nums.length;
        int[] prefix = new int[lengthOfNums];
        int[] suffix = new int[lengthOfNums];
        int[] product = new int[lengthOfNums];
        prefix[0] = 1;
        for(int i = 1 ; i < lengthOfNums; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[lengthOfNums-1] = 1;
        for(int i = lengthOfNums - 2 ; i >= 0 ; i-- ){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for (int i = 0 ; i < lengthOfNums ; i++){
            product[i] = suffix[i] * prefix[i];
        }

        return product;
    }
}  
