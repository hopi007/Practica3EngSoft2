package CapaAplicacio;

import CapaEstrategies.EstrategiaDescompteVendaNula;
import CapaEstrategies.IEstrategiaDescompteVenda;
import CapaSingleton.ConfiguracioAplicacio;

public abstract class FactoriaAbstracteEstrategiaDescompteVenda {

	private static IEstrategiaDescompteVenda estrategiaFixarPreuVenda;

	public static final IEstrategiaDescompteVenda getEstrategiaFixarPreuVenda() {
		if (estrategiaFixarPreuVenda == null) {
			try {
				String configuracio = ConfiguracioAplicacio.getInstancia()
						.getConfiguracioAplicacio("nomFactoriaEstrategiaDescompte");
				Class<?> classe = Class.forName(configuracio);
				FactoriaAbstracteEstrategiaDescompteVenda factoria = (FactoriaAbstracteEstrategiaDescompteVenda) classe
						.getDeclaredConstructor().newInstance();
				estrategiaFixarPreuVenda = factoria.obtenirEstrategiaDecompte();
				// Cal que les factories concretes siguin les responsables de crear
				// l'estratègia concreta.
				// Aquesta classe abstracte ha d'obtenir quina factoria concreta ha de cridar.
				// La informacío estarà en un fitxer extern.

			} catch (Exception e) {
				estrategiaFixarPreuVenda = new EstrategiaDescompteVendaNula(e.toString());
				// Si no es pot crear una estratègia concreta, crearem l'estrategia nul·la
				// (sense cap descompte)
			}
		}
		return estrategiaFixarPreuVenda;
	}

	protected abstract IEstrategiaDescompteVenda obtenirEstrategiaDecompte();
}