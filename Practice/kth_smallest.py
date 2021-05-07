# https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/submissions/
class Solution:
    def kthSmallest(self, matrix, k):
        flattened = sorted([x for l in matrix for x in l])
        return flattened[k - 1]
