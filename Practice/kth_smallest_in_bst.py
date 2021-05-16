# https://leetcode.com/problems/kth-smallest-element-in-a-bst/
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution(object):
    def kthSmallest(self, root, k):
        vals = set()
        self.traverse(root, vals)
        return sorted(list(vals))[k - 1]

    def traverse(self, root, vals):
        if root:
            vals.add(root.val)
        else:
            return vals
        if root.left:
            self.traverse(root.left, vals)
        if root.right:
            self.traverse(root.right, vals)
