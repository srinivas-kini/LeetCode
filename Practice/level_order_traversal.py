# https://leetcode.com/problems/binary-tree-level-order-traversal/
class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        
        q = [root]
        ans = []
        
        while q:
            vals = []
            for i in range(len(q)):
                node = q.pop(0)
                vals.append(node.val)
                if node.left:
                    q.append(node.left) 
                if node.right:
                    q.append(node.right)
            ans.append(vals)
        
        return ans
