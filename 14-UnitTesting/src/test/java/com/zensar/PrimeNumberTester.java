package com.zensar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zensar.bean.PrimeNumberDecider;

public class PrimeNumberTester {
	
	PrimeNumberDecider decide;
	@BeforeEach
	public void f1() {
		decide=new PrimeNumberDecider();
		
	}
	@AfterEach
	public void f2() {
		decide=null;
	}
	@Test
	public void test1() {
		decide.setNumber(15);
		boolean actual=decide.isPrimeNumber();
		boolean expected=false;
		assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		decide.setNumber(17);
		boolean actual=decide.isPrimeNumber();
		boolean expected=false;
		assertEquals(expected, actual);

}
}
