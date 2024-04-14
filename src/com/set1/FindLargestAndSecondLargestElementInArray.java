package com.set1;

public class FindLargestAndSecondLargestElementInArray {

static void FindElement(int arr[]) {
	int length =arr.length;
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	
	}
	int secondLargest=arr[length-2];
	int largest=arr[length-1];
	System.out.println(secondLargest);
	System.out.println(largest);
}
public static void main(String[] args) {
	int arr[]= {1,5,2,3,6,9,8,5,7};
	
	FindElement(arr);
}



}
