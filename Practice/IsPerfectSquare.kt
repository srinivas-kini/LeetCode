package practice_problems
//https://leetcode.com/problems/valid-perfect-square/
fun isPerfectSquare(num: Int): Boolean {
    var n = 1
    while (n <num/n) n++
    return n*n == num
}

