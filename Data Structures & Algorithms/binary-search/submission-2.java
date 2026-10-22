class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length -1 ;
        return _binarySearch(nums, target, hi, lo);
    }

    private int _binarySearch(int[] nums, int target, int hi, int lo){
        int mid = (hi + lo)/ 2;
        if (lo > hi){
            return -1;
        }
        if (nums[mid] == target){
            return mid;
        }
        if (nums[mid] > target){
                        return _binarySearch(nums, target, mid-1, lo);

        }
        else if (nums[mid] < target){ //go left
            return _binarySearch(nums, target, hi ,mid+1);
        }
        return -1;
    }
}
