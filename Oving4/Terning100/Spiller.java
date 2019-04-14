class Spiller {
	
	private int sumPoeng;
	private int antKast = 0;
	private final String navn;
	
	public Spiller(String navn, int sumPoeng, int antKast) {
		this.sumPoeng = sumPoeng;
		this.antKast = antKast;
		this.navn = navn;
	}
	
	public int getSumPoeng() {
		return sumPoeng;
	}
	
	public int getAntKast() {
		return antKast;
	}
	
	
	public int kastTerningen() {
		java.util.Random terning = new java.util.Random();
		int terningkast = terning.nextInt(6);
		terningkast ++;
		sumPoeng += terningkast;
		antKast ++;
		if (terningkast == 1) {
			sumPoeng = 0;
		}
		return sumPoeng;
	}	
}