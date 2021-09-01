# https://leetcode.com/problems/coin-change/submissions/
class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        
        dp = [0] + [amount+1]*amount
        
        for i in range(1,len(dp)):
            for coin in coins:
                if coin <= i:
                    dp[i] = min(dp[i-coin]+1,dp[i])              
        return dp[-1] if dp[-1] != amount + 1 else -1
