package practice_problems
//https://leetcode.com/problems/verifying-an-alien-dictionary/
fun isAlienSorted(words: Array<String>, order: String): Boolean {
    for (j in 1 until words.size) {
        val word1 = words[j - 1]
        val word2 = words[j]
        if (word1 == word2) continue
        if (word1.length <= word2.length) {
            if (order.indexOf(word1[0]) < order.indexOf(word2[0])) continue
            for (i in word1.indices) {
                if (word1[i] != word2[i] && order.indexOf(word1[i]) > order.indexOf(word2[i]))
                    return false
            }
        } else {
            if (order.indexOf(word2[0]) < order.indexOf(word1[0]) || word1.substring(word2.indices) == word2) return false
            for (i in word2.indices) {
                if ((word2[i] != word1[i] && order.indexOf(word2[i]) < order.indexOf(word1[i])))
                    return false
            }
        }
    }
    return true
}

