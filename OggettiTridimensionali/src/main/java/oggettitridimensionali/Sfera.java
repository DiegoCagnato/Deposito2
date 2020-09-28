package oggettitridimensionali;

import java.lang.Math;

public class Sfera {

	private double raggio;
	
	public Sfera(double raggio){
		this.raggio = raggio;
	}
	
	public double Volume(){
		return (4.0 / 3.0) * Math.PI * Math.pow(raggio, 3.0);
	}
	
	public void Print(){
		System.out.println("Sfera");
		System.out.println("volume: " + Volume());
	}
}
