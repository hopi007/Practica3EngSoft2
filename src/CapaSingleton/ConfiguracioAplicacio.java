
package CapaSingleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracioAplicacio {

	private static ConfiguracioAplicacio instancia;
	private Properties propietatsAplicacio;
	private final String NOM_FITXER_EXTERN = "src/CapaSingleton/FitxerConfiguracio.properties";

	private ConfiguracioAplicacio() throws Exception {
		try {
			// Per implementar: Obrir i carregar el fitxer de propietats

		} catch (IOException e) {
			throw new Exception("No es pot carregar la Configuració del Sistema: " + e.getMessage());
		}
	}

	// Per implementar getInstancia del patró singleton

	public String getConfiguracioAplicacio(String clau) {
		// Per implementar retornar el valor de la propietat
	}
}