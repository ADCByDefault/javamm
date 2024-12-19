package compito;

import org.junit.Assert;
import org.junit.Test;
import javamm.Intero;


public class ConnessiTest {

	@Test
	public void test01() {

		int n1= 442572137;
		int n2= 442572137;
		byte k = 1;
		boolean risultato = true;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test02() {

		int n1= 12;
		int n2= 102;
		byte k = 2;
		boolean risultato = true;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test03() {

		int n1 = 0;
		int n2 = 0;
		byte k = 3;
		boolean risultato = true;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test04() {

		int n1 = 2;
		int n2 = 2;
		byte k = 3;
		boolean risultato = true;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test05() {

		int n1 = 102;
		int n2 = 12;
		byte k = 2;
		boolean risultato = true;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}

	@Test
	public void test06() {

		int n1= 442572137;
		int n2= 0;
		byte k = 1;
		boolean risultato = false;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test07() {

		int n1= 11;
		int n2= 102;
		byte k = 2;
		boolean risultato = false;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test08() {

		int n1 = 0;
		int n2 = 1;
		byte k = 3;
		boolean risultato = false;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test09() {

		int n1 = 2;
		int n2 = 0;
		byte k = 3;
		boolean risultato = false;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test10() {

		int n1 = 202;
		int n2 = 12;
		byte k = 2;
		boolean risultato = false;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test11() {

		int n1 = 1122;
		int n2 = 24;
		byte k = 2;
		boolean risultato = true;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
	@Test
	public void test12() {

		int n1 = 124;
		int n2 = 1002004;
		byte k = 3;
		boolean risultato = true;
		
		Assert.assertEquals(Intero.connessi(n1,n2,k),risultato);
	}
	
}
	