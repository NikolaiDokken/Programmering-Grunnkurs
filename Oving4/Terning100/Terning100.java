/** Programmet er en simulering av spillet terning100
* To spillere a og b, spiller mot hverandre, og bytter på å kaste terningen
* For hvert kast blir tallet på terningen lagt til i spillerens sum
* Dersom en spiller kaster 1, blir summen tilbakestilt til  0
*/

class Terning100 {
	public static void main(String[] args) {
		
	Spiller a = new Spiller("Katjakai", 0, 0);
	Spiller b = new Spiller("Bentebent", 0, 0);
	int kastA = 0;
	int kastB = 0;
	
	while (a.getSumPoeng() < 100 && b.getSumPoeng() < 100) {
		a.kastTerningen();
		System.out.println("Katjakai har " + a.getSumPoeng() + " poeng etter " + a.getAntKast() + " kast.");
		
		b.kastTerningen();
		System.out.println("Bentebent har " + b.getSumPoeng() + " poeng etter " + b.getAntKast() + " kast.\n");
			
		
	}
	if (a.getSumPoeng() >= 100) {
		System.out.println("Katjakai vant.");
	} else if (b.getSumPoeng() >= 100) {
		System.out.println("Bentebent vant.");
	}	
		
		
		
	}
}
