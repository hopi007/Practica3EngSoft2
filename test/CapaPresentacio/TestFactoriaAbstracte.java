
package CapaPresentacio;

import CapaAplicacio.Registre;

import java.util.HashSet;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFactoriaAbstracte {
	
	static HashSet <Float>  resultatEsperat;

	@BeforeClass
	public static void TestVenda() {
		resultatEsperat = new HashSet <Float> ();
        //Suposem que el mètode getTotalAbansDte() de la classe Venda retorna 80.5
        resultatEsperat.add(76.475F);//resultat esperat pel descompte del percentatge 0.05
        resultatEsperat.add(78.00F);//resultat esperat pel descompte absolut
        resultatEsperat.add(80.5F);//resultat esperat pel descompte null
	}	
	
	@Test
	public void testGetTotalVenda() {
		try {
			Registre ctl = new Registre ();
	        float totalVenda = ctl.getTotalVenda ();
	        System.out.println ("Import Total de la venda: " + totalVenda);
	        System.out.println(ctl.getDescompte());
	        assertTrue ("El resultat obtingut és: " + totalVenda, resultatEsperat.contains(totalVenda));
		} catch (Exception ex) {
			System.out.println ("ERROR Registre.getTotalVenda(): " + ex.getMessage());
		}		
	}
	


}