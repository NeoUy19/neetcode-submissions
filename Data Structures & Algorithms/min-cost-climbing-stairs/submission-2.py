class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        #approach have a list that holds the minimum cost per step where each index is a new step. indexed at 0, first step is going to be in 0
        stepCost = [0,0]

        for i in range(2,len(cost)+1):
            stepCost.append((min(stepCost[i-1] + cost[i-1], stepCost[i-2] + cost[i-2])))
           

        return stepCost[-1]