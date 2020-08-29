https://leetcode.com/problems/maximum-depth-of-binary-tree/
 fun maxDepth(root: TreeNode?): Int {
            if (root == null) return 0
            val rDepth = maxDepth(root.right) + 1
            val lDepth = maxDepth(root.left) + 1
            return maxOf(lDepth, rDepth)
        }
