# https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
class Solution(object):
    def numOfSubarrays(self, arr, k, threshold):
        count = 0
        sub_arr_sum = sum(arr[:k])
        if sub_arr_sum // k >= threshold:
            count += 1
        index = 0
        for i in range(k, len(arr)):
            sub_arr_sum = sub_arr_sum - arr[index] + arr[i]
            if sub_arr_sum // k >= threshold:
                count += 1
            index += 1

        return count
