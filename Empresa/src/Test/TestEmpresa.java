package Test;

import static org.junit.Assert.*;


import org.junit.Test;

import ar.edu.unlam.Director;
import ar.edu.unlam.Empleados;
import ar.edu.unlam.Impuesto;
import ar.edu.unlam.Ingeniero;

public class TestEmpresa {

	@Test
	public void testEmpleados() {
		Empleados trabajador= new Empleados("Juana", "Martinez",25000.00, 11, 11, 1981);
		assertTrue("Juana"==trabajador.getNombre());
		assertFalse(trabajador.brindarDatos().contains("333"));
	
		
	}
	@Test
	public void testImpuesto(){
		Ingeniero ing= new Ingeniero ("Martin","Pereyra",30000.00, 19, 07, 1955);		
		Impuesto ganancia=new Impuesto();
		Double impuesto=ganancia.obtenerImpuesto(ing);
		assertEquals(29000.00,impuesto,0.01);
	}
	@Test 
	public void testDirector(){
		Director dic=new Director("Milton", "Whispers", 60000.00, 06, 06, 1923,5000.00,"tienecochera");
		assertEquals(65000.00, dic.getExtraCoche(), 0.01);
		dic.setExtraCoche(10000.00);
		assertEquals(70000.00,dic.getExtraCoche(), 0.01);
	}
}
