package CapaAplicacio;

import CapaEstrategies.EstrategiaDescompteVendaAbsolut;
import CapaEstrategies.IEstrategiaDescompteVenda;

public class FactoriaEstrategiaDescompteVendaAbsolut extends FactoriaAbstracteEstrategiaDescompteVenda {

	@Override
	protected IEstrategiaDescompteVenda obtenirEstrategiaDecompte() {
		// Pendent d'implementar
		float retorn[] = Registre.getPersistencia().getDescompteAbsolut();

		return new EstrategiaDescompteVendaAbsolut(retorn[0], retorn[1]);
	}
}