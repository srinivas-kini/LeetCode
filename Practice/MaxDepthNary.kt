https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
fun maxDepth(root: Node?): Int {
    if (root == null) return 0
    var max = 0
    root.children.forEach { child ->
        max = maxOf(max, maxDepth(child))
    }
    return max + 1
}
