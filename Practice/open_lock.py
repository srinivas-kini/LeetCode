# https://leetcode.com/problems/open-the-lock
class Solution:
    def openLock(self, deadends: List[str], target: str) -> int:
        
        if target in deadends or '0000' in deadends:
            return -1
        
        
        def successors(state):
            
            res = []
            for i in range(len(state)):
                curr = int(state[i])
                # increment
                res.append(state[:i] + str((curr + 1) % 10) + state[i+1:])
                # decrement
                res.append(state[:i] + str((curr + 9) % 10) + state[i+1:])
            
            # print(res)
            return res
        
        visited = set(deadends)
        q = deque()
        q.append(('0000',0))
        visited.add('0000')
        
        while q:
            
            state, n_moves = q.popleft()
            if state == target:
                return n_moves
            
            for s in successors(state):
                if s not in visited:
                    visited.add(s)
                    q.append((s,n_moves+1))
            
        return -1
