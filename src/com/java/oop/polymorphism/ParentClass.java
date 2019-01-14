package com.java.oop.polymorphism;

public class ParentClass {
	
	protected String name;
	
	public ParentClass() {
		name = "Concrete Parent";
	}
	
	public void displayName()
	{
		System.out.println(this.name);
	}

}
