//https://leetcode.com/problems/jewels-and-stones/
fun numJewelsInStones(J: String, S: String): Int {
    var res = 0
    S.forEach { char -> if (J.contains(char, false)) res++ }
    return res
}

