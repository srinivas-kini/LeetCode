# https://leetcode.com/problems/max-area-of-island/
class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        
        rows = len(grid)
        cols = len(grid[0])
        visited = set()
        maxarea = 0
        
        def in_bounds(r,c):
            return r in range(rows) and c in range(cols)
        
        def dfs(r,c):
            
            if (not in_bounds(r,c)) or ((r,c) in visited) or (grid[r][c]==0):
                return 0
            visited.add((r,c))
            
            return 1 + dfs(r+1,c) + dfs(r-1,c) + dfs(r,c+1) + dfs(r,c-1)
                    
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1 and (r,c) not in visited:
                    maxarea = max(maxarea,dfs(r,c))
                            
        return maxarea
