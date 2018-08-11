package com.terminology.algorithms;

public class BinarySearch {
	//Time Complexity for Binary Search
	//T(n) = T(n/2) + c 
	//incase of recursion - O(Logn)
	private static int search(int[] sortedArray,int leftIndex, int rightIndex, int x) {
		if(rightIndex>=leftIndex){
			
			int middleElement = leftIndex+(rightIndex-leftIndex)/2;
			//8 - middle
			if(sortedArray[middleElement]==x){
				return middleElement;
			}
			//x=10
			//8>10
			if(sortedArray[middleElement]>x){
				search(sortedArray,leftIndex,middleElement-1,x);
			}
			//8<10
			return search(sortedArray,middleElement+1,rightIndex,x);
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] sortedArray = {1,3,5,8,9,10,12,24}; 

		int n=sortedArray.length-1;
		int leftIndex = 0;
		int rightIndex = n;
		int x = 10;
		
		int positionOfMatchedElement = BinarySearch.search(sortedArray,leftIndex,rightIndex,x);
		
		System.out.println("positionOfMatchedElement >> "+positionOfMatchedElement);
	}

	

}
