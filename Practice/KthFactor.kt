//https://leetcode.com/problems/the-kth-factor-of-n/
fun kthFactor(n: Int, k: Int): Int {

    if (k > n) return -1
    if (k == 1) return 1

    var ct = 0
    for (i in (1..n)) {
        if (n % i == 0) {
            ct++
            if (ct == k) return i
        }
    }
    return -1
}

