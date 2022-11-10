package sortingTest;

public class MergeSort1 {

	public static void main(String[] args) {
		MSort m = new MSort();
//		MergeSort2 m = new MergeSort2();
		int[] arr= {12,3,20,5,2,0,27};
		
//		m.sort(arr, 0, arr.length-1);
		m.divide(arr, 0, arr.length-1);
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" : ");
		}
	}
}


class MSort{
	public void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l+1;
		int n2 = r - mid;
		int[] arrL = new int[n1];
		int[] arrR = new int[n2];
		for(int i = 0; i<n1;i++) {
			arrL[i]=arr[l+i];
		}
		for(int j = 0; j<n2;j++) {
			arrR[j]=arr[mid+1+j];
		}
		
		int i = 0, j=0, cur = l;
		
		while(i <n1 && j<n2) {
			if(arrL[i]<=arrR[j]) {
				arr[cur]=arrL[i];
				i++;
				
			}else {
				arr[cur]=arrR[j];
				j++;
				
			}
			cur++;
		}
		
		while(i<n1) {
			arr[cur]=arrL[i];
			cur++;
			i++;
		}
		
		while(j <n2) {
			arr[cur]=arrR[j];
			j++;
			cur++;
		}
	}
	
	public void divide(int[] arr, int low, int high) {
		if(low < high) {
			int mid = (low + high)/2;
			divide(arr, low, mid);
			divide(arr, mid+1, high);
			
			merge(arr, low, mid, high);
		}
	}
}

class MergeSort2{
	void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
	void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
}