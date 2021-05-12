# https://leetcode.com/problems/k-closest-points-to-origin/
class Solution(object):
    def kClosest(self, points, k):
        sorted_points = sorted(points, key=lambda n: n[0] * n[0] + n[1] * n[1])
        return sorted_points[:k]
