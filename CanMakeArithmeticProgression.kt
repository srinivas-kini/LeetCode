//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
import kotlin.math.abs

fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    arr.sort()
    var k = arr[1] - arr[0]
    var i = 0
    var j = 1

    while (j < arr.size) {
        var tmp = abs(arr[j] - arr[i])
        if (tmp != k)
            return false
        i++
        j++
    }
    return true
}

