package lab2;

public class Pret extends PunktMaterialny{
	private double dlugoscPreta;

	//konstruktor domyslny
	Pret() {
		this.dlugoscPreta = 3;
	}
	
	//konstruktor z parametrami
	Pret(double masa, double dlugoscPreta) {
		super(masa);
		this.dlugoscPreta = dlugoscPreta;
	}
	
	//przeciazona metoda wyswietlajaca informacje na temat danego obiektu
	@Override
	public String opis() {
		StringBuilder sc = new StringBuilder();
		sc.append("Opis obiektu: ")
		.append(this.opisObiektu())
		.append(", masa: ")
		.append(this.masa)
		.append(", dlugosc: ")
		.append(this.dlugoscPreta);
		return sc.toString();
	}

	//przeciazona metoda zwracajaca opis obiektu
	@Override
	public String opisObiektu() {
		return "Pret";
	}

	//przeciazona metoda obliczajaca glowny moment bezwladnosci
	@Override
	public double GMB() {
		return (1.0 / 12 * masa * Math.pow(dlugoscPreta, 2));
	}

	//metoda obliczajaca moment bezwladnosci z tw. Steinera
	@Override
	public double GMB(double odleglosc) {
		return (this.GMB() + masa * Math.pow(odleglosc, 2));
	}
	
	//akcesor pola dlugoscPreta
	public double getDlugoscPreta() {
		return dlugoscPreta;
	}

	//mutator pola dlugoscPreta
	public void setDlgoscPreta(double dlugoscPreta) {
		this.dlugoscPreta = dlugoscPreta;
	}
}
