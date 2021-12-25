
class CloneGraph {
    Node[] adj = new Node[101];
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        
        Node curr = new Node(node.val);
        adj[curr.val] = curr;
        for(Node child : node.neighbors){
            if(adj[child.val] == null){
                Node newNode = cloneGraph(child);
                curr.neighbors.add(newNode);
            }
            else{
                curr.neighbors.add(adj[child.val]);
            }
        }
        return curr;
    }
}
