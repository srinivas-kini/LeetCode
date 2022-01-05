//https://leetcode.com/problems/kth-largest-element-in-a-stream/
class KthLargest {

    private PriorityQueue<Integer> pq;
    private int k;
    
    public KthLargest(int k, int[] nums) {
        
        this.k = k;
        pq = new PriorityQueue<>();
        Arrays.stream(nums).forEach(num -> {
            pq.add(num);
            if(pq.size() > this.k)
                pq.remove();
        });
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > this.k) {
            pq.remove();
        }
        return pq.peek();
    }
}
