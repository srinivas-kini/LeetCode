# https://leetcode.com/problems/pascals-triangle-ii/
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        dp = [1]
        for i in range(rowIndex):
            dp = [1] + [dp[i]+dp[i+1] for i in range(len(dp)-1)] +[1]
        return dp
        
