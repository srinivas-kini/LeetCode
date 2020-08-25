package practice_problems
//https://leetcode.com/problems/plus-one/
fun plusOne(digits: IntArray): IntArray {
    var digits = digits.toMutableList()
    var checkIndex = digits.size - 1
    var flag = true
    while (digits[checkIndex] == 9) {
        digits[checkIndex] = 0
        if (checkIndex == 0) {
            digits.add(0, 1)
            flag = false
            break
        }
        checkIndex--
    }
    if(flag)
        digits[checkIndex] += 1
    return digits.toIntArray()
}