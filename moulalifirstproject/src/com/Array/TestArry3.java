package com.Array;
//Write a java program  to rounding of elements in given array
//Eg: arr[]={99,95,71,84,81,75,60}
//Output: {100,90,70,80,80,70,60}

public class TestArry3 {

	public static void main(String[] args) {
		int[] arr= {99,95,71,84,81,75,60};
		
		for(int i=0; i<arr.length;i++) {
			int rem=arr[i]%10;
			
			if( rem>=5) {
				arr[i]=arr[i]+(10-rem);
				
			}else {
				arr[i]=arr[i]-rem;
			}
		}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
		}

	

}
