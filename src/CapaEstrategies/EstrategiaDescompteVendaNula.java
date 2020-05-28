  
package CapaEstrategies;

import CapaBBDD.Venda;

public class EstrategiaDescompteVendaNula implements IEstrategiaDescompteVenda {
	private String error;

	public EstrategiaDescompteVendaNula(String error) {
		this.error = error;
	}

	public String toString() {
		return "No hi ha cap descompte. " + error;
	}

	@Override
	public float getTotal(Venda venda) {
		return venda.getTotalAbansDte();
	}
}