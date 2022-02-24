package ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto {
	private int totalItens;
	private final int capacidadeMax = 100;
	private List <Fruta> frutas;
	
	public Cesto() {
		totalItens=0;
		frutas=new ArrayList<Fruta>(capacidadeMax);
	}

	public void inserirNoCesto (Fruta x) {
		frutas.add(x);
		totalItens++;
	}
	
	public double valorTotal () {
		
		double valorNoCesto = 0;
		
		for (Fruta fru: frutas) {
			valorNoCesto+= fru.pagar();
			
		}
		System.out.println(valorNoCesto);
		return valorNoCesto;
		
	}
	
	public void tipoFruta () {
		
		int frutasUnidade=0;
		int frutasPeso=0;
		int frutasVolume=0;
		
		for (Fruta fru: frutas) {
			
				if (fru instanceof FrutaUnidade) {
					frutasUnidade++;
				}
				else if (fru instanceof FrutaPeso) {
					frutasPeso++;
				} else {
					frutasVolume++;
				}
		}
		
		System.out.println("O cesto tem " + frutasUnidade + " frutas do tipo frutas unidade, " + frutasPeso + " frutas do tipo frutas peso e " + frutasVolume + " frutas do tipo frutas volume.");
	}
	
	public void totalGasto () {
		double valorTotalUnidade=0;
		double valorTotalPeso=0;
		double valorTotalVolume=0;
		
		for (Fruta fru: frutas) {
			if (fru instanceof FrutaUnidade) {
				fru.pagar();
				valorTotalUnidade++;
			} else if (fru instanceof FrutaPeso) {
				fru.pagar();
				valorTotalPeso++;
			} else {
				fru.pagar();
				valorTotalVolume++;
			}
		}
		System.out.println("O cesto tem " + valorTotalUnidade + " euros de frutas do tipo frutas unidade, " + valorTotalPeso + " euros de frutas do tipo frutas peso e " + valorTotalVolume + " euros de frutas do tipo frutas volume.");
		
	}
	
	public List<Fruta> getFrutas() {
		return frutas;
	}

	public void setFrutas(List<Fruta> frutas) {
		this.frutas = frutas;
	}
	
	//outra forma de fazer
	

	public int contaTipoFruta(String tipo) {
		int contagem =0;
		for (Fruta fru: frutas) {
			 if(fru.getClass().getSimpleName().equals(tipo)) {
				 contagem++;
			}
		}
		return contagem;
	}
	
	public double valorPorTipo(String tipo) {
		int valor=0;
		for (Fruta fru: frutas) {
			 if(fru.getClass().getSimpleName().equals(tipo)) {
				 valor+=fru.pagar();
			}
		}
		return valor;
		
	}
}
