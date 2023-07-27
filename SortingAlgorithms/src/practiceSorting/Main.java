package practiceSorting;

public class Main {

	public static void main(String[] args) {
		int []arr= {5,7,1,6,9,4,2,5,8};
		System.out.println("utilSort--------");
		Util.quickSort(arr, 0, arr.length-1);
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		int []arr1= {5,7,1,6,9,4,2,5,8};
		System.out.println("QuickSort-------");
		QuickSort.quickSort(arr1, 0, arr1.length-1);

		for(int val:arr1) {
			System.out.print(val+" ");
		}
		
		System.out.println();
		int []arr2= {5,7,1,6,9,4,2,5,8};
		System.out.println("SortQuick-------");
		SortQuick.sortQuick(arr2, 0, arr2.length-1);

		for(int val:arr2) {
			System.out.print(val+" ");
		}
		System.out.println();
		int []arr3= {5,7,1,6,9,4,2,5,8};
		System.out.println("MergeSort-------");
		MergeSort.mergeSort(arr3, 0, arr3.length-1);

		for(int val:arr3) {
			System.out.print(val+" ");
		}
		System.out.println();
		int []arr4= {5,7,1,6,9,4,2,5,8};
		System.out.println("UtilMerge-------");
		UtilMerge.mergeSort(arr4, 0, arr4.length-1);

		for(int val:arr4) {
			System.out.print(val+" ");
		}
		System.out.println();
		int []arr5= {5,7,1,6,9,4,2,5,8};
		System.out.println("SortMerge-------");
		SortMerge.sortMerge(arr5, 0, arr5.length-1);

		for(int val:arr5) {
			System.out.print(val+" ");
		}
		System.out.println();
		int []arr6= {5,7,1,6,9,4,2,5,8};
		System.out.println("heapSort-------");
		HeapSort.heapSort(arr6, arr6.length);

		for(int val:arr6) {
			System.out.print(val+" ");
	}
		System.out.println();
		int []arr7= {5,7,1,6,9,4,2,5,8};
		System.out.println("sortHeap-------");
		HeapSort.sortHeap(arr7, arr7.length);

		for(int val:arr7) {
			System.out.print(val+" ");
	
		}
	}
}
