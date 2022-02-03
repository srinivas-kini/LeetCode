# https://leetcode.com/problems/greatest-common-divisor-of-strings/
class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        
        if set(str1) != set(str2):
            return ""
        
        m,n = len(str1),len(str2)
        
        gcd = list(str1) if m < n else list(str2)
        
        while gcd:
            
            gcdlen = len(gcd)
            
            cmp1 = m // gcdlen
            cmp2 = n // gcdlen
            gcdstr = ''.join(gcd)
            
            if gcdstr * cmp1 == str1 and gcdstr * cmp2 == str2:
                return gcdstr
            
            gcd.pop()
        
        return ""
        
        
        
        
        
        
        
