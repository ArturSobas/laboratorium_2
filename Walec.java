package lab2;

public class Walec extends PunktMaterialny{
	private double promienWalca;

	//konstruktor domyslny
	Walec() {
		this.promienWalca = 3;
	}
	
	//konstruktor z parametrami
	Walec(double masa, double promienWalca) {
		super(masa);
		this.promienWalca = promienWalca;
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
		.append(this.promienWalca);
		return sc.toString();
	}

	//przeciazona metoda zwracajaca opis obiektu
	@Override
	public String opisObiektu() {
		return "Walec";
	}

	//przeciazona metoda obliczajaca glowny moment bezwladnosci
	@Override
	public double GMB() {
		return (0.5 * masa * Math.pow(promienWalca, 2));
	}

	//metoda obliczajaca moment bezwladnosci z tw. Steinera
	@Override
	public double GMB(double odleglosc) {
		return (this.GMB() + masa * Math.pow(odleglosc, 2));
	}
	
	//akcesor pola promienWalca
	public double getPromienWalca() {
		return this.promienWalca;
	}

	//mutator pola promienWalca
	public void setPromienWalca(double promienWalca) {
		this.promienWalca = promienWalca;
	}
}
