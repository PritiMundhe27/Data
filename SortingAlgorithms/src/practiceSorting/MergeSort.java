package practiceSorting;

public class MergeSort {

	public static void mergeSort(int []arr,int left,int right) {
		if(left >= right) {
			return;
		}
		int mid=(left + right) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		merge(arr, left, mid, mid+1, right);
		
	}

	private static void merge(int[] arr, int leftStart, int leftEnd, int rightStart, int rightEnd) {
		
		int noOfElems = rightEnd - leftStart + 1;
	int []tempArr = new int [ noOfElems ];
	int temppos = -1;
	while((leftStart <= leftEnd) && (rightStart <= rightEnd)) {
		if(arr[leftStart] < arr[rightStart]) {
			tempArr[ ++temppos ] = arr[ leftStart ];
			leftStart++;			
		}
		else {
			tempArr[ ++temppos ] = arr[ rightStart ];
			rightStart++;
		}
	}
	while(leftStart <= leftEnd) {
		tempArr[ ++temppos ] = arr[ leftStart ];
		leftStart++;
	}
	while(rightStart <= rightEnd) {
		tempArr[ ++temppos ] = arr[ rightStart ];
		rightStart++;
	}
	for(int i=1; i <= noOfElems; i++) {
		arr[rightEnd] = tempArr[temppos];
	  temppos--;
	  rightEnd--;
	}
	
	}
	
	
	
}
