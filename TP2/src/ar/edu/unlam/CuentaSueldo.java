package ar.edu.unlam;
/*Cuenta Sueldo
 * Nosotros vamos a ser menos estrictos, ya que por el momento no nos interesa computar los movimientos de dinero del cliente sino los totales instantáneos 
 * (es decir, cuánto dinero tiene el cliente a cada momento luego de realizar cada transacción).
Es el tipo de cuenta más simple, ya que se rige por la premisa de que en tanto y en cuanto se tenga 
tanto o más dinero en cuenta del que se quiere extraer, la operación se debe efectuar correctamente.*/
public class CuentaSueldo {
	
	protected double cuenta;
	private boolean estado;
	
	public CuentaSueldo(double total) {
		
	}

	public  void cuentaSueldo(double total)
	{
			this.cuenta = total;
			this.estado=false;
	}

	public boolean getPosibleExtraer(double retiroDinero)
	{
		
		if(retiroDinero<= cuenta)
		{
			estado=true;
			return estado;
			
		}
		else
		{
			return estado;
		}
		
	}
	
	public Double getSaldo()
	{
		return cuenta;
	}
	
	
}
