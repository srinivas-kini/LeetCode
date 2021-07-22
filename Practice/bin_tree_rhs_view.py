# https://leetcode.com/problems/binary-tree-right-side-view/
class Solution:
    def rightSideView(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        q = [root]
        ans = []
        while q:
            vals = []
            for i in range(len(q)):
                currnode = q.pop(0)
                vals.append(currnode.val)
                if currnode.left:
                    q.append(currnode.left)
                if currnode.right:
                    q.append(currnode.right)
            ans.append(vals[-1])
        return ans
