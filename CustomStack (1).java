
// 1381. Design a Stack With Increment Operation
class CustomStack {
    private int[] stack;
    private int top;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.top = -1;
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (top < maxSize - 1) {
            stack[++top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        return stack[top--];
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, top + 1);
        for (int i = 0; i < limit; i++) {
            stack[i] += val;
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.increment(2, 10); // [11, 12]
        System.out.println("Stack Pop: " + stack.pop()); // 12
    }
}
