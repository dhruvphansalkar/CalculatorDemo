package com.cg.test;

import org.junit.Test;

import junit.framework.Assert;

import com.cg.bean.Calculator;
public class testCalc {
	
	@Test
	public void test_add()
	{
		Calculator calc = new Calculator();
		int res = calc.add(3,4);
		Assert.assertEquals(7, res);
	}
	
	@Test
	public void test_sub()
	{
		Calculator calc = new Calculator();
		int res = calc.add(6,4);
		Assert.assertEquals(2, res);
	}

}
