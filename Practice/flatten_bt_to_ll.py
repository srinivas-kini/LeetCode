# https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def flatten(self, root: TreeNode) -> None:
        
        if not root:
            return None
        
        nodes = []
        
        def preorder(root):
            if root:
                nodes.append(root)
                preorder(root.left)
                preorder(root.right)
        
        preorder(root)
        
        for i in range(len(nodes)-1):
            nodes[i].right = nodes[i+1] if nodes[i+1] else None
            nodes[i].left = None
        
            
            
            
