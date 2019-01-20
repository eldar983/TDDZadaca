package kodovi;

public class StringZadatak {
	
	public int duzinaStringa(String poruka) {
		return poruka.length();
	}
	
	public String karakteriNaParnimPozicijama(String poruka) {
		String parni = "";
		for (int i = 0; i < poruka.length(); i++) {
			char ch = poruka.charAt(i);
			if(i % 2 == 0 && !Character.isWhitespace(ch)) {
				parni += ch;
			}
		}
		return parni;
	}
	
	public String karakteriNaNeparnimPozicijama(String poruka) {
		String neparni = "";
		for (int i = 0; i < poruka.length(); i++) {
			char ch = poruka.charAt(i);
			if(i % 2 != 0 && !Character.isWhitespace(ch)) {
				neparni += ch;
			}
		}
		return neparni;
	}
	
	public int brojUppercaseKaraktera(String poruka) {
		int brojUppercase = 0;
		for (int i = 0; i < poruka.length(); i++) {
			char ch = poruka.charAt(i);
			if(Character.isUpperCase(ch)) {
				brojUppercase++;
			}
		}
		return brojUppercase;
	}
	
	public int brojLowercaseKaraktera(String poruka) {
		int brojLowercase = 0;
		for (int i = 0; i < poruka.length(); i++) {
			char ch = poruka.charAt(i);
			if(Character.isLowerCase(ch)) {
				brojLowercase++;
			}
		}
		return brojLowercase;
	}
	
	public String sviKarakteriKojiNisuSlova(String poruka) {
		String nisuSlova = "";
		for (int i = 0; i < poruka.length(); i++) {
			char ch = poruka.charAt(i);
			if(!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
				nisuSlova += ch;
			}
		}
		
		return nisuSlova;
	}
	
	
	
	
	
	
	
	
	
	

}
