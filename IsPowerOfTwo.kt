import kotlin.math.pow

fun isPowerOfTwo(n: Int): Boolean {
    if (n == 1)
        return true

    var exponent = 0
    while (2.0.pow(exponent) < n) {
        exponent++
        if (2.0.pow(exponent) == n.toDouble())
            return true
    }
    return false
}
