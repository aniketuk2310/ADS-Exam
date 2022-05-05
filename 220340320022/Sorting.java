

import java.util.Arrays;

class Sorting{
	public static void insertionSort(int arr[]){
		int n = arr.length;//5
		int temp = arr[n-1];
		for(int i=n-2;i>=0;i--){
			
			if(temp>arr[i]){
				arr[i+1] = temp;
				return;
			}
			else
				arr[i+1] = arr[i];
		}	
	}
	public static void main(String...args){
		int a1[] = {1,2,4,5,3};
		System.out.println("Array before Sorting : "+Arrays.toString(a1));
		insertionSort(a1);
		System.out.println("Array After Sorting : "+Arrays.toString(a1));
	}
}

