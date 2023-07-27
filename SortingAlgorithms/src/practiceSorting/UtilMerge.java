package practiceSorting;

public class UtilMerge {

	public static void mergeSort(int[]arr,int left, int right) {
		if(left>=right) {
			return;
		}
		int mid=(left+right)/2;
	 mergeSort(arr, left, mid);
	 mergeSort(arr, mid+1, right);
	 merge(arr,left,mid,mid+1,right);
	
	}

	private static void merge(int[] arr, int leftStart, int leftEnd, int rightStart, int rightEnd) {
		
		int noOfElems = rightEnd-leftStart+1;
		int []tempArr = new int[noOfElems];
		int tempPos = -1;
		
		while((leftStart <= leftEnd) && (rightStart <= rightEnd)) {
			if(arr[leftStart] < arr[rightStart]) {
				tempArr[++tempPos] = arr[leftStart];
				leftStart++;
			}else {
				tempArr[++tempPos]=arr[rightStart];
				rightStart++;
			}
		}
			
			while(leftStart <= leftEnd) {
				tempArr[++tempPos] = arr[leftStart];
				leftStart++;
			}
			while(rightStart <= rightEnd) {
				tempArr[++tempPos] = arr[rightStart];
				rightStart++;
			}
			for(int i=0; i <= noOfElems-1;i++) {
				arr[rightEnd] = tempArr[tempPos];
				tempPos--;
				rightEnd--;
				
			}
		
	}
	
}
