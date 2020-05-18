  
package CapaAplicacio;

import CapaBBDD.IServeisPersistenciaVenda;
import CapaBBDD.SimulacioBBDDDescomptesPreusVenda;
import CapaBBDD.Venda;


public class Registre {

	private Venda vendaActual;
	private static IServeisPersistenciaVenda persistencia;

	public Registre(IServeisPersistenciaVenda bbdd) {
		persistencia = bbdd;
		vendaActual = new Venda();
	}
	
	public Registre() {
		this (new SimulacioBBDDDescomptesPreusVenda());
	}

	public float getTotalVenda() {
		return vendaActual.getTotal();
	}

	public String getDescompte() {
		return vendaActual.getDescompte();
	}
	
	static IServeisPersistenciaVenda getPersistencia () {
	    return persistencia;
	}
}