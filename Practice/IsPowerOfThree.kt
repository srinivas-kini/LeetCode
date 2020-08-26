//https://leetcode.com/problems/power-of-three/
import kotlin.math.pow

fun isPowerOfThree(n: Int): Boolean {
    if (n == 1)
        return true

    var exponent = 0
    while (3.0.pow(exponent) < n) {
        exponent++
        if (3.0.pow(exponent) == n.toDouble())
            return true
    }
    return false
}