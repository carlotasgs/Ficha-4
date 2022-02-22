package ficha4;

public abstract class Fruta { //classe abstrata porque todas as subclasses t�m que implementar os m�todos desta, se fosse s� duas subclasses a implementar um m�todo fazia uma interface
	private String nome;
	private double precoBase;
	
	public Fruta(String nome, double precoBase) {
		this.nome=nome;
		this.precoBase=precoBase;
	}
	
	public double getPrecoBase() {
		return precoBase;
	}

	public abstract double pagar(); //abstract para n�o ter nada dentro
	
}
