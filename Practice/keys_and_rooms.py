# https://leetcode.com/problems/keys-and-rooms/
class Solution():
    def canVisitAllRooms(self, rooms):
        q = [0]
        visited = set()
        while q:
            curr_room = q.pop(0)
            visited.add(curr_room)
            keys = rooms[curr_room]
            for key in keys:
                if key not in visited:
                    q.append(key)
        return len(visited) == len(rooms)
        
