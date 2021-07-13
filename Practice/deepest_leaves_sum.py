# https://leetcode.com/problems/deepest-leaves-sum/

class Solution:
    curr_max_level = 0
    curr_sum = 0
    def deepestLeavesSum(self, root: TreeNode) -> int:
        self.dls(root,0)
        return self.curr_sum
    
    def dls(self,root,level):
        
        if not root.left and not root.right:
            if level == self.curr_max_level:
                self.curr_sum += root.val
            
            if level > self.curr_max_level:
                self.curr_sum = root.val
                self.curr_max_level = level
            return
        
        if root.left:
            self.leaf_sum(root.left,level+1)
        
        if root.right:
            self.leaf_sum(root.right,level+1)
            
        
    
        
