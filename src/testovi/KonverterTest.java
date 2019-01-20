package testovi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import kodovi.Konverter;

public class KonverterTest {

	Konverter konverter;
	double jedinica;
	
	
	@Before
	public void setUp() {
		konverter = new Konverter();
	}
	
	@Test
	
	public void shouldReturnFunteWhenEnteredKg() {
		jedinica = konverter.kgToFunte(20);
		assertEquals(44.09, jedinica,2);
	}
	
	@Test
	public void shouldReturnKgWhenEnteredFunte() {
		jedinica = konverter.funteToKg(20);
		assertEquals(9.07, jedinica,2);
	}
	
	@Test
	public void shouldReturnInchWhenEnteredCm() {
		jedinica = konverter.cmToInch(20);
		assertEquals(7.87, jedinica,2);
	}
	
	@Test
	public void shouldReturnCmWhenEnteredInch() {
		jedinica = konverter.inchToCm(20);
		assertEquals(50.8, jedinica,2);
	}
	
	@Test
	public void shouldReturnFarenheitWhenEnteredCelsius() {
		jedinica = konverter.celsiusToFarenheit(20);
		assertEquals(68, jedinica,2);
	}
	
	@Test
	public void shouldReturnCelsiusWhenEnteredFarenheit() {
		jedinica = konverter.farenheitToCelsius(40);
		assertEquals(4.44, jedinica,2);
	}
}


