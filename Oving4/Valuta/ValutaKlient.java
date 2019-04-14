import static javax.swing.JOptionPane.*;

class ValutaKlient {
	
	public static void main(String[] args) {
		
		/* Lager objekter for forskjellige valutaer */
		Valuta usd = new Valuta("Amerikanske Dollar", "USD", 8.3627);
		Valuta gbp = new Valuta("Britiske Pund", "GBP", 10.8670);
		Valuta eur = new Valuta("Euro", "EUR", 9.6790);
		Valuta sek = new Valuta("Svenske kroner", "SEK", 0.9231);
		Valuta dkk = new Valuta("Danske kroner", "DKK", 1.2975);
		
		/* Deklarer alle kurser */
		double usdKurs = usd.getValutakurs();
		double gbpKurs = gbp.getValutakurs();
		double eurKurs = eur.getValutakurs();
		double sekKurs = sek.getValutakurs();
		double dkkKurs = dkk.getValutakurs();	
		
		boolean fortsett = true;	
		
		while (fortsett) {
		int tilFra = 0;
		while (tilFra != 1 && tilFra != 2 && tilFra != 3) {
			String tilFraLest = showInputDialog("Hei, ønsker du å veksle til eller fra NOK?\n1. Til NOK, fra annen valuta\n2. Fra NOK, til annen valuta\n3. Avslutt");
			tilFra = Integer.parseInt(tilFraLest);
		}
		
		/* Programkode for omgjøring fra annen valuta, til norske kroner */
		if (tilFra == 1) {
			String valutaNrLest = showInputDialog("Hvilken valuta ønsker du å veksle fra?\n1. USD\n2. GBP\n3. EUR\n4. SEK\n5. DKK\n6. Avslutt");
			char valutaNr = valutaNrLest.charAt(0);
			
			switch (valutaNr) {
				case '1':
				String pengerLest = showInputDialog("Hvor mange USD ønsker du å veksle inn i NOK?");
				double penger = Double.parseDouble(pengerLest);
				usd.tilNOK(penger);
				showMessageDialog(null, penger + " USD, er det samme som " + usd.getNOK() + " NOK.");
				break;
				
				case '2':
				pengerLest = showInputDialog("Hvor mange GBP ønsker du å veksle inn i NOK?");
				penger = Double.parseDouble(pengerLest);
				gbp.tilNOK(penger);
				showMessageDialog(null, penger + " GBP, er det samme som " + gbp.getNOK() + " NOK.");
				break;
				
				case '3':
				pengerLest = showInputDialog("Hvor mange EUR ønsker du å veksle inn i NOK?");
				penger = Double.parseDouble(pengerLest);
				eur.tilNOK(penger);
				showMessageDialog(null, penger + " EUR, er det samme som " + eur.getNOK() + " NOK.");
				break;
				
				case '4':
				pengerLest = showInputDialog("Hvor mange SEK ønsker du å veksle inn i NOK?");
				penger = Double.parseDouble(pengerLest);
				sek.tilNOK(penger);
				showMessageDialog(null, penger + " SEK, er det samme som " + sek.getNOK() + " NOK.");
				break;
				
				case '5':
				pengerLest = showInputDialog("Hvor mange DKK ønsker du å veksle inn i NOK?");
				penger = Double.parseDouble(pengerLest);
				dkk.tilNOK(penger);
				showMessageDialog(null, penger + " DKK, er det samme som " + dkk.getNOK() + " NOK.");
				break;
				
				case '6':
				fortsett = false;
				break;
				
				default:
				showMessageDialog(null, "Du har skrevet inn et ugyldig nummer, venligs prøv igjen, eller avslutt.");
				break;
			}
		}
		
		
		
		
		/* programkode for omgjøring fra norske kroner til annen valuta */
		else if (tilFra != 1 && tilFra != 3) {
			String valutaNrLest = showInputDialog("Hvilken valuta ønsker du å veksle til?\n1. USD\n2. GBP\n3. EUR\n4. SEK\n5. DKK\n6. Avslutt");
			char valutaNr = valutaNrLest.charAt(0);
			
			switch (valutaNr) {
				case '1':
				String pengerLest = showInputDialog("Hvor mange NOK ønsker du å veksle inn i USD?");
				double penger = Double.parseDouble(pengerLest);
				usd.fraNOK(penger);
				showMessageDialog(null, penger + " NOK, er det samme som " + usd.getCurrency() + " USD.");
				break;
				
				case '2':
				pengerLest = showInputDialog("Hvor mange NOK ønsker du å veksle inn i GBP?");
				penger = Double.parseDouble(pengerLest);
				gbp.fraNOK(penger);
				showMessageDialog(null, penger + " NOK, er det samme som " + gbp.getCurrency() + " GBP.");
				break;
				
				case '3':
				pengerLest = showInputDialog("Hvor mange NOK ønsker du å veksle inn i EUR?");
				penger = Double.parseDouble(pengerLest);
				eur.fraNOK(penger);
				showMessageDialog(null, penger + " NOK, er det samme som " + eur.getCurrency() + " EUR.");
				break;
				
				case '4':
				pengerLest = showInputDialog("Hvor mange NOK ønsker du å veksle inn i SEK?");
				penger = Double.parseDouble(pengerLest);
				sek.fraNOK(penger);
				showMessageDialog(null, penger + " NOK, er det samme som " + sek.getCurrency() + " SEK.");
				break;
				
				case '5':
				pengerLest = showInputDialog("Hvor mange NOK ønsker du å veksle inn i DKK?");
				penger = Double.parseDouble(pengerLest);
				dkk.fraNOK(penger);
				showMessageDialog(null, penger + " NOK, er det samme som " + dkk.getCurrency() + " DKK.");
				break;
				
				case '6':
				fortsett = false;
				break;
				
				default:
				showMessageDialog(null, "Du har skrevet inn et ugyldig nummer, venligs prøv igjen, eller avslutt.");
				break;
			}
		} else {
			fortsett = false;
		}
	}
	}
}