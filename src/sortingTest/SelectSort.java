package sortingTest;

public class SelectSort {
	public static void main(String[] args) {
		Select s = new Select();
		int[] arr= {10,2,3,6,4,0};
		s.sort1(arr);
		for(int i = 0; i <arr.length;i++) {
			System.out.print(arr[i]+ " : ");
		}
	}
}

class Select {
	public void sort1(int[] arr) {
		for(int i=0; i< arr.length-1; i++) {
			int min = arr[i];
			int minIndex = i;
			//find the min value in an array
			for(int j = i+1; j< arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minIndex = j;
				}	
			}
			if(minIndex != i) {
				int tmp = arr[i];
				arr[i]=min;
				arr[minIndex]=tmp;
			}
		}
	}
}
