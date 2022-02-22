package ficha4;

public class FrutaVolume extends Fruta implements Descontavel {
	private double volume;
	private final double percentagem;

	public FrutaVolume (String nome, double precoBase, double volume) {
		super(nome, precoBase);
		this.volume=volume;
		percentagem=0.25;
	}
	
	public double pagar() {
		double precoAPagar = getPrecoBase() *volume - descontar(percentagem);
		return precoAPagar;
	}

	@Override
	public double descontar(double percentagem) {
		return getPrecoBase()*percentagem;
	}

}
