package dadomoneta;

import java.lang.Math;

public class Moneta {
      	
	public String lancio(){
	    int r = (int)Math.ceil(Math.random() * 2);
		if(r==1){
			return "testa";
		}
		else{
			return "croce";
		}
	}
	
	public void PrintLancio(){
		System.out.println("risultato lancio moneta: " + lancio());
	}
}
