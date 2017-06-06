package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.CajaDeAhorro;
import ar.edu.unlam.CuentaCorriente;
import ar.edu.unlam.CuentaSueldo;

public class testCuentas {

	@Test
	public void testCuentaSueldo() {
		
		CuentaSueldo cliente= new CuentaSueldo(1000.00);
		//cliente.getPosibleExtraer(800.00);
		assertFalse(cliente.getPosibleExtraer(800.00));
		
		
	}
	
	@Test
	public void testCajaAhorro()
	{
		CajaDeAhorro cliente= new CajaDeAhorro(1000.00);
		cliente.getPosibleExtraer(50.00);
		cliente.getPosibleExtraer(50.00);
		cliente.getPosibleExtraer(50.00);
		cliente.getPosibleExtraer(50.00);
		cliente.getPosibleExtraer(50.00);
		assertEquals(744.00, cliente.saberAdicional(), 0.1);

	}
	
	@Test
	public void testCuentaCorriente()
	{
		
		CuentaCorriente cliente = new CuentaCorriente(1000.00, 300.00);
	
	cliente.setPosibleExtraerExtra(1200.00);
	
	assertEquals(10.00, cliente.deudaBanco(), 0.1);
	
	
	}

}
