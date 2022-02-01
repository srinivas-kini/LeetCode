# https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumEvenGrandparent(self, root: TreeNode) -> int:
        
        sum_ = 0
        
        def dfs(gp,p,root,lvl):
            nonlocal sum_
            if not root:
                return 
            # print(gp.val,p,root)
            if lvl == 0:
                dfs(None, root, root.left, lvl+1)
                dfs(None, root, root.right, lvl+1)

            if lvl > 0:
                if gp and gp.val % 2 == 0:
                    sum_ += root.val

                dfs(p,root,root.left,lvl+1)
                dfs(p,root,root.right,lvl+1)                        
                
                
        dfs(None,None,root,0)
        
        return sum_
