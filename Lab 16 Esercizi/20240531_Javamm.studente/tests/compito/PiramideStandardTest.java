package compito;

import org.junit.Assert;
import org.junit.Test;
import javamm.Matrice;

public class PiramideStandardTest {

	@Test
	public void test01() {

		byte[][] M = {{0,0,0,0,0},
					 { 0,0,0,0,1},
					 { 0,0,0,0,1}};
		int k = 1;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test02() {

		byte[][] M = {{0,0,1,0,0},
					 { 1,1,1,1,1},
					 { 1,1,1,1,0}};
		int k = 2;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
		
	@Test
	public void test03() {

		byte[][] M = {{0,0,0,0,0},
					 { 0,0,0,0,0},
					 { 0,0,0,0,0}};
		int k = 1;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test04() {

		byte[][] M = {{0,0,1,0,0},
					 { 1,0,1,0,1},
					 { 1,1,1,0,0}};
		int k = 2;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test05() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,1,0,0,1,0},
					 { 0,1,1,1,1,1,0,0},
					 { 0,1,1,1,1,1,1,0},
					 { 1,1,1,1,1,1,1,1} };
		int k = 1;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test06() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,0,0,0,1,0},
					 { 0,1,0,1,1,1,0,0},
					 { 0,1,1,0,1,0,1,0},
					 { 1,0,1,1,0,1,1,0} };
		int k = 2;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test07() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,0,0,0,1,0},
					 { 0,1,0,1,1,1,0,0},
					 { 0,1,1,0,1,0,1,0},
					 { 1,0,1,1,1,1,1,0} };	
		int k = 2;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test08() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,0,1,0,1,0},
					 { 0,1,0,1,1,1,0,0},
					 { 0,1,1,1,1,1,1,0},
					 { 1,0,1,1,0,1,1,0} };	
		int k = 3;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test09() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,0,1,0,1,0},
					 { 0,1,0,1,1,1,0,0},
					 { 0,1,1,0,1,1,1,0},
					 { 1,0,1,1,0,1,1,0} };	
		int k = 3;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test10() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,0,1,0,1,0},
					 { 0,1,0,1,1,1,0,0},
					 { 0,1,1,1,1,1,1,0},
					 { 1,1,1,1,1,1,1,1} };	
		int k = 4;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test11() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,0,1,0,1,0},
					 { 0,1,0,1,1,1,0,0},
					 { 0,1,1,1,1,1,1,0},
					 { 1,1,0,1,1,1,1,1} };	
		int k = 4;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test12() {

		byte[][] M = {{1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1} };	
		int k = 5;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test13() {

		byte[][] M = {{1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1} };	
		int k = 5;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test14() {

		byte[][] M = {{1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1} };	
		int k = 6;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test15() {

		byte[][] M = {{1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1} };	
		int k = 10;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test16() {

		byte[][] M = {{1}};
		int k = 1;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test17() {

		byte[][] M = {{0}};
		int k = 1;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test18() {

		byte[][] M = {{1},
					  {1},
					  {1}};
		int k = 1;
		boolean risultato = true;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test19() {

		byte[][] M = {{1},
					  {1},
					  {1}};
		int k = 2;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	@Test
	public void test20() {

		byte[][] M = {{1,1,1,1,1}};
		int k = 2;
		boolean risultato = false;
		
		Assert.assertEquals(Matrice.piramide(M,k),risultato);
	}
	
	
	
	
}
	