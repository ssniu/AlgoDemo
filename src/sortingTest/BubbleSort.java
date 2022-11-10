package sortingTest;

public class BubbleSort {

	public static void main(String[] args) {
		Bubble1 b = new Bubble1();
		int[] arr= {1,2,3,6,4,0};
		b.sort1(arr);
		for(int i = 0; i <arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

class Bubble {
	
	public void sort1(int[] arr) {
		for(int i = 0; i< arr.length;i++) {
			int temp = 0;
			for(int j = 0; j<arr.length - i - 1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}

class Bubble1 {
	
	public void sort1(int[] arr) {
		
		for(int i = 0; i< arr.length;i++) {
			int temp = 0;
			boolean flag = false;
			for(int j = 0; j<arr.length - i - 1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}
}
