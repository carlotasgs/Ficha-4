package ficha4;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		
		Cesto cestoDaCarlota = new Cesto();
		Fruta maca = new FrutaUnidade ("maca verde", 2.5, 5);
		Fruta uva = new FrutaVolume ("uva verde", 1.21, 2);
		FrutaPeso pera = new FrutaPeso("pera amarela", 1.6, 4);
		Fruta banana = new FrutaUnidade("banana", 0.20, 1);
		
		cestoDaCarlota.inserirNoCesto(maca);
		cestoDaCarlota.inserirNoCesto(uva);
		cestoDaCarlota.inserirNoCesto(pera);
		cestoDaCarlota.inserirNoCesto(banana);
	
	
		cestoDaCarlota.valorTotal();
		cestoDaCarlota.tipoFruta();
		cestoDaCarlota.totalGasto();
	
		//((FrutaVolume)uva).setPercentagem(0.5);
		((FrutaVolume)uva).pagar();
		System.out.println("Eu sou a uva e tive uma percentagem de " + ((FrutaVolume)uva).getPercentagem() + " passando a pagar só " +((FrutaVolume)uva).pagar());
		System.out.println("Eu sou a uva e tive uma percentagem de " + ((FrutaVolume)uva).getPercentagem() + " passando a pagar só " + uva.pagar()); //igual porque pagar está na Classe Fruta
		
		//pera.setPercentagem(0.7);
		pera.pagar();
		System.out.println("Eu sou a pera e tive uma percentagem de " + pera.getPercentagem() + " passando a pagar apenas " + pera.pagar());
		
		
		for (Fruta fru: cestoDaCarlota.getFrutas()) {
			
			if (fru.getClass().getSimpleName().equals("FrutaVolume")) {
				System.out.println("antes "+ fru.pagar());
				((FrutaVolume)fru).setPercentagem(0.5);
				System.out.println(fru.pagar());
			} else if (fru.getClass().getSimpleName().equals("FrutaPeso")) {
				System.out.println("antes " + fru.pagar());
				((FrutaPeso)fru).setPercentagem(0.7);
				System.out.println(fru.pagar());
			} else {
				System.out.println(fru.pagar());
			}
		}
		
		}
}
