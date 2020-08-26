package practice_problems
//https://leetcode.com/problems/largest-number-at-least-twice-of-others/
fun dominantIndex(nums: IntArray): Int {
    if (nums.isEmpty()) return -1
    val mx = nums.max()
    nums.forEach {
        if (it * 2 > mx!! && it != mx) return -1
    }
    return nums.indexOf(mx!!)
}