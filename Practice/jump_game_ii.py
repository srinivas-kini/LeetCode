# https://leetcode.com/problems/jump-game-ii/
class Solution:
    def jump(self, nums: List[int]) -> int:
        
        q = deque()
        q.append((0,0))
        goal = len(nums) - 1
        visited = set()
        visited.add(0)
        
        while q:
            
            curr_idx, curr_steps = q.popleft()
            max_jump = nums[curr_idx]
            
            if curr_idx == goal:
                return curr_steps
            
            
            neighbors = [curr_idx + i for i in range(max_jump+1)]
            
            for index in neighbors:
                if index not in visited:
                    visited.add(index)
                    q.append((index,curr_steps+1))
        
        
        return -1
