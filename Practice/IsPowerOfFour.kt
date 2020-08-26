//https://leetcode.com/problems/power-of-four/
import kotlin.math.pow

fun isPowerOfFour(n: Int): Boolean {
    if (n == 1)
        return true

    var exponent = 0
    while (4.0.pow(exponent) < n) {
        exponent++
        if (4.0.pow(exponent) == n.toDouble())
            return true
    }
    return false
}
