package sortingTest;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr= {3,2,5,1,8,0};
		Insert t = new Insert();
		
		t.sort1(arr);
	    for(int i = 0; i <arr.length; i++) {
	    	System.out.print(arr[i]+":");
	    }
	}
}

class Insert {
	public void sort1(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
				}
			}
		}
	}
}
