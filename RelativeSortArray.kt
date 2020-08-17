//https://leetcode.com/problems/relative-sort-array/
fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {

    val res = mutableListOf<Int>()
    var checked = mutableListOf<Int>()
    var i = 0

    arr1.sort()
    while (i in arr2.indices) {
        var curr = arr2[i]
        for (j in arr1.indices) {
            var count = 0
            if (arr1[j] == curr) {
                count++
                for (k in 1..count)
                    res.add(arr1[j])
            }
            checked.add(arr2[i])
        }
        i++
    }
    for (i in arr1.indices)
        if (!checked.contains(arr1[i]))
            res.add(arr1[i])

    return res.toIntArray()
}

