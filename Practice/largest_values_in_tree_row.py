# https://leetcode.com/problems/find-largest-value-in-each-tree-row/
class Solution:
    def largestValues(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        ans = []
        q = [root]
        while q:
            maxval = -math.inf
            for i in range(len(q)):
                curr = q.pop(0)
                maxval = max(curr.val,maxval)
                if curr.left:
                    q.append(curr.left)
                if curr.right:
                    q.append(curr.right)
            ans.append(maxval)
        return ans
