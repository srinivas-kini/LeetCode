// https://leetcode.com/problems/minimum-depth-of-binary-tree/
class Solution {
    var minDep = Integer.MAX_VALUE
    fun minDepth(root: TreeNode?): Int {
        if(root==null)
            return 0
        dfs(root,1)
        return minDep
    }
    
    fun dfs(node: TreeNode?, level: Int){
        
        if(node == null)
            return
        
        if(node?.left == null && node?.right == null){
            minDep = Math.min(minDep,level)
        }
        
        dfs(node?.left,level+1)
        dfs(node?.right,level+1)
    }
}
