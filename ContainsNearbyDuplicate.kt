//https://leetcode.com/problems/contains-duplicate-ii/
fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    if (nums.isEmpty() || nums.size == 1) return false
    var head = 0
    var tail = 1

    while (head in 0 until nums.size - 1) {
        if (nums[head] == nums[tail] && tail - head <= k)
            return true
        else {
            tail++
            if (tail - head > k || tail >= nums.size) {
                head++
                tail = head + 1
            }
        }
    }

    return false
}

