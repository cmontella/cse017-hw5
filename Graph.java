class Graph {
  // fields 
  private int[][] graph;            // adjacency matrix representing the graph
  
  // 1-arg constructor with initial graph
  public Graph(int[][] graph) {
    this.graph = graph;
  }  
  
  // add an edge between node "from" and node "to"
  public void add_edge(int from, int to) {
    graph[from][to] = 1;
  }   

  // remove an edge between node "from" and node "to"
  public void remove_edge(int from, int to) {
    graph[from][to] = 0;
  }

  // use the queue you implemented to write a breadth first search traversal over the graph. Returns an array with the nodes in order of traversal. Start indicates the starting node
  public int[] traverse_bfs(int start){
    int[] path = new int[graph.length];
    int ix = 0;
    boolean discovered[] = new boolean[graph.length]; 
    discovered[start] = true;
    Queue q = new Queue(graph.length);
    q.push(start);
    while(q.size() != 0){
      int n = q.pop();
      path[ix++] = n;
      for(int i = 0; i < graph.length; i++){
        if(discovered[i] == false){
          discovered[i] = true;
          q.push(i);
        }
      }
    }
    return path;
  }
  
  // use the stack you implemented to write a depth first search traversal over the graph. Returns an array with the nodes in order of traversal. Start indicates the starting node.
  public int[] traverse_dfs(int start){
    Stack s = new Stack(graph.length);
    s.push(start);
    boolean[] discovered = new boolean[graph.length];
    int[] path = new int[graph.length];
    int ix = 0;
    while(s.size() != 0) {
      int n = s.pop();
      path[ix++] = n;
      if(discovered[n] == false) {
        discovered[n] = true;
        for(int i = 0; i < graph.length; i++) {
          if(graph[n][i] == 1 && !discovered[i]) {
            s.push(i);
          }
        }
      }
    }
    return path;
  }
}