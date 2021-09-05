# https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
class FindElements:
    def __init__(self, root: Optional[TreeNode]):
        self.nodevals = set()
        contaminated = root
        contaminated.val = 0
        self.nodevals.add(0)
        q = [(0,contaminated)]
        while q:
            for _ in range(len(q)):
                ind, curr = q.pop(0)
                if curr.left:
                    curr.left.val = 2*ind + 1
                    self.nodevals.add(curr.left.val)
                    q.append((curr.left.val,curr.left))
                if curr.right:
                    curr.right.val = 2*ind + 2
                    self.nodevals.add(curr.right.val)
                    q.append((curr.right.val,curr.right))                   
        self.root = contaminated
        
    def find(self, target: int) -> bool:
        return target in self.nodevals
