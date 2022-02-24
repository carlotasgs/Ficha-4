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
	
		((FrutaVolume)uva).setPercentagem(0.5);
		((FrutaVolume)uva).pagar();
		System.out.println("Eu sou a uva e tive uma percentagem de " + ((FrutaVolume)uva).getPercentagem() + " passando a pagar s� " +((FrutaVolume)uva).pagar());
		System.out.println("Eu sou a uva e tive uma percentagem de " + ((FrutaVolume)uva).getPercentagem() + " passando a pagar s� " + uva.pagar()); //igual porque pagar est� na Classe Fruta
		
		pera.setPercentagem(0.7);
		pera.pagar();
		System.out.println("Eu sou a pera e tive uma percentagem de " + pera.getPercentagem() + " passando a pagar apenas " + pera.pagar());
		
	}
}
