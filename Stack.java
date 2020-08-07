class Stack {
  // fields
  private int[] list;      // fixed size array that holds items of the stack
  private int top;         // index of the top of the stack
  private int capacity;    // how many items can the stack hold
  private int size;        // how many items are currently on the stack
  
  // 1-arg constructor with initial capacity
  public Stack(int capacity) {
    this.capacity = capacity;
    this.list = new int[capacity];
    this.size = 0;
    this.top = -1;
  } 
  
  // return the top of the stack
  public int pop() {
    if (size == 0) {
      throw new RuntimeException();
    }
    else {
      int popped = list[top];
      top--;
      size--;
      return popped;
    }
  }     

  // add item to the top of the stack
  public void push(int item) {
    if (size == capacity) {
      throw new RuntimeException();
    }
    else {
      top++;
      size++;
      list[top] = item;
    }
  }

  // return the item at the top of the stack without removing it
  public int peek() {
    return list[top];
  }

  // returns the size of stack
  public int size() {
    return size;
  }

}