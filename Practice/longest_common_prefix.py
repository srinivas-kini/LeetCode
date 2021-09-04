# https://leetcode.com/problems/longest-common-prefix/
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        shortest = list(sorted(strs, key = len))[0]
        lcp = ''
        break_outer = False
        for i,char in enumerate(shortest):
            for j,s in enumerate(strs):
                if s[i] == char:
                    if j == len(strs) - 1:
                        lcp += char
                else:
                    break_outer = True
                    break
            if break_outer:
                break                    
        return lcp
        
            
            
