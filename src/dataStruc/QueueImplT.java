package dataStruc;

public class QueueImplT {

	public static void main(String[] args) {
//		QueueClass qc = new QueueClass(5);
//		qc.addEle(2);
//		qc.addEle(5);
//		qc.addEle(10);
//		qc.addEle(32);
//		qc.addEle(6);
//		add extra comment in local
//		for(int i = 0; i<5;i++) {
//			System.out.println(qc.getEle());
//		}
		System.out.println("test here");
		CircularQueue cq = new CircularQueue(5);
		cq.enQueue(3);
		cq.enQueue(31);
		cq.enQueue(12);
		cq.enQueue(9);
		cq.enQueue(92);
		//add one more comment
//		cq.enQueue(21);
//		cq.addE(33);
//		for(int i = 0; i < cq.size();i++) {
//			System.out.println(cq.getE());
//		}
		System.out.println("show 1:");
		cq.show();
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
		System.out.println("show 21:");
		cq.show();
		cq.enQueue(100);
		cq.enQueue(120);
		System.out.println("show 3:");
		cq.show();
		
		
	}

}
 
class QueueClass {
	private int maxSize;
	private int front;
	private int rear;
	private int[] arr;
	
	QueueClass(int n){
		maxSize = n;
		front = -1;
		rear = -1;
		arr = new int[maxSize];
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
		return rear == maxSize - 1;
	}
	
	public void addEle(int n) {
		if(isFull()) {
			System.out.println("It is full");
			return;
		}
		rear++;
		arr[rear]=n;
	}
	public int getEle() {
		if(isEmpty()) {
			System.out.println("It is empty");
			
		}
		front++;
		return arr[front];
	}
}
class CircularQueue{
	private int maxSize;
	private int front;
	private int rear;
	private int[] arr;
	
	CircularQueue(int n){
		maxSize = n;
		rear = -1;
		front = -1;
		arr = new int[maxSize];
	}
	
	public boolean isFull() {
		return (front == rear + 1 || (front==0 && rear==maxSize -1));
	}
	
	public boolean isEmpty() {
		return front ==-1;
	}
	
	public void enQueue(int n) {
		if(isFull()) {
			System.out.println("is Full");
			return;
		}else {
			if(front==-1) front=0;
			rear = (rear+1)%maxSize;
			arr[rear]=n;
			System.out.println("add arr:"+arr[rear]);
		}
		
		
	}
	public int deQueue() {
		int i =0;
		if(isEmpty()) {
			System.out.println("is Empty");
		}else {
			i=arr[front];
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			else {
				front = (front + 1)%maxSize;
			}
		}
		
		return i;
	}
	public void show() {
		if(isEmpty()) {
			System.out.println("error");
		}
		if(rear >= front){
			for(int i = front; i<= rear; i++) {
				System.out.println("arr1:" + arr[i]);
			}
		}else {
			
			for(int i = front; i <maxSize; i++) {
				System.out.println("arr2:"+arr[i]);
			}
			for(int i = 0; i<= rear;i++) {
				System.out.println("arr3:"+arr[i]);
			}
		}
		
	}
}


