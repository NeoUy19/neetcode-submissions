class Solution:
    def findMin(self, nums: List[int]) -> int:
        lo = 0 
        hi = len(nums) - 1
        minVal = nums[0]
        while lo <= hi:
            if nums[lo] < nums[hi]:
                minVal = min(minVal, nums[lo])
                break
            mid = (lo + hi) // 2
            minVal = min(minVal, nums[mid])
            if nums[mid] >= nums[lo]:#search right
                lo = mid + 1
            else: #search left
                hi = mid - 1
        return minVal