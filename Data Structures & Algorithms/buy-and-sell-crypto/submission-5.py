class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minBuy = math.inf
        maxProfit = 0
        for i in range(len(prices)):
            if prices[i] < minBuy:
                minBuy = prices[i]
            if prices[i] - minBuy > maxProfit:
                maxProfit = prices[i] - minBuy
            # maxProfit = max(maxProfit,prices[i] - minBuy)
        return maxProfit