package ficha4;

public class FrutaVolume extends Fruta implements Descontavel {
	private double volume;
	private double percentagem;

	public FrutaVolume (String nome, double precoBase, double volume) {
		super(nome, precoBase);
		this.volume=volume;
		percentagem=0;
	}
	
	public double pagar() {
		double precoAPagar = getPrecoBase() *volume - descontar();
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
