package lab2;

public class PunktMaterialny {
	//chronione pole masy punktu materialnygo 
	protected double masa;	
	private int id;
	private static int count = 0;
	
	//konstruktor domyslny
	PunktMaterialny(){	
		this.id = ++count; 
		masa = 3;
	}
	
	//konstruktor z parametrami
	PunktMaterialny(double masa){	
		this.id = ++count;
		this.masa = masa;
	}
	
	//metoda obliczajaca glowny moment bezwladnosci
	public double GMB() {	
		return 0;
	}
	
	//metoda obliczajaca moment bezwladnosci z tw. Steinera
	public double GMB(double odleglosc) {	
		return (0 + masa * Math.pow(odleglosc,2));
	}
	
	//metoda zwracajaca opis obiektu
	public String opisObiektu() {
		return "Punkt materialny";
	}
	
	//metoda wyswietlajaca informacje na temat danego obiektu
	public String opis() {
		StringBuilder sc = new StringBuilder();
		sc.append("Punkt ")
		.append(this.id)
		.append(".) Opis obiektu: ")
		.append(this.opisObiektu())
		.append(", masa: ")
		.append(this.masa);
		return sc.toString();
	}
	
	//akcesor pola masa
	public double getMasa() {
		return masa;
	}
	
	//mutator pola masa
	public void setMasa(double masa){
		this.masa = masa;
	}
}