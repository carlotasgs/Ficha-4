package ficha4;

public class FrutaPeso extends Fruta implements Descontavel{
	private double peso;

	public FrutaPeso(String nome, double precoBase, double peso) {
		super(nome, precoBase);
		this.peso=peso;
	}

	public double pagar() {
		double precoAPagar = getPrecoBase() *peso;
		return precoAPagar;
	}
	
}
