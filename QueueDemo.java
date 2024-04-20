public class QueueDemo {
    static class Queue {
	
	static int ara[];
	static int size;
	static int rear = -1;
	
	Queue(int n) {
		ara = new int[n];
		this.size = n;
	}
	public static boolean isEmpty() {
		return rear == -1;
	}
	public static void add(int data) {
		if(rear == size-1) {
			System.out.println("full queue.");
			return;
		}
		rear++;
		ara[rear] = data;
	}
	public static int remove() {
		if(isEmpty()) {
			System.out.println("Empty queue");
			return -1;
		}
		int front = ara[0];
		for(int i = 0; i < rear; i++) {
			ara[i] = ara[i+1];
		}
		rear--;
		return front;
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("Empty queue");
			return -1;
		}
		return ara[0];
	}
}
    public static void main(String[] args) {
        Queue q = new Queue(5);
		
		q.add(90);
		q.add(23);
		q.add(34);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
    }
}