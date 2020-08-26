//https://leetcode.com/problems/detect-capital/
fun detectCapitalUse(word: String): Boolean = word == word.toLowerCase() || word == word.toUpperCase() || word == word.toSentenceCase()
fun String.toSentenceCase() = "${this[0].toUpperCase()}${this.substring(1).toLowerCase()}"
