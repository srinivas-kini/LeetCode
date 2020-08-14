//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
fun replaceElements(arr: IntArray): IntArray {
    val res = IntArray(arr.size)

    for (i in arr.indices) {

        if (i == arr.size - 1)
            res[i] = -1
        else {
            var j = i + 1
            var max = 0
            while (j < arr.size) {
                if (arr[j] > max) {
                    max = arr[j]
                }
                j++
            }
            res[i] = max

        }
    }
    return res
}

