package com.cognizant.demojunit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;


public class testcalculator 
{
	calculatorservice service=mock(calculatorservice.class);
      calculator c=null;
      @Before
      public void setUp()
      {
    	  c=new calculator(service);
      }
@Test
public void testperform()
{
	when(service.add(2, 3)).thenReturn(5);
	assertEquals(10,c.perform(2, 3) );
}
}