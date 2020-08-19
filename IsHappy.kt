//https://leetcode.com/problems/happy-number/
fun isHappy(n: Int): Boolean {
    var sum = 0
    var num = n
    val checked = mutableSetOf<Int>()
    while (true) {
        checked.add(num)
        while (num > 0) {
            val digit = num % 10
            sum += digit * digit
            num /= 10
        }
        if (sum == 1) return true
        if (checked.contains(sum)) return false
        num = sum
        sum = 0
    }
}

