package dadomonetaconclasseastratta;

public class Moneta extends OggettoAstratto {
     
	public Moneta(){
		this.numfacce = 2;
	}
	
	public void PrintLancio(){
		super.PrintLancio();
		if(risultato == 1){
			System.out.println("risultato lancio moneta: testa");
		}
		else{
			System.out.println("risultato lancio moneta: croce");
		}
	}
}
