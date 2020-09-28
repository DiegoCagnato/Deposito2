package oggettitridimensionali;

import java.lang.Math;

public class Cilindro extends TriDimConAltezza {
	
	public Cilindro(double altezza, double raggio){
		this.altezza = altezza;
		this.area = Math.pow(raggio, 2.0) * Math.PI;
	}
	
	@Override public void Print(){
		System.out.println("Cilindro");
		super.Print();
	}

}
