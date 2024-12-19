package compito;

import org.junit.Assert;
import org.junit.Test;

import javamm.Intero;

public class ExtraTest {

	@Test
	public void test01() {

		int n = 42572137;
		int m = 24751273;
		byte k = 2;
		boolean risultato = true;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}
	
	@Test
	public void test02() {

		int n = 42572137;
		int m = 124751273;
		byte k = 2;
		boolean risultato = false;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}
	
	@Test
	public void test03() {

		int n = 4004;
		int m = 4004;
		byte k = 4;
		boolean risultato = true;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}
	
	@Test
	public void test04() {

		int n = 42572135;
		int m = 24751273;
		byte k = 2;
		boolean risultato = false;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}

	@Test
	public void test05() {

		int n = 42522137;
		int m = 24751273;
		byte k = 2;
		boolean risultato = false;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}
	
	@Test
	public void test06() {

		int n = 24751273;
		int m = 42572137;
		byte k = 2;
		boolean risultato = true;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}

	@Test
	public void test07() {

		int n = 42572137;
		int m = 240275731;
		byte k = 3;
		boolean risultato = true;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}

	@Test
	public void test08() {

		int n = 1000000;
		int m = 100000;
		byte k = 4;
		boolean risultato = true;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}
	
	@Test
	public void test09() {

		int n = 100000;
		int m = 100000;
		byte k = 4;
		boolean risultato = false;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}
	
	@Test
	public void test10() {

		int n = 1000000001;
		int m = 110000;
		byte k = 5;
		boolean risultato = true;
				
		Assert.assertEquals(Intero.collegati(n,m,k),risultato);
	}
	
	
}
	