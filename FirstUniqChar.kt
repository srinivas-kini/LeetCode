package practice_problems
//https://leetcode.com/problems/first-unique-character-in-a-string/
fun firstUniqChar(s: String): Int {
    val mp = mutableMapOf<Char, Int>()
    s.forEach { char ->
        if (!mp.containsKey(char))
            mp[char] = 1
        else {
            var value = mp[char]!!
            mp[char] = ++value
        }
    }

    mp.forEach {
        if (it.value == 1) {
            return s.indexOf(it.key)
        }
    }

    return -1
}

fun main() {
    firstUniqChar("aadadaad").also(::println)
}