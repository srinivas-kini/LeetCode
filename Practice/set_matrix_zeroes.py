# https://leetcode.com/problems/set-matrix-zeroes/
class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rowlen = len(matrix)
        collen = len(matrix[0])
        zeroes = set((r,c) for r in range(rowlen) for c in range(collen) if matrix[r][c] == 0)
        print(zeroes)
        for i in range(rowlen):
            for j in range(collen):
                if (i,j) in zeroes:
                    row,col = i,j
                    for x in range(rowlen):
                        matrix[x][col] = 0
                    for y in range(collen):
                        matrix[row][y] = 0
                  
