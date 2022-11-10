package datastructure;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue1 q = new Queue1(6);
		q.enQueue(23);
		q.enQueue(10);
		q.enQueue(3);
		q.enQueue(4);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}

class Queue1{
	int front;
	int rear;
	int[] arr;
	
	public Queue1(int n) {
		front = -1;
		rear = -1;
		arr = new int[n];
	}
	
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	
	public boolean isFull() {
		return rear == arr.length-1;
	}
	
	public void enQueue(int n) {
		if(isFull()) {
			System.out.println("Full");
			return;
		}
		front=0;
		arr[++rear]=n;
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Empty error");
		}
		return arr[front++];
	}
}