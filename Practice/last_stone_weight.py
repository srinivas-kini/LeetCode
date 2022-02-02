# https://leetcode.com/problems/last-stone-weight/
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        
        stones = [-stone for stone in stones]
        heapify(stones)
        
        
        while len(stones) > 1:
            
            stone1 = -heappop(stones)
            stone2 = -heappop(stones)
            
            if stone1 != stone2:
                heappush(stones,-(stone1 - stone2))
        
        
        return -heappop(stones) if stones else 0 
