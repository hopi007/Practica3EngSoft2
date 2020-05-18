
package CapaEstrategies;

import CapaBBDD.Venda;

public class EstrategiaDescompteVendaPercentatge implements
		IEstrategiaDescompteVenda {

	private float percentatge;

	public EstrategiaDescompteVendaPercentatge(float percentatge) {
		this.percentatge = percentatge;
	}

	//Pendent implementar getTotal


	public String toString() {
		return "Estrategia Descompte Percentatge = " + percentatge;
	}
}