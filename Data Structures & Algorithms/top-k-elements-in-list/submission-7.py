class Solution:
    #approach: map out nums where the key is their number and their value is how many of them are their. create a list of list and call it buckets where each index is the number of values a number has. at the end, loop from the back of the buckets and add the k ones in the highest index.
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mapped = {}
        for i in range(len(nums)):
            mapped[nums[i]] = mapped.get(nums[i], 0) + 1
        buckets = [[] for _ in range((len(nums)+1))]
        for num, count in mapped.items():
                buckets[count].append(num)
        # print(buckets)
        result = []
        count = 0 
        for i in reversed(range(len(buckets))):
            if buckets[i]:
                for num in buckets[i]:
                    result.append(num)
                    count += 1
                if count == k:
                    return result
        return result
        
        

        
