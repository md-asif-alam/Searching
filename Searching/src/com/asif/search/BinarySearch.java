package com.asif.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		
		int key=70;
		
		int l=0;
		int h=arr.length-1;
		
		while(l<=h) {
			int m=(l+h)/2;
			
			if(arr[m]>key) {
				h=m-1;
			}else if(arr[m]<key) {
				l=m+1;
			}else {
				System.out.print("Element found at index:"+m);
				return;
			}
		}
		System.out.println("Element not found");

	}

}
