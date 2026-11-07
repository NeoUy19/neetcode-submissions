class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        tempSet = set()
        hasDupe = False
        for number in nums:
            tempSet.add(number)
        
        if len(tempSet) != len(nums):
            hasDupe = True
    
        return hasDupe

        