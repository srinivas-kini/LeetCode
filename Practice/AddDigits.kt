//https://leetcode.com/problems/add-digits/
// O(N) Solution
fun addDigits(num: Int): Int {
    if (num in 0..9) return num
    var n = num
    var sum = 0
    while (true) {
        while (n > 0) {
            val digit = n % 10
            sum += digit
            n /= 10
        }
        if (sum in 0..9)
            break
        n = sum
        sum = 0
    }
    return sum
}

//O(1) Solution
fun addDigits2(num: Int): Int {
    return if (num in 0..9) num else if (num % 9 == 0) 9 else num % 9
}


