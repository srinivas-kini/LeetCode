# https://leetcode.com/problems/most-frequent-subtree-sum/
class Solution:
    def findFrequentTreeSum(self, root: TreeNode) -> List[int]:
        from collections import defaultdict
        
        if not root:
            return []
        
        def subsum(node):
            if not node:
                return 0 
            return node.val + subsum(node.left) + subsum(node.right)        
        
        q = [root]
        freqs = defaultdict(lambda: 1)
        while q:
            curr = q.pop(0)
            if curr.left:
                q.append(curr.left)
            if curr.right:
                q.append(curr.right)
            
            freqs[subsum(curr)] +=1
        maxval = max(freqs.values())
        return [k for k,v in freqs.items() if v == maxval]
