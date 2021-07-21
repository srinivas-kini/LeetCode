# https://leetcode.com/problems/path-sum-ii/submissions/
class Solution:
    def pathSum(self, root: TreeNode, targetSum: int) -> List[List[int]]:
        paths = []
        sum_paths = []

        def dfs(root):
            if root:
                paths.append(root.val)
                if not root.left and not root.right:
                    if sum(paths) == targetSum:
                        sum_paths.append(paths.copy())
                else:
                    dfs(root.left)
                    dfs(root.right)
                paths.pop()

        dfs(root)
        return sum_paths
