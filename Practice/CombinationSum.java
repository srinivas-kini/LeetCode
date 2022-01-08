// https://leetcode.com/problems/combination-sum/submissions/
class Solution {
    
    List<List<Integer>> combinations;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        combinations = new ArrayList<>();
        
        for(int c : candidates){
            dfs(c, 0, target , new PriorityQueue<Integer>(), candidates);
        }
        return combinations;
    }
    
    
    public void dfs(int candidate, int currSum, int target, PriorityQueue<Integer> combination, int[] candidates){
        
        currSum += candidate;
        
        if(currSum > target){
            return;
        }
        
        combination.add(candidate);
        
        List<Integer> c = new ArrayList<>(combination);
        Collections.sort(c);
        if(currSum == target && !combinations.contains(c)){
            combinations.add(c);
        }
        
        for(int cd : candidates){
            dfs(cd, currSum, target, new PriorityQueue<Integer>(combination), candidates);
        }
        
    }
}
