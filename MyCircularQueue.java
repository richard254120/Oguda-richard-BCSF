
// 622. Design Circular Queue
class MyCircularQueue {
    private int[] queue;
    private int front, rear, count, size;

    public MyCircularQueue(int k) {
        queue = new int[k];
        size = k;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % size;
        queue[rear] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % size;
        count--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return queue[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(3);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        System.out.println("Queue Front: " + q.Front()); // 10
        q.deQueue();
        System.out.println("Queue Rear: " + q.Rear()); // 30
    }
}
