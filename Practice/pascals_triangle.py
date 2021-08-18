# https://leetcode.com/problems/pascals-triangle/
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        dp = [1]
        ans = []
        for i in range(numRows):
            ans.append(dp)
            dp = [1] + [dp[i]+dp[i+1] for i in range(len(dp)-1)]+[1]
        return ans
