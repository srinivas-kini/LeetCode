# https://leetcode.com/problems/is-subsequence/
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if not s:
            return True       
        i = 0 
        curr = s[i]       
        for c in t:
            if c == curr:
                if i == len(s) - 1:
                    return True
                else:
                    i +=1
                    curr = s[i]                    
        return False
