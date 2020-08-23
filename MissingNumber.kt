//https://leetcode.com/problems/missing-number/
fun missingNumber(nums: IntArray): Int = (nums.size * (nums.size + 1)) / 2 - nums.sum()

