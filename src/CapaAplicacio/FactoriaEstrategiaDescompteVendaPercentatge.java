package CapaAplicacio;

import java.util.Calendar;
import java.util.Date;

import CapaEstrategies.EstrategiaDescompteVendaPercentatge;
import CapaEstrategies.IEstrategiaDescompteVenda;

public class FactoriaEstrategiaDescompteVendaPercentatge extends FactoriaAbstracteEstrategiaDescompteVenda {
	@Override
	protected IEstrategiaDescompteVenda obtenirEstrategiaDecompte() {
		// Pendent d'implementarÁ
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		float retorn = Registre.getPersistencia().getDescomptePercentatge(dayOfWeek);

		return new EstrategiaDescompteVendaPercentatge(retorn);
	}
}