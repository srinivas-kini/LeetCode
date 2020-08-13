//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
fun sumZero(n: Int): IntArray {
    var res: IntArray = IntArray(n)
    for (i in 1..n / 2) {
        res[i - 1] = i
        res[n - i] = -i
    }
    if(n%2 == 1)
        res[n/2] = 0
    return res
}
