package contocorrente;

public class ContoCorrente {
	
	public static void main(String[] args){
		
		CC conto1 = new CC("1000", 10000);
		CC conto2 = new CC("1001", 15000);
		
		conto1.Versamento(50, conto2);
		conto1.Prelievo(500);
		conto1.BonificoRicevuto(100, conto2);
		conto1.Versamento(50, conto2);
		conto1.Prelievo(500);
		conto1.Lista5Mov();
		conto1.Saldo();
		
	}

}
