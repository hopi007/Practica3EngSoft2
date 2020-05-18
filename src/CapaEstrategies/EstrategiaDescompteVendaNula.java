  
package CapaEstrategies;

import CapaBBDD.Venda;

public class EstrategiaDescompteVendaNula implements IEstrategiaDescompteVenda {
	private String error;

	public EstrategiaDescompteVendaNula(String error) {
		this.error = error;
	}

	//Pendent implementar getTotal

	public String toString() {
		return "No hi ha cap descompte. " + error;
	}
}