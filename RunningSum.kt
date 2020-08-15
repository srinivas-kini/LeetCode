//https://leetcode.com/problems/running-sum-of-1d-array/
fun runningSum(nums: IntArray): IntArray {
    val res = IntArray(nums.size)
    var sum = 0
    for (i in nums.indices) {
        sum += nums[i]
        res[i] = sum
    }
    return res
}