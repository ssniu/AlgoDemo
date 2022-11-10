package datastructure;

public class CircularQueueTest {

	public static void main(String[] args) {
		CQueue cq = new CQueue(6);
		cq.enQue(23);
		cq.enQue(12);
		cq.enQue(5);
		cq.enQue(31);
		System.out.print(cq.deQue());
	}
}


class CQueue{
	int front;
	int rear;
	int[] arr;
	int msize;
	
	public CQueue(int n) {
		msize = n;
		rear=-1;
		front=-1;
		arr=new int[msize];
	}
	
	public boolean isFull() {
		return ((front==rear+1)||(front == 0 && rear==msize - 1));
	}
	
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	
	public void enQue(int n) {
		if(isFull()) {
			System.out.println("Full");
		}
		else {
			if(front==-1)
			front=0;
			rear = (rear+1)%msize;
			arr[rear]=n;
		}
	}
	
	public int deQue() {
		int ele = 0;
		if(isEmpty()) {
			System.out.println("Empty");
		}else {
			ele = arr[front];
			if(front == rear) {
				front = -1;
				rear = -1;
			}else {
				front = (front+1)%msize;
			}
		}
		return ele;
	}
}