class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        def backtrack(i , subset):
            if i == len(nums): 
                result.append(subset[::])
                return
            #include nums[i]
            subset.append(nums[i])
            backtrack(i + 1, subset)
            subset.pop()
            #dont include nums[i]
            backtrack(i+1 , subset)
        backtrack(0, [])
        return result
        