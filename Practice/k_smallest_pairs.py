# https://leetcode.com/problems/find-k-pairs-with-smallest-sums/submissions/
class Solution:
    def kSmallestPairs(self, nums1, nums2, k):
        if len(nums1) == 1 and len(nums2) == 1:
            return [[nums1[0], nums2[0]]]
        p = [[n1, n2] for n1 in nums1 for n2 in nums2]
        p = sorted(p, key=lambda n: n[0] + n[1])
        return [p.pop(0) for _ in range(0, k) if p]


