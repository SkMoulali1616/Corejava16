package com.intradition;

import java.lang.classfile.AnnotationValue.OfAnnotation;
import java.util.Objects;

public class Countobjects {

	static int count=0;
	
	static Countobjects m = new Countobjects();

	{
		count=count+1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Countobjects m1 = new Countobjects();
		Countobjects m2 = new Countobjects();
		Countobjects m3 = new Countobjects();
		
		
	System.out.println("No Of Objects: " + count);
	


	
	}

}
