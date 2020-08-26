// https://leetcode.com/problems/unique-morse-code-words/
fun uniqueMorseRepresentations(words: Array<String>): Int {
    var chars = ('a'..'z').toList()
    val morseCode = """.-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..
    """.trimIndent()
    var mp = mutableMapOf<String, String>()
    var resMap = mutableMapOf<String, String>()

    for (i in chars.indices)
        mp[chars[i].toString()] = morseCode.split(",")[i]
    words.forEach { word ->
        var tmp = ""
        word.forEach { letter -> tmp += (mp[letter.toString()]) }
        resMap[word] = tmp
    }
    return resMap.values.distinct().size
}
