//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
fun subtractProductAndSum(n: Int): Int {
    if (n == 0) return 0

    var prod = 1
    var sum = 0
    var num = n

    while (num > 0) {
        var digit = num % 10
        prod *= digit
        sum += digit
        num /= 10
    }

    return prod - sum
}
