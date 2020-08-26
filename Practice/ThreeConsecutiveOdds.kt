//https://leetcode.com/problems/three-consecutive-odds/
fun threeConsecutiveOdds(arr: IntArray): Boolean {
    var count = 0
    for (i in arr.indices)
        if (arr[i] % 2 != 0) {
            count++
            if (count == 3) return true
        } else count = 0
    return false
}

