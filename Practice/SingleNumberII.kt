//https://leetcode.com/problems/single-number-ii/
class Solution {
    fun singleNumber(nums: IntArray): Int {

    if (nums.size == 1) return nums[0]

    nums.sort()
    var index = 0
    var res = 0

    for (i in nums.indices) {
        if (i == 0 && nums[i] != nums[i + 1])
            res = nums[i]
        if (i != 0)
            if (i < nums.size - 1 && nums[i - 1] != nums[i] && nums[i] != nums[i + 1])
                res = nums[i]
        if (i == nums.size - 1 && nums[i - 1] != nums[i])
            res = nums[i]
    }

    return res
}

}
