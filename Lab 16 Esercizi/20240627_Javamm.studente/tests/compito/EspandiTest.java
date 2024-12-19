package compito;

import org.junit.Assert;
import org.junit.Test;
import javamm.Intero;


public class EspandiTest {

	@Test
	public void test01() {

		int n = 442572137;
		byte k = 1;
		int risultato = 442572137;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test02() {

		int n = 42317;
		byte k = 2;
		int risultato = 402030107;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test03() {

		int n = 2317;
		byte k = 3;
		int risultato = 2003001007;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test04() {

		int n = 237;
		byte k = 4;
		int risultato = 200030007;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test05() {

		int n = 27;
		byte k = 5;
		int risultato = 200007;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test06() {

		int n = 27;
		byte k = 6;
		int risultato = 2000007;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
		
	@Test
	public void test07() {

		int n = 10007;
		byte k = 2;
		int risultato = 100000007;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test08() {

		int n = 17;
		byte k = 7;
		int risultato = 10000007;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test09() {

		int n = 7;
		byte k = 7;
		int risultato = 7;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test10() {

		int n = 0;
		byte k = 5;
		int risultato = 0;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
	
	@Test
	public void test11() {

		int n = 408;
		byte k = 4;
		int risultato = 400000008;
		
		Assert.assertEquals(Intero.espandi(n, k),risultato);
	}
}
	