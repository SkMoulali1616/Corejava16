package com.Array;

public class SecoundlargeArryele {

	public static void main(String[] args) {
		int[]arr= {1,3,6,9,5};
		
		int max=Integer.MIN_VALUE;
		int secound = Integer.MIN_VALUE;
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secound=max;
				max=arr[i];
			}else if(arr[i]>secound && arr[i]!=max) {
				secound =arr[i];
			}
		}
         if(secound==Integer.MIN_VALUE) {
        	 System.out.println("no seound lorgest number");
         }else {
        	 System.out.println(secound);
         }
	}

}
