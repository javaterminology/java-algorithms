package com.terminology.algorithms;

public class InterpolationSearch {

	
	/*Linear Search finds the element in O(n) time, Jump Search takes O(√ n) time and Binary Search take O(Log n) time.
	The Interpolation Search is an improvement over Binary Search for instances, where the values in a sorted array are uniformly distributed. 
	Binary Search always goes to the middle element to check. On the other hand, 
	interpolation search may go to different locations according to the value of the key being searched. 
	For example, if the value of the key is closer to the last element, interpolation search is likely to start search toward the end side.
	
	formula : position = low+[(high-low)/array[high]-array[low] * (element - array[low])];
	
	*/
	private static int search(int[] arr, int low, int high, int element) {
		while(low<=high && element>=arr[low] && element<=arr[high]){
			
			double d = (double)(high-low)/(arr[high]-arr[low]);
			
			int position = (int) (low + (d *(element - arr[low])));
			
			if(element==arr[position]){
				return position;
			}
			if(arr[position]<element){
			 low = 	position +1;
			}
			
			if(arr[position]>element)
			{
				high = position-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,7,10,11,14,15}; 

		int high = arr.length-1;
		int low = 0;
		
		int element = 15;
		
		int matchedElementIndex = InterpolationSearch.search(arr,low,high,element);
		
		System.out.println("matchedElementIndex >> "+matchedElementIndex);
	}

	
}
