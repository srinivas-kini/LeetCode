# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buying_price = prices[0]
        profit = 0
        for i in range(1,len(prices)):
            buying_price = min(buying_price,prices[i])
            profit = max(profit,prices[i] - buying_price)
        return profit
