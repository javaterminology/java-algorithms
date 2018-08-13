package com.terminology.algorithms;

public class InsertionSort {
	
	private static int[] insertSort(int[] arr){
		
		for(int i=1;i<arr.length;i++){
			
			//7,5,3,6,8,4,9,11,10
			int j,key,temp;
			
			key = arr[i];
			j = i-1;
			
			while(j>=0 && key<arr[j]){
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
		}
		return arr;
	}
	
	
	public static void main(String args[]){
		int[] arr = {7,5,3,6,8,4,9,11,10};
		int sortedArr[] = insertSort(arr);
	
	for(int i=0;i<sortedArr.length;i++){
		System.out.println(sortedArr[i]);
	}
		
	}

}
