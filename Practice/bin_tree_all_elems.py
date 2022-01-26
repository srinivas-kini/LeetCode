# https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
import bisect
class Solution:
    def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
        arr = []
        
        def inorder(root):
            if not root:
                return
            inorder(root.left)
            idx = bisect.bisect_left(arr,root.val)
            arr.insert(idx,root.val)
            inorder(root.right)
            
        inorder(root1)
        inorder(root2)
        
        return arr
