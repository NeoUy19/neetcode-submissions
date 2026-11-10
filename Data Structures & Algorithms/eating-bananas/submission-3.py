class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
       #approach: create a list from 1 to the max value of piles, run binary search, when a mid value/k is found test if the total hours it takes to eat all the bananas in the pile is <= h if it is search left, if it is greater than h search right:
        lo = 1
        hi = max(piles)
        while lo < hi:
            mid = (lo + hi) // 2
            hourCount = 0
            for numBanana in piles:
               hourCount += math.ceil(numBanana/mid)
            if hourCount <= h:
                hi = mid 
            elif hourCount > h:
                lo = mid + 1
        return lo