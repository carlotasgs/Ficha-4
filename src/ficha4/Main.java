package ficha4;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		
		Cesto cestoDaCarlota = new Cesto();
		Fruta maca = new FrutaUnidade ("maca verde", 2.5, 5);
		Fruta uva = new FrutaVolume ("uva verde", 1.21, 2);
		Fruta pera = new FrutaPeso("pera amarela", 1.6, 4);
		Fruta banana = new FrutaUnidade("banana", 0.20, 1);
		
		cestoDaCarlota.inserirNoCesto(maca);
		cestoDaCarlota.inserirNoCesto(uva);
		cestoDaCarlota.inserirNoCesto(pera);
		cestoDaCarlota.inserirNoCesto(banana);
	
	
	cestoDaCarlota.valorTotal();
	cestoDaCarlota.tipoFruta();
	cestoDaCarlota.totalGasto();

	}
}
