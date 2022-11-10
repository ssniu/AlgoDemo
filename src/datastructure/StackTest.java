package datastructure;

public class StackTest {

	public static void main(String[] args) {
		Stack1 s = new Stack1(6);
		s.push(2);
		s.push(4);
		s.push(5);
		s.push(6);
		s.pop();
		s.pop();
		s.pop();
		s.peek();
		System.out.println(s.pop());
		
	}
}

class Stack1{
	int top;
	int[] arr;
	
	public Stack1(int n) {
		top = -1;
		arr =new int[n];
	}
	public boolean isFull(){
		return top == arr.length-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int n) {
		if(isFull()) {
			System.out.println("Full");
			return;
		}
		top++;
		arr[top]=n;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Empty");
		}
			return arr[top--];	
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("error");
		}else {
			System.out.println(arr[top]);
		}
		
	}
}
