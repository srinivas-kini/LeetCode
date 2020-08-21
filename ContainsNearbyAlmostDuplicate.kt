//https://leetcode.com/problems/contains-duplicate-iii/
import kotlin.math.abs
fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
    if (nums.isEmpty() || nums.size == 1) return false
    var head = 0
    var tail = 1

    while (head in 0 until nums.size - 1) {
        if (abs(nums[tail].toLong() - nums[head].toLong()) <= t && tail - head <= k) {
            return true
        } else {
            tail++
            if (tail - head > k || tail >= nums.size) {
                head++
                tail = head + 1
            }
        }
    }
    return false
}