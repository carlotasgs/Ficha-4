package ficha4;

public class FrutaPeso extends Fruta implements Descontavel{
	private double peso;
	private double percentagem;

	public FrutaPeso(String nome, double precoBase, double peso) {
		super(nome, precoBase);
		this.peso=peso;
		percentagem=0;
	}

	public double pagar() {
		double precoAPagar = getPrecoBase() *peso - descontar();
		return precoAPagar;
	}

	@Override
	public double descontar() {
		return getPrecoBase()*percentagem;
	}

	public void setPercentagem(double percentagem) {
		this.percentagem = percentagem;
	}

	public double getPercentagem() {
		return percentagem;
	}
	
	
}
