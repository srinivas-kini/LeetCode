/**
 // https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MaxAncestorDiff {
    int diff = 0;
    public int maxAncestorDiff(TreeNode root) {
        this.dfs(root, new ArrayList<Integer>());
        return this.diff;
    }
    
    public void dfs(TreeNode node, List<Integer> seen){
        
        if(node != null){
        seen.add(node.val);
        
        if(node.left == null && node.right == null){
            this.diff = Math.max(diff, Collections.max(seen) - Collections.min(seen));
            return;
        }
        dfs(node.left,new ArrayList<Integer>(seen));
        dfs(node.right, new ArrayList<Integer>(seen));
    }
}
}
