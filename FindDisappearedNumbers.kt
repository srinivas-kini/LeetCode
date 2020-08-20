//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
fun findDisappearedNumbers(nums: IntArray) = (1..nums.size).filter { it !in nums }



