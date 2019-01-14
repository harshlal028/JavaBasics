package com.java.oop.polymorphism;

public class TestPolymorphism {
	
	public static void main(String[] args) {

		ChildClass1 c1 = new ChildClass1();
		ChildClass2 c2 = new ChildClass2();
		ChildClass3 c3 = new ChildClass3();
		Child4 c4 = new Child4();
		
		AbstractUncleClass absUnc;
		AbstractParentClass absPar;
		
		absUnc = c3;
		absUnc = c4;
		//absUnc = c1; //Not allowed
		//absUnc = c2; //Not allowed
		
		absPar = c3;
		absPar = c4;
		//absPar = c1;
		absPar = c2;
		
		//c4 = ((Child4)c3); //Not allowed
		//c3 = ((ChildClass3)c4); //Not allowed
		
		c3 = (ChildClass3)absUnc;
		c3 = (ChildClass3)absPar;
	}

}
