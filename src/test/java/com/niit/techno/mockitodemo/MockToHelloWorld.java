package com.niit.techno.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MockToHelloWorld {
	

	

	@Test
	public void demoGreets() {
		//create a mock demo object
		IHelloWorld d = mock(IHelloWorld.class);
		
		when(d.greet()).thenReturn("HELLO_WORLD");
		System.out.println("Demo greets : "+d.greet()); //Add Behviour
		assertEquals(d.greet(),"HELLO_WORLD");
	}
	
}
