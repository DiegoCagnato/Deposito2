package dadomonetaconclasseastratta;

import java.lang.Math;

public abstract class OggettoAstratto {
	
       protected int numfacce;
       protected int risultato;
       
       
       public int lancio(){
    	   risultato = (int)Math.ceil(Math.random() * numfacce);
    	   return risultato;
       }
       
       public void PrintLancio(){
    	   risultato = lancio();
       }
}
