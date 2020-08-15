//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    var res = IntArray(nums.size)
    var i = 0
    var j = 0

    while (j < nums.size) {
        var curr = nums[i]
        var count = 0
        for (k in nums.indices) {
            if (nums[k] < curr)
                count++
            res[i] = count
        }
        i++
        j++
    }

    return res
}

