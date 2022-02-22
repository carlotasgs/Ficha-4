package ficha4;

public abstract class Fruta { //classe abstrata porque todas as subclasses têm que implementar os métodos desta, se fosse só duas subclasses a implementar um método fazia uma interface
	private String nome;
	private double precoBase;
	
	public Fruta(String nome, double precoBase) {
		this.nome=nome;
		this.precoBase=precoBase;
	}
	
	public double getPrecoBase() {
		return precoBase;
	}

	public abstract double pagar(); //abstract para não ter nada dentro
	
}
