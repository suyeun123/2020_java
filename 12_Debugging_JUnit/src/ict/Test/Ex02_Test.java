package ict.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.JUnit.Ex02;

public class Ex02_Test {

	Ex02 mul;
	
	
	@Before
	public void TestBefore() {
		mul = new Ex02();
		
	}
	
	@Test
	public void test() {
		int res = mul.mul(4, 5);
		assertEquals(9, res);
	}

	
	@After
	public void testAfter() {
		
	}
	
}
