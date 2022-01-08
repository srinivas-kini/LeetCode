
// Kahn's algorithm
class Solution {
    public boolean canFinish(int numCourses, int[][] p) {
        
        if(p.length == 0){
            return true;
        }
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        Integer[] inDegrees = new Integer[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        
        Arrays.fill(inDegrees, 0);
        for(int[] edge: p){
            if(!map.containsKey(edge[0])){
                map.put(edge[0], new ArrayList<>());
            }
            map.get(edge[0]).add(edge[1]);
            inDegrees[edge[1]] ++;
        }
        
        
        for(int i = 0; i < numCourses; i++){
            if(inDegrees[i] == 0)
                queue.add(i);
        }
        int courseCount = 0;
        
        while(!queue.isEmpty()){
            Integer course = queue.remove();
            courseCount ++;
            if(!map.containsKey(course)){
                continue;
            }
            
            for(Integer c : map.get(course)){
                inDegrees[c] --;
                if(inDegrees[c] == 0){
                    queue.add(c);
                }
            }            
            
        }
                        
       return courseCount == numCourses;
        
    }
    

}
