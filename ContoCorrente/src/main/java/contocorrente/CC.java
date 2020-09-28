package contocorrente;

import java.util.ArrayList;

public class CC {

	private String numconto;
	private int disp;
	
	private class Movimento{
		private String descrizione;
		private int quantita;
		
		public Movimento(String descrizione, int quantita){
			this.descrizione = descrizione;
			this.quantita = quantita;
		}
		
		public void Print(){
			System.out.println(descrizione + " " + quantita);
		}
	}
	
	ArrayList<Movimento> movimenti = new ArrayList<Movimento>(5);
	
	public CC(String numconto, int disp){
		this.numconto = numconto;
		this.disp = disp;
	}
	
	public void Versamento(int quota, CC conto){
		disp = disp - quota;
		conto.disp = conto.disp + quota;
		Movimento movimento = new Movimento("versamento", quota);
		boolean b = movimenti.add(movimento);
	}
	
	public void BonificoRicevuto(int quota, CC conto){
		disp = disp + quota;
		conto.disp = conto.disp - quota;
		Movimento movimento = new Movimento("versamento", quota);
		boolean b = movimenti.add(movimento);
	}
	
	public void Prelievo(int quota){
		disp = disp - quota;
		Movimento movimento = new Movimento("prelievo", quota);
		boolean b = movimenti.add(movimento);
	}
	
	public void Saldo(){
		System.out.println("saldo: " + disp);
	}
	
	public void Lista5Mov(){
		System.out.println("Ultimi 5 movimenti: ");
		for(int i = 0; i<5; i++){
			movimenti.get(i).Print();
		}
	}
}
