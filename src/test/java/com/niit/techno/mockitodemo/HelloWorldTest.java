package com.niit.techno.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest
{
	IHelloWorld d;
	
	@Before
	public void  setupMock() {
		d= mock(IHelloWorld.class);
		when(d.greet()).thenReturn("Hello World");
	}
		
		
	@Test
	private void fooGreets() {
		
		System.out.println("Demo.greets() : " +d.greet());
		assertEquals("Hello world",d.greet());
	}
   
	@Test
	public void barGreets() {
		Bar bar =  new Bar();
		assertEquals("Hello world",bar.greet(d));
	}
	
}
