class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapped = dict()
        for i in range(len(nums)):
            need = target - nums[i]

            if need in mapped:
                return [mapped.get(need),i]
            
            mapped[nums[i]] = i
        return []
