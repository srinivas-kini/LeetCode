# https://leetcode.com/problems/top-k-frequent-words/
class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        import heapq
        
        memo = collections.Counter(words)
        priority_q = []
        heapq.heapify(priority_q)
        
        for word,count in memo.items():
            heapq.heappush(priority_q,(-count,word))
        
        k_frequent_words = []
        
        for _ in range(k):
            k_frequent_words.append(heapq.heappop(priority_q)[1])
        
        return k_frequent_words
            
            
