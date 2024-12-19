package compito;

import org.junit.Assert;
import org.junit.Test;
import javamm.Intero;

public class StandardTest {

	@Test
	public void test01() {

		int n = 42572137;
		byte k = 2;
		int risultato = 24751273;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test02() {

		int n = 3425721;
		byte k = 2;
		int risultato = 30247512;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test03() {

		int n = 100000;
		byte k = 2;
		int risultato = 10000;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test04() {

		int n = 20000;
		byte k = 2;
		int risultato = 200000;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test05() {

		int n = 7777;
		byte k = 2;
		int risultato = 7777;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test06() {

		int n = 777;
		byte k = 2;
		int risultato = 7077;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test07() {

		int n = 77;
		byte k = 2;
		int risultato = 77;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test08() {

		int n = 7;
		byte k = 2;
		int risultato = 70;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test09() {

		int n = 0;
		byte k = 2;
		int risultato = 0;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test10() {

		int n = 400210;
		byte k = 2;
		int risultato = 42001;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}

	@Test
	public void test11() {

		int n = 42572137;
		byte k = 3;
		int risultato = 240275731;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test12() {

		int n = 3425721;
		byte k = 3;
		int risultato = 300524127;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test13() {

		int n = 100000;
		byte k = 4;
		int risultato = 1000000;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test14() {

		int n = 20000;
		byte k = 5;
		int risultato = 2;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test15() {

		int n = 110000;
		byte k = 5;
		int risultato = 1000000001;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test16() {

		int n = 777;
		byte k = 6;
		int risultato = 777000;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test17() {

		int n = 1111;
		byte k = 4;
		int risultato = 1111;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test18() {

		int n = 6;
		byte k = 6;
		int risultato = 600000;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test19() {

		int n = 0;
		byte k = 7;
		int risultato = 0;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	@Test
	public void test20() {

		int n = 40001;
		byte k = 4;
		int risultato = 40001000;
		
		Assert.assertEquals(Intero.inverti(n, k),risultato);
	}
	
	
	
}
	