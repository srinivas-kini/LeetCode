//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
   fun countOdds(low: Int, high: Int): Int = if (low % 2 != 0 || high % 2 != 0) (high-low)/2 +1 else (high-low)/2
