//https://leetcode.com/problems/hamming-distance/
fun hammingDistance(x: Int, y: Int): Int {

    var res = 0
    var bits = x xor y

    bits.toUInt().toString(2).forEach { bit -> if (bit == '1') res++ }

    return res
}


