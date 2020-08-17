//https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
fun minStartValue(nums: IntArray): Int {
    var startValue = 1
    var i = 0
    var stepSum = 0

    while (i in nums.indices) {
        stepSum = if (i == 0) nums[i] + startValue else nums[i] + stepSum
        if (stepSum < 1) {
            startValue++
            i = 0
        } else
            i++
    }
    return startValue
}

