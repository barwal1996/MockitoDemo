package com.niit.techno.mockitodemo;

public class Bar {
	public  String greet(IHelloWorld d) {
		System.out.println("Bar invokes IHelloWorld.greet ");
		return d.greet();
	}
}
