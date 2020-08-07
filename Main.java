class Main {
  public static void main(String[] args) {
    Stack stack = new Stack(10);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.printf("%d\n",stack.pop());
    System.out.printf("%d\n",stack.pop());
    System.out.printf("%d\n",stack.pop());


    Queue queue = new Queue(10);
    queue.push(1);
    queue.push(2);
    queue.push(3);
    System.out.printf("%d\n",queue.pop());
    System.out.printf("%d\n",queue.pop());
    System.out.printf("%d\n",queue.pop());

    int[][] adj_matrix =  new int[][] {
      {0, 1, 1, 0, 0, 0},
      {1, 0, 0, 1, 1, 0},
      {1, 0, 0, 0, 0, 1},
      {0, 1, 0, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {0, 0, 1, 0, 0, 0},
    };


    Graph graph = new Graph (adj_matrix);

    int[] bfs_path = graph.traverse_bfs(0);
    for (int i = 0; i < bfs_path.length; i++) {
      System.out.printf("%d ", bfs_path[i]);
    }
    System.out.printf("\n");

    int[] dfs_path = graph.traverse_dfs(0);
    for (int i = 0; i < dfs_path.length; i++) {
      System.out.printf("%d ", dfs_path[i]);
    }
    System.out.printf("\n");


  }
}