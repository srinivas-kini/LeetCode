# https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
class Solution:
    def kWeakestRows(self, mat, k):
        soldiers_in_row = {index: sum(row) for index, row in enumerate(mat)}
        soldiers_in_row = sorted(soldiers_in_row.items(), key=lambda item: item[1])
        return [soldiers_in_row[i][0] for i in range(k)]
