class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        if len(nums) == 2:
            return max(nums[0], nums[1])
        highestTotal = [0] * len(nums)
        highestTotal[0] = nums[0]
        highestTotal[1] = max(nums[0], nums[1])
        for i in range(2,len(nums)):
           highestTotal[i] = max(highestTotal[i - 1], highestTotal[i-2] + nums[i])#param 1 = 

        return highestTotal[-1]