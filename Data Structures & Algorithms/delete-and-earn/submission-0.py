class Solution:
    def deleteAndEarn(self, nums: List[int]) -> int:
        points = [0] * (max(nums) + 1)
        for num in nums:
            points[num] += num
        for i in range(2,len(points)):
            points[i] = max(points[i-1], points[i-2] + points[i])
        return points[-1]
