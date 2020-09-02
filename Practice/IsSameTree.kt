//https://leetcode.com/problems/same-tree/
fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
    if (p == null && q == null) true
    else if (p?.`val` != q?.`val` || p == null && q != null || p != null && q == null) false
    else isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
