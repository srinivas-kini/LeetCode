//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
fun isPrefixOfWord(sentence: String, searchWord: String): Int {
    var words = sentence.split(" ")
    for (i in words.indices) {
        if (words[i].startsWith(searchWord))
            return i + 1
    }
    return -1
}

