# https://leetcode.com/problems/find-bottom-left-tree-value/
class Solution:
    def findBottomLeftValue(self, root: TreeNode) -> int:
        q = [root]
        left_val = root.val
        while q:
            vals = []
            for _ in range(len(q)):
                curr = q.pop(0)
                vals.append(curr.val)
                if curr.left:
                    q.append(curr.left)
                if curr.right:
                    q.append(curr.right)
                if not q:
                    left_val = vals[0]
        return left_val
                            
                    
            
        
