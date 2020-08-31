//https://leetcode.com/problems/sum-of-left-leaves/

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
fun sumOfLeftLeaves(root: TreeNode?): Int = leftSum(root, false)

fun leftSum(root: TreeNode?, isLeftNode: Boolean): Int {
    if (root == null) return 0
    return if (root.left == null && root.right == null && isLeftNode) {
        root.`val`
    } else {
        leftSum(root.left, true) + leftSum(root.right, false)
    }
}

