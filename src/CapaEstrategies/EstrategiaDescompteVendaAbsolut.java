
package CapaEstrategies;

import CapaBBDD.Venda;

public class EstrategiaDescompteVendaAbsolut implements IEstrategiaDescompteVenda {

	private float descompte;
	private float llinda;

	public EstrategiaDescompteVendaAbsolut(float descompte, float llinda) {
		this.descompte = descompte;
		this.llinda = llinda;
	}

	public String toString() {
		return "Estrategia Descompte Absolut: Llinda = " + llinda + ", descompte = " + descompte;
	}

	@Override
	public float getTotal(Venda venda) {
		float preuAbansDte = venda.getTotalAbansDte();
		if (preuAbansDte >= llinda)
			return preuAbansDte - descompte;
		return preuAbansDte;
	}
}