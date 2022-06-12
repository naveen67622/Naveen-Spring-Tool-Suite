package com.zensar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zensar.bean.SimpleCalculator;

public class SimpleCalculatorTester {
SimpleCalculator calc;

@BeforeEach
public void f1() {
	calc=new SimpleCalculator();
	System.out.println("f1 executessssss1");
}
@AfterEach
	public void f2() {
		calc=null;
		System.out.println("f2 executessssss2");
	}
@BeforeAll
public static void  x () {
	System.out.println("x executeeeees");
}

@AfterAll
public void y() {
	System.out.println("y Executeeeeess.....");
}


	@Test
	public void testingAdd() {
		
		int expected=8;
		int actual=calc.add(3,5);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testingAddWithNegativeData() {
		
		int actual=calc.add(-10, -15);
		int expected=-25;
		assertEquals(expected, actual);
	}
	@Test
	public void testingMultiply() {
		
		
		 int actual=calc.multiply(3, 5);
		 int expected=15;
		 assertEquals(expected, actual);
		
	}
	@Test
	public void testingDivide() {
		
		
		int actual=calc.divide(9, 3);
		int expected=3;
		assertEquals(actual, expected);
		
	}
	@Test
	public void testingSubtract() {
		
		
	int actual=calc.subtract(7, 5);
		int expected=2;
		assertEquals(actual, expected);
		
	}
	
	
}






