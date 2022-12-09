package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Junit_demo1;

public class Junit_test1 {
	@Test
	public void max() {
		assertEquals(8,Junit_demo1.max(new int[] {1,3,5,8,7}));
		assertEquals(-1,Junit_demo1.max(new int[] {-1,-3,-5,-8}));
	}

}

