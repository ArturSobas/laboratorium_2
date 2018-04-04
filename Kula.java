package lab2;

public class Kula extends PunktMaterialny{
	private double promienKuli;

	//konstruktor domyslny
	Kula() {
		this.promienKuli = 3;
	}
	
	//konstruktor z parametrami
	Kula(double masa, double promienKuli) {
		super(masa);
		this.promienKuli = promienKuli;
	}
	
	//przeciazona metoda wyswietlajaca informacje na temat danego obiektu
	@Override
	public String opis() {
		StringBuilder sc = new StringBuilder();
		sc.append("Opis obiektu: ")
		.append(this.opisObiektu())
		.append(", masa: ")
		.append(this.masa)
		.append(", promien: ")
		.append(this.promienKuli);
		return sc.toString();
	}

	//przeciazona metoda zwracajaca opis obiektu
	@Override
	public String opisObiektu() {
		return "Kula";
	}

	//przeciazona metoda obliczajaca glowny moment bezwladnosci
	@Override
	public double GMB() {
		return (0.4 * masa * Math.pow(promienKuli, 2));
	}

	//metoda obliczajaca moment bezwladnosci z tw. Steinera
	@Override
	public double GMB(double odleglosc) {
		return (this.GMB() + masa * Math.pow(odleglosc, 2));
	}
	
	//akcesor pola promienKuli
	public double getPromienKuli() {
		return this.promienKuli;
	}

	//mutator pola ptomienKuli
	public void setPromienKuli(double promienKuli) {
		this.promienKuli = promienKuli;
	}
}
