package com.cognizant.demojunit;

public class calculator 
{
	calculatorservice service;
public calculator(calculatorservice service)
{
	this.service=service;
}
public int perform(int i,int j)
{
	return service.add(i,j)*i;
}
}
