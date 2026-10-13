package com.Constructor;import java.lang.classfile.AnnotationValue.OfAnnotation;

public class Test1 {
	
	static int count=0;
	
	Test1(){
		 count++;
	}

	public static void main(String[] args) {
		
		Test1 m = new Test1();
		Test1 m1 = new Test1();
		Test1 m2 = new Test1();
		System.out.println("total Number Of object:" + count );


		

	}

}
