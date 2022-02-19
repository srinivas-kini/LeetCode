class Solution:
    # https://leetcode.com/problems/is-graph-bipartite/
    def isBipartite(self, graph: List[List[int]]) -> bool:
        
        adj = defaultdict(list)
        for node,edges in enumerate(graph):
            adj[node] = edges
        
        
        q = deque()
        colors = [0] * len(graph)
        
        
        for node in adj:
            
            if colors[node] == 0:
                colors[node] = 1
                q.append(node)
            
            while q:
                currnode = q.popleft()
                
                for n in adj[currnode]:
                    if colors[n] == 0:
                        colors[n] = - colors[currnode]
                        q.append(n)
                    
                    elif colors[currnode] == colors[n]:
                        return False
        
        
        return True
                
            
            
            
            
