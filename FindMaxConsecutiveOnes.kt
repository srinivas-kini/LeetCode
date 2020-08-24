package practice_problems
//https://leetcode.com/problems/max-consecutive-ones/
fun findMaxConsecutiveOnes(nums: IntArray): Int {
    if (nums.sum() == nums.size) return nums.size
    var maxOnes = 0
    var currMax = 0

    for (i in nums.indices) {
        if (nums[i] == 1) {
            currMax++
            maxOnes = myMax(currMax, maxOnes)
        } else currMax = 0
    }
    return maxOnes
}

fun myMax(a: Int, b: Int): Int {
    return if (a >= b) a else b
}
