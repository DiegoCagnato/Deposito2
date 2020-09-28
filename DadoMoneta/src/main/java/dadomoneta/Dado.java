package dadomoneta;

import java.lang.Math;

public class Dado {
     
	public int lancio(){
		int r = (int)Math.ceil(Math.random() * 6);
		return r;
	}
	
	public void PrintLancio(){
		System.out.println("risultato lancio dado: " + lancio());
	}
}
