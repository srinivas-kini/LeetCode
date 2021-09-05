# https://leetcode.com/problems/complete-binary-tree-inserter/
class CBTInserter:
    
    def __init__(self, root: Optional[TreeNode]):
        self.root = root

    def insert(self, val: int) -> int:    
        
        if not self.root:
            self.root = TreeNode(val)
            return self.root.val
        
        q = [self.root]
        while q:
            for _ in range(len(q)):
                parent = q.pop(0)
                
                if not parent.left:
                    parent.left = TreeNode(val)
                    return parent.val
                else:
                    q.append(parent.left)
                
                if not parent.right:
                    parent.right = TreeNode(val)
                    return parent.val
                else:
                    q.append(parent.right)
        

    def get_root(self) -> Optional[TreeNode]:
        return self.root


# Your CBTInserter object will be instantiated and called as such:
# obj = CBTInserter(root)
# param_1 = obj.insert(val)
# param_2 = obj.get_root()
