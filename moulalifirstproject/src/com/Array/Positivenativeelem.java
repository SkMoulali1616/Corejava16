package com.Array;

public class Positivenativeelem {

	public static void main(String[] args) {
		int a[]= {10,-20,30,-40,50,0};
		
		int positive=0;
		int nagitie=0;
		int zero=0;
		
		for (int i=0;i<a.length;i++) {
			
			if(a[i]>0) {
				positive++;
			}else if(a[i]<0) {
				nagitie++;
			}else {
				zero++;
			}
		}
          System.out.println("positive number:" +positive );
          System.out.println("nagitive number:"+nagitie);
          System.out.println("remander number:"+zero);
	}

}
