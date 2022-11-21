package com.asif.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {23,45,98,11,78,86,34,90,67};
		
		int key=86;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Element found at index:"+i);
				return;
			}
		}
		System.out.println("Element not found");

	}

}
