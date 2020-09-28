package oggettitridimensionali;

public abstract class TriDimConAltezza {

	protected double altezza;
	protected double area;
	
	public double Volume(){
		return altezza * area;
	}
	
	public void Print(){
		System.out.println("Volume: " + Volume());
	}
}
