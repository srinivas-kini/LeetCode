//https://leetcode.com/problems/find-the-difference/
fun findTheDifference(s: String, t: String): Char {
    val strList = s.toCharArray().toMutableList()
    t.forEach { if (!strList.remove(it)) return it }
    return 'x'
}