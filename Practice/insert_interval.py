# https://leetcode.com/problems/insert-interval/
class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        
        intervals.append(newInterval)
        intervals.sort(key = lambda e: e[0])
        
        stack = [intervals[0]]
        idx = 1
        
        while idx < len(intervals) and stack:
            
            u1,v1 = stack.pop()
            u2,v2 = intervals[idx]
            
            if v1 in range(u2,v2+1) and u2 in range(u1,v1+1):
                stack.append([u1,v2])
            
            elif u2 in range(u1,v1+1) and v2 in range(u1,v1+1):
                stack.append([u1,v1])
            
            elif u1 in range(u2,v2+1) and v1 in range(u2,v2+1):
                stack.append([u2,v2])
                
            else:
                stack.append([u1,v1])
                stack.append([u2,v2])
            
            idx += 1
        
        
        return stack 
