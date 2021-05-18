// https://leetcode.com/problems/string-without-aaa-or-bbb/
class Solution {
    fun strWithout3a3b(a: Int, b: Int): String {
        var res = ""
        var aCount = a
        var bCount = b
        var appended = ""
        for (i in 0 until (a + b)) {
            if (appended.length < 2) {
                if (aCount > bCount) {
                    appended += "a"
                    res += "a"
                    aCount--
                } else {
                    appended += "b"
                    res += "b"
                    bCount--
                }
            } else {
                when (appended.substring(appended.length - 2 until appended.length)) {
                    "aa" -> {
                        if (bCount >= 1) {
                            appended += "b"
                            res += "b"
                            bCount--
                        }
                    }
                    "bb" -> {
                        if (aCount >= 1) {
                            appended += "a"
                            res += "a"
                            aCount--
                        }
                    }
                    else -> {
                        if (aCount > bCount) {
                            appended += "a"
                            res += "a"
                            aCount--
                        } else {
                            appended += "b"
                            res += "b"
                            bCount--
                        }
                    }
                }
            }

        }
        return res
    }

}
