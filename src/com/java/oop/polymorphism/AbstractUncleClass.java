package com.java.oop.polymorphism;

public abstract class AbstractUncleClass extends AbstractParentClass {
	
	protected String name;
	
	public AbstractUncleClass() {
		name = "Abstract Uncle";
	}
	
	public void displayName()
	{
		System.out.println(this.name);
	}

}
