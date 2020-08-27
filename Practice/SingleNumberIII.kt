//https://leetcode.com/problems/single-number-iii/
fun singleNumber(nums: IntArray): IntArray {

    if (nums.size == 1) return nums

    val res = IntArray(2)
    nums.sort()
    var index = 0

    for (i in nums.indices) {
        if (i == 0 && nums[i] != nums[i + 1])
            res[index++] = nums[i]
        if (i != 0)
            if (i < nums.size - 1 && nums[i - 1] != nums[i] && nums[i] != nums[i + 1])
                res[index++] = nums[i]
        if (i == nums.size - 1 && nums[i - 1] != nums[i])
            res[index++] = nums[i]
    }

    return res
}

