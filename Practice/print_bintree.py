# https://leetcode.com/problems/print-binary-tree/
class Solution:
    def printTree(self, root: Optional[TreeNode]) -> List[List[str]]:
      
        def get_height(root):
            if not root:
                return 0 
            return 1 + max(get_height(root.left),get_height(root.right))
        
        height = get_height(root)
        cols = pow(2, height) - 1
        rows = height
        tree= [["" for _ in range(cols)] for _ in range(rows)]
        
        def buildtree(i, root, lo, hi):
            if root and i < height:
                mid = (lo + hi)//2
                tree[i][mid] = str(root.val)
                buildtree(i+1, root.left, lo, mid)
                buildtree(i+1, root.right, mid+1, hi)
        
        buildtree(0,root,0,cols)
        return tree
