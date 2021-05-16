# https://leetcode.com/problems/lexicographical-numbers/submissions/
class Solution(object):
    def lexicalOrder(self, n):
        return sorted([i + 1 for i in range(n)], key=lambda x: str(x))
