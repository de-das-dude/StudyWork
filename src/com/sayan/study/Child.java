package com.sayan.study;

public class Child extends Parent {
	public String b;
	
	public Child (String a)
	{
		super(a);
	}
	
	public Child (String a, String b)
	{
		super(a);
		this.b = b;
	}
}