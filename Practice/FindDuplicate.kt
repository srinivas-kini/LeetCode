//https://leetcode.com/problems/find-the-duplicate-number/
fun findDuplicate(nums: IntArray): Int {
    nums.sort()
    for (i in 1 until nums.size) {
        if (nums[i - 1] == nums[i])
            return nums[i]
    }
    return 0
}

