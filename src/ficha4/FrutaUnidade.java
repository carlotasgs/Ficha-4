package ficha4;

public class FrutaUnidade extends Fruta {
	private int unidade;
	
	public FrutaUnidade (String nome, double precoBase, int unidade) {
		super(nome, precoBase);
		this.unidade=unidade;

	}
	
	public double pagar() {
		double precoAPagar = getPrecoBase() *unidade;
		return precoAPagar;
	}
	
}
