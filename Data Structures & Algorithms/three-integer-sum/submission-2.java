class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int j = i+1;
            int k = nums.length-1;
            while (j < k){
                int jkTotal = nums[j] + nums[k];
                if ( jkTotal < target){
                    j++;
                }
                else if (jkTotal > target){
                    k--;
                }
                else if (jkTotal == target){
                    result.add(Arrays.asList(nums[i], nums[j],nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1 ]){
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
