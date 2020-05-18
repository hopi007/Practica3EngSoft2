package CapaBBDD;

import CapaAplicacio.FactoriaAbstracteEstrategiaDescompteVenda;
import CapaEstrategies.IEstrategiaDescompteVenda;

public class Venda {

	private IEstrategiaDescompteVenda estrategiaFixarPreuVenda;

	public Venda() {
		estrategiaFixarPreuVenda = FactoriaAbstracteEstrategiaDescompteVenda
				.getEstrategiaFixarPreuVenda();
	}

	public float getTotal() {
		return estrategiaFixarPreuVenda.getTotal(this);
	}

	public float getTotalAbansDte() {
		return 80.50f; // dada ficticia
	}

	public String getDescompte() {
		return estrategiaFixarPreuVenda.toString();
	}
}