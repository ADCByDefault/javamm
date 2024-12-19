package compito;

import org.junit.Assert;
import org.junit.Test;
import javamm.Intero;

public class RidottaTest {

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

}
	