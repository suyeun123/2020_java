package ict.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.JUnit.Ex03;

public class Ex03_Test {

	Ex03 e3;
	
	
	@Before
	public void testBefore() {
		e3 = new Ex03();
		
	}
	
	@Test
	public void test() {
		int res = e3.div(7, 2);
		assertEquals(3, res);
	
	}
	
	
	@After
	public void testAfter() {
		
	}

}
