//https://leetcode.com/problems/maximum-69-number/  
fun maximum69Number(num: Int): Int = num.toString().replaceFirst("6","9").toInt()