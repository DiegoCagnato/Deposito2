package dadomonetaconclasseastratta;

public class Dado extends OggettoAstratto{
    
	public Dado(){
		this.numfacce = 6;
	}
	
	public void PrintLancio(){
		super.PrintLancio();
		System.out.println("risultato lancio dado: " + risultato);
	}
}
