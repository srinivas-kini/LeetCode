# https://leetcode.com/problems/maximum-depth-of-binary-tree/
class Solution:
    max_depth = 0
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        
        def dfs(node,lvl):
            if not node:
                return
            self.max_depth = max(self.max_depth,lvl)
            if node.left:
                dfs(node.left,lvl+1)
            if node.right:
                dfs(node.right,lvl+1)
        
        dfs(root,1)
        return self.max_depth
        
