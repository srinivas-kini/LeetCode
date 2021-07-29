# https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
class Solution:
    def findTarget(self, root: TreeNode, k: int) -> bool:      
        complements = set()
        q = [root]     
        while q:
            currnode = q.pop(0)
            if k - currnode.val in complements:
                return True
            complements.add(currnode.val)
            if currnode.left:
                q.append(currnode.left)
            if currnode.right:
                q.append(currnode.right)
        return False
