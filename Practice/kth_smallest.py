class Solution:
    def kthSmallest(self, matrix, k):
        flattened = sorted(set([x for l in matrix for x in l]))
        return flattened[k - 1]
s = Solution()

print(s.kthSmallest([[1,5,9],[10,11,13],[12,13,15]],8))