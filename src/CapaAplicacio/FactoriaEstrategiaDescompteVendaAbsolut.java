package CapaAplicacio;

import CapaEstrategies.EstrategiaDescompteVendaAbsolut;
import CapaEstrategies.IEstrategiaDescompteVenda;

public class FactoriaEstrategiaDescompteVendaAbsolut extends FactoriaAbstracteEstrategiaDescompteVenda {

	@Override
	protected IEstrategiaDescompteVenda obtenirEstrategiaDecompte() {
		// Pendent d'implementar
		Registre registre = new Registre();
		float retorn[] = registre.getPersistencia().getDescompteAbsolut();

		return new EstrategiaDescompteVendaAbsolut(retorn[0], retorn[1]);
	}
}