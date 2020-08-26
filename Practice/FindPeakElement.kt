//https://leetcode.com/problems/find-peak-element/
fun findPeakElement(nums: IntArray): Int {
    var mx = nums.max()
    for (i in nums.indices) {
        if (nums[i] == mx)
            return i
    }
    return -1
}
