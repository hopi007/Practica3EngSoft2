
package CapaSingleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguracioAplicacio {

	private static ConfiguracioAplicacio instancia;
	private Properties propietatsAplicacio;
	private final String NOM_FITXER_EXTERN = "src/CapaSingleton/FitxerConfiguracio.properties";

	private ConfiguracioAplicacio() throws Exception {
		try {
			FileInputStream f = new FileInputStream(NOM_FITXER_EXTERN);
			propietatsAplicacio = new Properties();
			propietatsAplicacio.load(f);
			f.close();
		} catch (IOException e) {
			throw new Exception("No es pot carregar la Configuració del Sistema: " + e.getMessage());
		}
	}

	public synchronized static ConfiguracioAplicacio getInstancia() throws Exception {
		if (instancia == null)
			instancia = new ConfiguracioAplicacio();

		return instancia;
	}

	public String getConfiguracioAplicacio(String clau) {
		return propietatsAplicacio.getProperty(clau);
	}
}