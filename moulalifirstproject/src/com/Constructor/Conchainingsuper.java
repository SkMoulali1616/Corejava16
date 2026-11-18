package com.Constructor;

//Constructor Chaining using super()

 class Conchainingsuper {
	 
	 Conchainingsuper(){
		 System.out.println("parent class");
	 }
 }
 class chaild extends Conchainingsuper{
	 chaild(){
		 super();
		 System.out.println("chaild class");

	 }

	public static void main(String[] args) {
		chaild d1 = new chaild();

	}

 }
