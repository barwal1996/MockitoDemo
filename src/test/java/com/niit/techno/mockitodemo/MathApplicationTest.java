package com.niit.techno.mockitodemo;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.niit.techno.mockitodemo.service.CalculatorService;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	@Mock
	CalculatorService calcService;
	
	@Test
	public void testAdd() {
		when(calcService.add(10.0,20.0)).thenReturn(30.00); //add the behaviour
		
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0,0); //verify the behaviour
		
		verify(calcService).add(10.0,20.0);
		System.out.println(verify(calcService).add(10.0,20.0));
	}
}
