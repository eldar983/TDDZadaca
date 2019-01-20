package testovi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import kodovi.Kalkulator;

public class KalkulatorTest {

	Kalkulator kalk;
	int rezultat;
	
	@Before
	public void setUp() {
	kalk = new Kalkulator();
	}

	@Test
	public void shouldReturnSumOfIntegersWhenAdd() {
		//act
		rezultat = kalk.sabiranje(6, 8);
		//assert
		assertEquals(14, rezultat);
	}
	
	@Test
	public void shouldReturnDifferenceOfIntegersWhenSubstracted() {
		//act
		rezultat = kalk.oduzimanje(8, 6);
		//assert
		assertEquals(2, rezultat);
	}
	
	@Test
	public void shouldReturnProductOfIntegersWhenMultiply() {
		//act
		rezultat = kalk.mnozenje(8, 6);
		//assert
		assertEquals(48, rezultat);
	}
	
	@Test
	public void shouldReturnQuotientOfNumbersWhenDivided() {
		//act
		rezultat = kalk.dijeljenje(48, 8);
		//assert
		assertEquals(6, rezultat);		
	}
}


