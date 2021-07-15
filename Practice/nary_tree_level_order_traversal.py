# https://leetcode.com/problems/n-ary-tree-level-order-traversal/
class Solution:
    def levelOrder(self, root: 'Node') -> List[List[int]]:
        if not root:
            return []
        q = [root]
        ans = []
        while q:
            vals = []
            for i in range(len(q)):
                node = q.pop(0)
                q += [child for child in node.children]
                vals.append(node.val)
            if vals:
                ans.append(vals)
        return ans
