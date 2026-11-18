package com.Array;

public class Countevenandodd {

	public static void main(String[] args) {
		
		int a[]= {10,15,20,25,30};
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<a.length;i++) {
		    
			if(a[i]%2==0){
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("count of even numbers:"+ even);
		System.out.println("count of odd numbers:"+ odd);

	}

}
