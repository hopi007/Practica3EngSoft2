
package CapaEstrategies;

import CapaBBDD.Venda;

public class EstrategiaDescompteVendaPercentatge implements
		IEstrategiaDescompteVenda {

	private float percentatge;

	public EstrategiaDescompteVendaPercentatge(float percentatge) {
		this.percentatge = percentatge;
	}

	public String toString() {
		return "Estrategia Descompte Percentatge = " + percentatge;
	}

	@Override
	public float getTotal(Venda venda) {
		float preuAbansDte= venda.getTotalAbansDte();
		return preuAbansDte-(preuAbansDte*percentatge);
	}
}