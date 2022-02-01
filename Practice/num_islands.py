# https://leetcode.com/problems/number-of-islands/
class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        
        rows = len(grid)
        cols = len(grid[0])
        visited = set()
        
        def in_bounds(r,c):
            return r in range(rows) and c in range(cols)
        
        def dfs(r,c):
            
            if ((r,c) in visited) or (not in_bounds(r,c)) or (grid[r][c]=="0"):
                return 
        
            visited.add((r,c))
            
            dfs(r-1,c)
            dfs(r+1,c)
            dfs(r,c+1)
            dfs(r,c-1)

        
        count = 0 
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1" and (r,c) not in visited:
                    dfs(r,c)
                    count += 1
        
        return count 
        
