// https://leetcode.com/problems/longest-increasing-subsequence/submissions/
class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        
        for(int i = 0; i < nums.length;i++){
            for(int j = 0; j < i; j ++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
