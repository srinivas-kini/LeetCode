# https://leetcode.com/problems/valid-mountain-array/submissions/
class Solution:
    def validMountainArray(self, arr):
        if len(arr) <= 2:
            return False
        peak = max(arr)
        peak_index = arr.index(peak)
        size = len(arr)
        if peak_index == 0 or peak_index == size -1:
            return False
        if size == 3 and not (arr[0] < arr[1] > arr[2]):
            return False
        for i in range(peak_index - 1):
            if arr[i] == peak or arr[i + 1] <= arr[i]:
                return False
        for i in range(peak_index + 1, size - 1):
            if arr[i] == peak or arr[i + 1] >= arr[i]:
                return False
        return True
    
    
