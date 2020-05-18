package CapaAplicacio;

import CapaEstrategies.IEstrategiaDescompteVenda;


public abstract class FactoriaAbstracteEstrategiaDescompteVenda {

	private static IEstrategiaDescompteVenda estrategiaFixarPreuVenda;

	public static final IEstrategiaDescompteVenda getEstrategiaFixarPreuVenda() {
		if (estrategiaFixarPreuVenda == null) {
			try {
				 //Cal que les factories concretes siguin les responsables de crear l'estratègia concreta.
				//Aquesta classe abstracte ha d'obtenir quina factoria concreta ha de cridar.
				//La informacío estarà en un fitxer extern.
				
				//Pendent d'implementar
				
			} catch (Exception e) {
				//Si no es pot crear una estratègia concreta, crearem l'estrategia nul·la (sense cap descompte)
			}
		}
		return estrategiaFixarPreuVenda;
	}

	protected abstract IEstrategiaDescompteVenda obtenirEstrategiaDecompte();	
}