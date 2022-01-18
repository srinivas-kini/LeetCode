# https://leetcode.com/problems/compare-version-numbers/
class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        
        if '.' in version1:
            q1 = [int(v) for v in version1.split('.')]
        
        else : 
            q1 = [int(version1)]
            
        if '.' in version2:
            q2 = [int(v) for v in version2.split('.')]
        
        else: 
            q2 = [int(version2)]
                
        while q1 and q1[-1] == 0:
            q1.pop()
        
        while q2 and q2[-1] == 0:
            q2.pop()
        
        idx = 0 
        while q1 and q2:
            if q1[idx] > q2[idx]:
                return 1
            if q2[idx] > q1[idx]:
                return -1 
            q1.pop(0)
            q2.pop(0)
        
        if len(q1) > len(q2):
            return 1
        if len(q2) > len(q1):
            return -1 
        
        return 0 
            
        
