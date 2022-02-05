# https://leetcode.com/problems/jump-game-iii/
class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:
        
        
        def in_bounds(idx):
            return idx in range(len(arr))
        
        if not in_bounds(start):
            return False
        
        q = deque()
        q.append(start)
        
        visited = {start,}
        
        while q:

            i = q.popleft()

            if arr[i] == 0:
                return True
            
            for index in [arr[i] + i, i - arr[i]]:
                if index not in visited and in_bounds(index):
                    visited.add(index)
                    q.append(index)


        return False
