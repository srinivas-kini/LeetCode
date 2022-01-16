# https://leetcode.com/problems/lru-cache/

    def __init__(self, capacity: int):
        self.memo = {}
        self.lru_q = deque()
        self.c = capacity

    def get(self, key: int) -> int:
        if key in self.memo:
            self.lru_q.remove(key)
            self.lru_q.append(key)
            return self.memo[key]
        return -1 
        
    def put(self, key: int, value: int) -> None:
        
        if key in self.memo:
            self.memo[key] = value
            self.lru_q.remove(key)
            self.lru_q.append(key)
        else:
            if len(self.lru_q) == self.c:
                # Evict
                key_to_remove = self.lru_q.popleft()
                del self.memo[key_to_remove]

                # Update
                self.memo[key] = value
                self.lru_q.append(key)
            
            else:
                self.memo[key] = value
                self.lru_q.append(key)
        


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)
