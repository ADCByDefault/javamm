package compito;

import org.junit.Assert;
import javamm.Diagonali;

import org.junit.Test;

public class RidottaTest {

	@Test
	public void test01() {

		byte[] v = {1,3};
		byte[][] M = {{1,3,0,3},
					  {0,0,3,0},
					  {0,3,0,3} };
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}
		
	@Test
	public void test02() {

		byte[] v = {4,3};
		byte[][] M = {{4,0,0,4,3,0,3},
					  {0,4,4,0,0,3,0},
					  {0,4,4,0,3,0,3},
					  {4,0,0,4,0,0,0}};
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}

	@Test
	public void test03() {

		byte[] v = {3,1};
		byte[][] M = {{3,0,3,1},
					  {0,3,0,0},
					  {3,0,3,0} };
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}

	@Test
	public void test04() {

		byte[] v = {3};
		byte[][] M = {{3,0,3},
					  {0,3,0},
					  {3,0,3} };
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}

	@Test
	public void test05() {

		byte[] v = {4};
		byte[][] M = {{4,0,0,4},
					  {0,4,4,0},
					  {0,4,4,0}, 
					  {4,0,0,4}};
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}
	
	@Test
	public void test06() {

		byte[] v = {2};
		byte[][] M = {{2,2},
					  {2,2} };
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}
	
	@Test
	public void test07() {

		byte[] v = {1};
		byte[][] M = {{1}};
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}

	@Test
	public void test08() {

		byte[] v = {4,4};
		byte[][] M = {{4,0,0,4,4,0,0,4},
					  {0,4,4,0,0,4,4,0},
					  {0,4,4,0,0,4,4,0},
					  {4,0,0,4,4,0,0,4}};
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}

	@Test
	public void test09() {

		byte[] v = {5,5};
		byte[][] M = {{5,0,0,0,5,5,0,0,0,5,},
					  {0,5,0,5,0,0,5,0,5,0},
					  {0,0,5,0,0,0,0,5,0,0},
					  {0,5,0,5,0,0,5,0,5,0},
					  {5,0,0,0,5,5,0,0,0,5}};
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}

	@Test
	public void test10() {

		byte[] v = {4,4};
		byte[][] M = {{4,0,0,4,4,0,0,4},
					  {0,4,4,0,0,4,4,0},
					  {0,4,4,0,0,4,4,0},
					  {4,0,0,4,4,0,0,4} };
		
		Assert.assertArrayEquals(Diagonali.generaMatrice(v),M);
	}

	
}
	