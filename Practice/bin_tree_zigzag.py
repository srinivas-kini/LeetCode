# https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
class Solution:
    def zigzagLevelOrder(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        l2r = False
        q = [root]
        ans = []
        while q:
            vals = []
            l2r = not l2r
            for _ in range(len(q)):
                currnode = q.pop(0)
                vals.append(currnode.val)
                if currnode.left:
                    q.append(currnode.left)
                if currnode.right:
                    q.append(currnode.right)
            ans.append(vals if l2r else list(reversed(vals)))
        return ans
