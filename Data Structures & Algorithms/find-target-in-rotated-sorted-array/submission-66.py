class Solution:
    def search(self, nums: List[int], target: int) -> int:
        i = 0
        j = len(nums) - 1
        mid = 0
        while (i <= j):
            mid = (i + j) // 2
            if (nums[mid] == target):
                return mid
            if (nums[i] == target):
                return i
            if nums[j] == target:
                return j
            if (mid == i or mid == j):
                return -1
            if (nums[mid] > nums[i]): #left side is sorted
                if (target >= nums[i] and target < nums[mid]): #search through leftside
                    j = mid
                else:
                    i = mid
            elif (nums[mid] < nums[i]): #right side is sorted
                if (target <=  nums[j] and target > nums[mid]): #check if its in rightside
                    i = mid 
                else: #not in right side go left
                    j = mid 
        return 5
                

