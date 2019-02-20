package najwatest;
import static org.junit.Assert.*;

import org.junit.Test;

import najwasoft.book;

public class ntest {
    book a=new book();
	@Test
	public void test1() {
		//fail("Not yet implemented");
	
		assertTrue(a.count()==0);
		
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
	int pric=127;
	a.price(127);
		assertTrue(a.count()==1 && a.price==127);
		
	}
	@Test
	public void test3() {
		//fail("Not yet implemented");
	int pric=100;
	a.price(100);
		assertTrue(a.count()==2 && a.price==227);
		
	}
	
}
