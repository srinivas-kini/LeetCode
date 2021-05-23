// https://leetcode.com/problems/reverse-vowels-of-a-string/
fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val res = s.filter { it in vowels }.reversed().toMutableList()
        val consonantIndices = mutableListOf<Int>()
        for (i in s.indices) {
            if (s[i] !in vowels)
                consonantIndices.add(i)
        }
        consonantIndices.forEach { index -> res.add(index, s[index]) }
        return res.joinToString("")
    }
