class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length; i++){
            int numNeeded = target - nums[i];

            if (map.containsKey(numNeeded)){
                return new int[] {map.get(numNeeded),i};
            }

            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
