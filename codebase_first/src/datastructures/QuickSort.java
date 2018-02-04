package datastructures;

public class QuickSort {

	public static void main(String[] args) {

	}

	public int[] quickSort(int input[], int low, int high){
		
		if(input!=null && input.length>0 && (low<high)){
			
			int pi = partition(input, low, high);
			
			quickSort(input, low, pi-1);
			quickSort(input, pi+1, high);
		}
		
		return input;
	}

	private int partition(int[] input, int low, int high) {
		
		if(low<high){
			int pivot = input[high];
			
			int i=low-1;
			
			for(int j=0;j<high;j++){
				if(input[])
			}
		}
		
		return 0;
	}
}
