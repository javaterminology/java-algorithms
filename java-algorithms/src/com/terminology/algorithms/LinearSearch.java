package com.terminology.algorithms;

public class LinearSearch {

/*
The time complexity of above algorithm is O(n).
Linear search is rarely used practically 
because other search algorithms such as the binary search algorithm and hash tables allow significantly faster searching comparison to Linear search.*/
	
	private static int search(int[] linear, int match) {
		
		for(int i=0;i<linear.length;i++){
			if(linear[i]==match){
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {

		int[] linear = {1,2,4,8,7,9,10,23,55,77,66,99};
		int match=99;
		int positionOfMatchElement = LinearSearch.search(linear,match);
		
		System.out.println("position Of Matched Element >> "+positionOfMatchElement);
	}


}
