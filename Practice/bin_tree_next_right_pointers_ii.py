# https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if not root:
            return None
        
        rootref = root
        q = [root]
        
        while q:
            vals = []
            for _ in range(len(q)):
                currnode = q.pop(0)
                vals.append(currnode)
                if currnode.left:
                    q.append(currnode.left)
                if currnode.right:
                    q.append(currnode.right)
            
            for i in range(len(vals)-1):
                vals[i].next = vals[i+1] if vals[i+1] else None

        return rootref
