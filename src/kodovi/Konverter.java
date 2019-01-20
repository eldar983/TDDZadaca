package kodovi;

public class Konverter {
	
	public double kgToFunte (double kg) {
		return kg * 2.205;
	}
	
	public double funteToKg(double funte) {
		return funte / 2.205;
	}
	
	public double cmToInch(double cm) {
		return cm / 2.54;
	}
	
	public double inchToCm(double inch) {
		return inch * 2.54;
		
	}
	
	public double celsiusToFarenheit(double celsius) {
		return celsius * 1.8 + 32;
		
	}
	
	public double farenheitToCelsius(double farenheit) {
		return (farenheit - 32) / 1.8;
		
	}
	

}
