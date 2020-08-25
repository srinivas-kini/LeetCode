package practice_problems
//https://leetcode.com/problems/most-common-word/
fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    if (paragraph == "") return ""
    val mp = mutableMapOf<String, Int>()
    paragraph.toLowerCase()
        .split("(\\W+|\\s+)".toRegex()).filter { it.isNotEmpty() && it !in banned }.forEach {
            if (!mp.containsKey(it))
                mp[it] = 1
            else {
                var value = mp[it]!!
                mp[it] = ++value
            }
        }

    mp.forEach(::println)
    return mp.maxBy { it.value }?.key ?: ""
}
