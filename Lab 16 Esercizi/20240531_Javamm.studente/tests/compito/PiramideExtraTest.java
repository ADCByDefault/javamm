package compito;

import org.junit.Assert;
import org.junit.Test;

import javamm.Matrice;

public class PiramideExtraTest {

	@Test
	public void test01() {

		byte[][] M = {{0,0,0,0,0},
					 { 0,0,0,0,1},
					 { 0,0,0,0,1}};
		int risultato = 1;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test02() {

		byte[][] M = {{0,0,1,0,0},
					 { 1,1,1,1,1},
					 { 1,1,1,1,0}};
		int risultato = 2;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
		
	@Test
	public void test03() {

		byte[][] M = {{0,0,0,0,0},
					 { 0,0,0,0,0},
					 { 0,0,0,0,0}};
		int risultato = 0;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test04() {

		byte[][] M = {{0,0,1,0,0},
					 { 1,0,1,0,1},
					 { 1,1,1,0,0}};
		int risultato = 1;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test05() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,1,0,0,1,0},
					 { 0,1,1,1,1,1,0,0},
					 { 0,1,1,1,1,1,1,0},
					 { 1,1,1,1,1,1,1,1} };
		int risultato = 4;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test06() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,0,1,0,1,0},
					 { 0,1,0,1,1,1,0,0},
					 { 0,1,1,0,1,0,1,0},
					 { 1,0,1,1,0,1,1,0} };
		int risultato = 2;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test07() {

		byte[][] M = {{1,0,0,1,0,0,0,1},
					 { 1,0,1,0,0,0,1,0},
					 { 0,1,0,1,1,1,0,0},
					 { 0,1,1,0,1,1,1,0},
					 { 1,0,1,1,1,1,1,1} };	
		int risultato = 3;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test08() {

		byte[][] M = {{1,0,0,0,0,0,0,1},
					 { 1,1,1,1,1,1,1,1},
					 { 0,1,1,1,1,1,1,1},
					 { 0,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1} };	
		int risultato = 4;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test09() {

		byte[][] M = {{1,0,0,0,0,0,0,1},
					 { 1,1,1,0,1,1,1,1},
					 { 0,1,1,1,1,1,1,1},
					 { 0,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,0} };	
		int risultato = 3;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	
	@Test
	public void test10() {

		byte[][] M = {{1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1} };	
		int risultato = 5;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test11() {

		byte[][] M = {{1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,0,1,1},
					 { 1,1,1,1,1,1,1,1,1} };	
		int risultato = 4;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test12() {

		byte[][] M = {{1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 0,0,0,0,0,1,0,1,1},
					 { 1,1,1,1,1,1,1,1,1} };	
		int risultato = 3;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test13() {

		byte[][] M = {{1,1,1,1,1,1,1,1,1},
					 { 1,1,1,1,1,1,1,1,1},
					 { 1,0,1,1,0,1,1,0,1},
					 { 0,0,0,0,0,1,0,1,1},
					 { 1,1,1,1,1,1,1,1,1} };	
		int risultato = 2;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test14() {

		byte[][] M = {{1,1,1,1,1,1,1,1,1},
					 { 1,0,1,0,1,0,1,0,1},
					 { 1,0,1,1,0,1,1,0,1},
					 { 0,0,0,0,0,1,0,1,1},
					 { 1,1,1,1,1,1,0,1,1} };	
		int risultato = 1;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test15() {

		byte[][] M = {{0}};
		int risultato = 0;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
	@Test
	public void test16() {

		byte[][] M = {{1},
					  {1},
					  {1}};
		int risultato = 1;
		
		Assert.assertEquals(Matrice.altezzaMassimaPiramide(M),risultato);
	}
	
}
	