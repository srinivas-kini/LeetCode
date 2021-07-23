# https://leetcode.com/problems/smallest-string-starting-from-leaf/
class Solution:
    smallest = 'z' * 8501
    def smallestFromLeaf(self, root: TreeNode) -> str:
        if not root:
            return ''
        
        def dfs(node,curr_str):
            curr_str = chr(node.val + 97) + curr_str # ASCII conversion.
            if not node.left and not node.right:
                self.smallest = min(self.smallest,curr_str)
                return
            if node.left:
                dfs(node.left, str(curr_str))
            if node.right:
                dfs(node.right, str(curr_str))
        
        dfs(root,'')
        return self.smallest
