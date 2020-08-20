//https://leetcode.com/problems/valid-anagram/
fun isAnagram(s: String, t: String): Boolean {
    return mp(s) == mp(t)
}

private fun mp(str: String): MutableMap<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    str.forEach { map[it] = map.getOrDefault(it, 0) + 1 }
    return map
}