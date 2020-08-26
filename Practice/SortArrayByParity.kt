//https://leetcode.com/problems/sort-array-by-parity/
fun sortArrayByParity(A: IntArray): IntArray {
    var eveList = mutableListOf<Int>()
    var oddList = mutableListOf<Int>()
    A.forEach { elem -> if (elem % 2 == 0) eveList.add(elem) else oddList.add(elem) }
    return intArrayOf(*eveList.toIntArray(), *oddList.toIntArray())
}

