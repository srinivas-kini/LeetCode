# https://leetcode.com/problems/self-dividing-numbers/
class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        
        def is_sd(n):
            if n == 0:
                return False
            
            x = n + 0
            while n > 0:
                dig = n % 10
                if dig == 0 or x % dig != 0:
                    return False
                n //= 10
            
            return True
    
        
        res = []
        for num in range(left,right+1):
            if is_sd(num):
                res.append(num)
        
        return res
