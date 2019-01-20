package testovi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import kodovi.StringZadatak;

public class StringZadatakTest {

	StringZadatak poruka;
	int brojUppercaseKaraktera;
	int brojLowercaseKaraktera;
	String testnaPoruka = "TeStNa PoRuKa 12#$";
	String test;
	
	@Before
	public void setUp() {
		poruka = new StringZadatak();
	}
	
	@Test
	public void shouldReturnLengthOfAStringWhenPassedString() {
		//act
		int duzina = poruka.duzinaStringa(testnaPoruka);
		//assert
		assertEquals(18, duzina);			
	}
	
	@Test
	public void shouldReturnCharsOnEvenPositionWhenPassedString() {
		//act
		test = poruka.karakteriNaParnimPozicijama(testnaPoruka);
		//assert
		assertEquals("TSNoua1#", test);
	}
	
	@Test
	public void shouldReturnCharsOnOddPositionWhenPassedString() {
		//act
		test = poruka.karakteriNaNeparnimPozicijama(testnaPoruka);
		//assert
		assertEquals("etaPRK2$", test);
	}
	
	@Test
	public void shouldReturnNumberOfUppercaseLettersWhenPassedString() {
		//act
		brojUppercaseKaraktera = poruka.brojUppercaseKaraktera(testnaPoruka);
		//assert
		assertEquals(6, brojUppercaseKaraktera);
				
	}
	
	@Test
	public void shouldReturnNumberOfLowercaseLettersWhenPassedString() {
		//act
		brojLowercaseKaraktera = poruka.brojLowercaseKaraktera(testnaPoruka);
		//assert
		assertEquals(6, brojLowercaseKaraktera);
	}
	
	@Test
	public void shouldReturnAllCharsThatAreNotLettersWhenPassedString() {
		//act
		test = poruka.sviKarakteriKojiNisuSlova(testnaPoruka);
		//assert
		assertEquals("12#$", test);
	}
}


