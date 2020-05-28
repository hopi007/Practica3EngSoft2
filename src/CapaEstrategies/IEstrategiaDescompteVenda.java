  
package CapaEstrategies;

import CapaBBDD.Venda;

public interface IEstrategiaDescompteVenda {

	public abstract float getTotal(Venda venda);
}