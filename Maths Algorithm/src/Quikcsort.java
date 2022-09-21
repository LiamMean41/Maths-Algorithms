
public class Quikcsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(null,1, 10);
	}
	public static void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	        System.out.println(partitionIndex);
	    }
	}
	private static int partition(int[] arr, int begin, int end) {
		// TODO Auto-generated method stub
		return 0;
	}
}
