package compito;

import org.junit.Assert;
import org.junit.Test;

import javamm.Intero;

public class ComprimiTest {

	@Test
	public void test01() {

		int n = 442572137;
		byte k = 1;
		int risultato = 442572137;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test02() {

		int n = 442572137;
		byte k = 2;
		int risultato = 4612310;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test03() {

		int n = 442572137;
		byte k = 3;
		int risultato = 101411;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test04() {

		int n = 442572137;
		byte k = 4;
		int risultato = 41813;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test05() {

		int n = 442572137;
		byte k = 5;
		int risultato = 1520;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test06() {

		int n = 442572137;
		byte k = 6;
		int risultato = 1025;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test07() {

		int n = 442572137;
		byte k = 7;
		int risultato = 827;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test08() {

		int n = 442572137;
		byte k = 8;
		int risultato = 431;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test09() {

		int n = 442572137;
		byte k = 9;
		int risultato = 35;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test10() {

		int n = 442572137;
		byte k = 10;
		int risultato = 35;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test11() {

		int n = 0;
		byte k = 4;
		int risultato = 0;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test12() {

		int n = 10000001;
		byte k = 4;
		int risultato = 11;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test13() {

		int n = 10000001;
		byte k = 2;
		int risultato = 1001;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
	@Test
	public void test14() {

		int n = 1002478;
		byte k = 4;
		int risultato = 121;
		
		Assert.assertEquals(Intero.comprimi(n, k),risultato);
	}
	
}
	