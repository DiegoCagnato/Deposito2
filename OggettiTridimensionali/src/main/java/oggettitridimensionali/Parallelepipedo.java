package oggettitridimensionali;

public class Parallelepipedo extends TriDimConAltezza {

	public Parallelepipedo(double altezza, double lato1, double lato2){
		this.altezza = altezza;
		this.area = lato1 * lato2;
	}
	
	@Override public void Print(){
		System.out.println("Parallelepipedo");
		super.Print();
	}
	
	
}
