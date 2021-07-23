# https://leetcode.com/problems/binary-tree-paths/

class Solution:
    def binaryTreePaths(self, root: TreeNode) -> List[str]:
        
        if not root:
            return []
        
        paths = []
        
        def dfs(node,currpath):
            
            if not node.left and not node.right:
                currpath += str(node.val)
                paths.append(currpath)
                return
            
            currpath += str(node.val)+'->'
            if node.left:
                dfs(node.left, str(currpath))
            if node.right:
                dfs(node.right, str(currpath))
                 
        dfs(root,'')
        return paths
    
