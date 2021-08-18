# https://leetcode.com/problems/count-good-nodes-in-binary-tree/
class Solution:
    count = 1
    def goodNodes(self, root: TreeNode) -> int:
        if not root:
            return 0
        curr_max_node = - math.inf
        def dfs(node, seen_nodes, is_root):
            if node:
                seen_nodes.append(node.val)
                if node.val >= max(seen_nodes) and not is_root:
                    self.count +=1 
                dfs(node.left, seen_nodes.copy(), False)
                dfs(node.right, seen_nodes.copy(), False)
        dfs(root, [], True)
        return self.count
