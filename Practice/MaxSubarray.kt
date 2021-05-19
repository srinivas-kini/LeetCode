// https://leetcode.com/problems/maximum-subarray/
class Solution { //Kadane's algorithm
    fun maxSubArray(nums: IntArray): Int {
        if (nums.size == 1) return nums.sum()
        var sum = nums[0]
        var currSum = nums[0]
        for (i in 1 until nums.size) {
            currSum = if (nums[i] > currSum + nums[i]) nums[i] else nums[i] + currSum
            sum = maxOf(sum, currSum)
        }
        return sum
    }
}
