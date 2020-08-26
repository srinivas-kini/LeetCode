//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
fun numberOfSteps(num: Int): Int {
    var steps = 0
    var n = num
    while (n > 0) {
        steps++
        n = if (n % 2 == 0) n / 2 else --n
    }
    return steps
}
