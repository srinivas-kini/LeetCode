# https://leetcode.com/problems/time-needed-to-buy-tickets/
class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        
        q = deque(enumerate(tickets))
        time = 0
        
        while q:
            
            i,t = q.popleft()
            t -= 1
            time += 1
            
            if i == k and t == 0:
                return time 
            
            if t > 0:
                q.append((i,t))
        
        
        return time 
        
            
            
