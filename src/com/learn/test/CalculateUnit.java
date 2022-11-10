package com.learn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculate;

class CalculateUnit {
     Calculate c=new Calculate();
	@Test
	@DisplayName("Adding The Numbers")
	void testAdd() {
		int a=c.add(10,20);
		System.out.println(a);
	}
	@Test
	@DisplayName("Subtract The Numbers")
	void testSub() {
		int a=c.sub(10,20);
		System.out.println(a);
	}
	@Test
	@DisplayName("Multiplication The Numbers")
	void testMul() {
		int a=c.pro(10,20);
		System.out.println(a);
	}

}
