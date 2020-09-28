package oggettitridimensionali;

import java.util.*;

public class OggettiTridimensionali {

	public static void main(String[] args){
		
		int i;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserisci il numero associato: 1 (sfera), 2 (cilindro), 3 (parallelepipedo)");
		i = reader.nextInt();
		
		switch(i){
		   case 1:
			   double raggio;
			   System.out.println("raggio: ");
			   raggio = reader.nextDouble();
			   Sfera sfera = new Sfera(raggio);
			   sfera.Print();
			   break;
		   case 2:
			   double hcil, raggiobase;
			   System.out.println("altezza: ");
			   hcil = reader.nextDouble();
			   System.out.println("raggio: ");
			   raggiobase = reader.nextDouble();
			   Cilindro cilindro = new Cilindro(hcil, raggiobase);
			   cilindro.Print();
			   break;
		   case 3:
			   double hpar, lato1, lato2;
			   System.out.println("altezza: ");
			   hpar = reader.nextDouble();
			   System.out.println("1° lato della base: ");
			   lato1 = reader.nextDouble();
			   System.out.println("2° lato della base: ");
			   lato2 = reader.nextDouble();
			   Parallelepipedo par = new Parallelepipedo(hpar, lato1,lato2);
			   par.Print();
			   break;
		   default:
			   System.out.println("non hai scelto correttamente");
		}
	}
}
