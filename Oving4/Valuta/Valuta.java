/** Valuta.java
* Dette er klassen til programmet ValutaKlient
* Klassen beskriver en valuta med navn, forkortelse og kronekurs
* Man skal kunne regne til og fra kroner
*/

class Valuta {
	private final String navn;
	private final String forkortelse;
	private double valutakurs;
	private double nok;
	private double currency;
	
	public Valuta(String navn, String forkortelse, double valutakurs) {
		this.navn = navn;
		this.forkortelse = forkortelse;
		this.valutakurs = valutakurs;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public String getForkortelse() {
		return forkortelse;
	}
	
	public double getValutakurs() {
		return valutakurs;
	}
	
	public double getNOK() {
		return nok;
	}
	
	public double getCurrency() {
		return currency;
	}
	
	public void tilNOK(double belop) {
		nok = belop * valutakurs;
		nok *= 100;
		nok = Math.round(nok);
		nok /= 100;
	}
	
	public void fraNOK(double belop) {
		currency = belop / valutakurs;
		currency *= 100;
		currency = Math.round(currency);
		currency /= 100;
	}
}