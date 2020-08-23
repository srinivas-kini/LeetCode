package practice_problems
//https://leetcode.com/problems/rearrange-words-in-a-sentence/
fun arrangeWords(text: String): String {
    var mp = mutableMapOf<Int, MutableList<String>>()
    var res = ""
    text.split(" ").forEach { word ->
        if (mp.containsKey(word.length)) {
            mp[word.length]!!.add(word.toLowerCase())
        } else mp[word.length] = mutableListOf(word.toLowerCase())
    }
    mp = mp.toSortedMap().apply {
        this.values.forEach { listOfWords ->
            listOfWords.forEach { word ->
                res += "$word "
            }
        }

    }
    return "${res[0].toUpperCase()}${res.substring(1)}".trim()
}

