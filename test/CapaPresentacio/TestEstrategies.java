
package CapaPresentacio;

import CapaBBDD.Venda;
import CapaEstrategies.EstrategiaDescompteVendaAbsolut;
import CapaEstrategies.EstrategiaDescompteVendaNula;
import CapaEstrategies.EstrategiaDescompteVendaPercentatge;
import CapaEstrategies.IEstrategiaDescompteVenda;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEstrategies {
	
	private static Venda vendaFicticia;
	private IEstrategiaDescompteVenda Estrategia;

	@BeforeClass
	public static void TestVenda() {
		vendaFicticia = new Venda();
	}	
	
	@Test
	public void testGetTotalNula() {
		try {
			Estrategia = new EstrategiaDescompteVendaNula( "Nula" );
	        float totalVenda = Estrategia.getTotal(vendaFicticia);
	        System.out.println ("Import Total de la venda: " + totalVenda);
	        assertEquals (totalVenda, 80.50, 0.01);
		} catch (Exception ex) {
			fail ("ERROR Nula: " + ex.getMessage());
		}		
	}
	
	@Test
	public void testAbsolutAmbLlindar() {
		try {
			Estrategia = new EstrategiaDescompteVendaAbsolut( 2.00F, 10.00F );
	        float totalVenda = Estrategia.getTotal(vendaFicticia);
	        System.out.println ("Import Total de la venda: " + totalVenda);
	        assertEquals (totalVenda, 78.50, 0.01);
		} catch (Exception ex) {
			fail ("ERROR Absolut: " + ex.getMessage());
		}		
	}
	
	@Test
	public void testAbsolut() {
		try {
			Estrategia = new EstrategiaDescompteVendaAbsolut( 2.00F, 100.00F );
	        float totalVenda = Estrategia.getTotal(vendaFicticia);
	        System.out.println ("Import Total de la venda: " + totalVenda);
	        assertEquals (totalVenda, 80.50, 0.01);
		} catch (Exception ex) {
			fail ("ERROR Absolut: " + ex.getMessage());
		}		
	}

	@Test
	public void testPercentatge() {
		try {
			Estrategia = new EstrategiaDescompteVendaPercentatge( 0.10F );
	        float totalVenda = Estrategia.getTotal(vendaFicticia);
	        System.out.println ("Import Total de la venda: " + totalVenda);
	        assertEquals (totalVenda, 72.45, 0.01);
		} catch (Exception ex) {
			fail ("ERROR Absolut: " + ex.getMessage());
		}		
	}
}