class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        sortedNums = sorted(nums)
        for i in range(len(sortedNums)):
                if i > 0 and sortedNums[i] == sortedNums[i-1]:
                    continue
                j = i + 1
                k = len(sortedNums) - 1
                while (j < k):
                    jkSum = sortedNums[j] + sortedNums[k]
                    if jkSum == -sortedNums[i]:
                        result.append([sortedNums[i], sortedNums[j], sortedNums[k]])
                        k-=1
                        j+=1
                        while j<k and sortedNums[j] == sortedNums[j-1]:
                            j += 1
                        while j < k and sortedNums[k] == sortedNums[k+1]:
                            k -= 1
                    elif jkSum > -sortedNums[i]:
                        k -= 1
                    elif jkSum < -sortedNums[i]:
                        j +=1

        return result 

        