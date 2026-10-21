class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        return _search( nums, target, i, j);
    }
    private int _search (int[] nums, int target, int lo, int hi){
        if (lo > hi){
            return -1;
        }
            int mid = (lo + hi) / 2;
            if (target == nums[mid]){
                return mid;
            }
            if (nums[lo] <= nums[mid] && nums[mid] < nums[hi]){//case where the array is already fully sorted
                return binarySearch(nums, target,lo, hi);
            } 
            if (nums[mid] >= nums[lo]){ //if mid is greater than left 
                if (target < nums[mid] && target >= nums[lo]){
                    return binarySearch(nums, target,lo, mid-1);
                }
                else{
                    return _search( nums,target,mid+1,hi);
                }
            }
            else { //mid is less than right
                if (target <= nums[hi] && target > nums[mid]){
                return  binarySearch(nums, target,mid+1 ,hi);
                }
                else {
                    return _search( nums,target, lo, mid-1);

                }
            }


    }

    private int binarySearch (int[] nums, int target, int lo, int hi){
        if (lo > hi) {
            return -1;
        }
        int mid = (lo + hi)/2;
        if (target == nums[mid]){
            return mid;
        }
        
        if (target > nums[mid]){
            return binarySearch(nums,target,mid+1 ,hi);
        }
        else if (target < nums[mid]){
            return binarySearch(nums,target,lo,mid-1);
        }
        return -1;
    }
}
