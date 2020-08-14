//https://leetcode.com/problems/number-of-1-bits/
fun hammingWeight(n:Int):Int {
    var res = 0
    n.toUInt().toString(2).forEach { bit -> if(bit=='1') res++ }
    return res
}