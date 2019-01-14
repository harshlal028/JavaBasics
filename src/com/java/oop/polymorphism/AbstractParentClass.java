package com.java.oop.polymorphism;

public abstract class AbstractParentClass implements Interface1 {
	
	protected String name;
	
	public AbstractParentClass() {
		name = "Abstract Parent";
	}
	
	public void displayName()
	{
		System.out.println(this.name);
	}
}
