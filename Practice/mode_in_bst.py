# https://leetcode.com/problems/find-mode-in-binary-search-tree/submissions/
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):

    def findMode(self, root):
        modes = {}
        self.traverse(root, modes)
        mode = max(modes.values())
        return [k for k,v in modes.items() if v==mode]

    def traverse(self, root, modes):
        if root:
            if root.val not in modes:
                modes[root.val] = 1
            else:
                modes[root.val] += 1
        if root.left:
            self.traverse(root.left, modes)
        if root.right:
            self.traverse(root.right, modes)

        
