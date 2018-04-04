package lab2;

public class ProgramTestowy {

	public static void main(String[] args) {
		//stworzenie obiektu klasy Kula za pomoca konstruktora z parametrami
		Kula kula1 = new Kula(4,8);
		//stworzenie obiektu klasy Walec za pomoca konstruktora z parametrami
		Walec walec1 = new Walec(4,8);
		//stworzenie obiektu klasy Pret za pomoca konstruktora z parametrami
		Pret pret1 = new Pret(4,8);
			
		//wyswietlenie informacji na temat stworzonych obiektow
		System.out.println("Informacje na temat obiektow: kula1, walec1, pret1:");
		System.out.printf("%s, moment bezwladnosci: %.2f, glowny moment bezwladnosci wzgledem osi oddalonej o 3m: %.2f\n", 
				kula1.opis(), kula1.GMB(), kula1.GMB(3));
		System.out.printf("%s, moment bezwladnosci: %.2f, glowny moment bezwladnosci wzgledem osi oddalonej o 3m: %.2f\n", 
				kula1.opis(), kula1.GMB(), kula1.GMB(3));
		System.out.printf("%s, moment bezwladnosci: %.2f, glowny moment bezwladnosci wzgledem osi oddalonej o 3m: %.2f\n", 
				kula1.opis(), kula1.GMB(), kula1.GMB(3));
		
		//tworzenie tablicy obiektow roznych klas pochodnych
		PunktMaterialny[] bryly = {new Kula(3,2), new Walec(3,2), new Pret(3,2)};
		
		//wyswietlenie informacji na temat obiektow znajdujacych sie w tablicy bryly
		System.out.println("\nWyswietlenie informacji na temat obiektow znajdujacych sie w tablicy bryly:");
		for(PunktMaterialny bryla: bryly) {
			System.out.printf("%s, glowny moment bezwladnosci: %.2f\n", 
					bryla.opis(), bryla.GMB());
		}
		
		//wyswietlenie wartosci momentow bezwladnosci bryl z tablicy bryly wzg. nowej rownoleglej osi
		System.out.println("\nWyswietlenie wartosci momentow bezwladnosci bryl z tablicy bryly wzg. nowej rownoleglej osi:");
		for(PunktMaterialny bryla: bryly) {
			System.out.printf("%s: moment bezwladnosci wzgledem osi oddalonej o 3m: %.2f\n", bryla.opisObiektu(), bryla.GMB(3));
		}
	}
}
