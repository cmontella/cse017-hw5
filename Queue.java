class Queue {
  // fields 
  private int[] list;    // fixed size array that holds items of queue
  private int front;     // index of front of the queue
  private int back;      // index of the back of the queue
  private int capacity;  // how many items can the queue hold
  private int size;      // how many items are currently on the queue

  // 1-arg constructor with initial capacity
  public Queue(int capacity) {
    this.capacity = capacity;
    this.list = new int[capacity];
    this.size = 0;
    this.front = 0;
    this.back = -1;
  }

  // return the front of the queue
  public int pop() {
    if (size == 0) {
      throw new RuntimeException();
    }
    else {
      int popped = list[front];
      front++;
      size--;
      return popped;
    }
  }       
  
  // add item to the back of the queue
  public void push(int item) {
    if (size == capacity) {
      list[front] = item;
      back = front;
      front++;
      if (front == capacity) {
        front = 0;
      }
    }
    else {
      size++;
      back++;
      list[back] = item;
    }
  }
  
  // return the item at the front of the queue without removing it
  public int peek() {
    return list[front];
  }     

  // return the size of queue
  public int size() {
    return size;
  }

}