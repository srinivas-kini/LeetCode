# https://leetcode.com/problems/search-a-2d-matrix/submissions/
class Solution:
    def searchMatrix(self, matrix, target):
        flat_map = [elem for arr in matrix for elem in arr]
        return target in flat_map