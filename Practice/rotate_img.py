# https://leetcode.com/problems/rotate-image/
class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        og = matrix.copy()
        col_idx = 0 
        rows = len(og)
        cols = len(og[0])
        while col_idx < cols:
            numlist = [og[i][col_idx] for i in range(rows-1,-1,-1)]
            matrix[col_idx] = numlist
            col_idx += 1
