package ar.edu.unlam;
/*Cuenta Corriente
La más compleja de las cuentas, ésta permite establecer una cantidad de dinero a girar en descubierto. 
Es por ello que cada vez que se desee extraer dinero, no sólo se considera el que se posee, 
sino el límite adicional que el banco estará brindando. Por supuesto esto no es gratis, ya que el banco
 nos cobrará un 5% como comisión sobre todo el monto en descubierto consumido en la operación. 
 Por ejemplo, si tuviéramos $ 100 en la cuenta, y quisiéramos retirar $ 200 (con un descubierto de $ 150),
  podremos hacerlo. Pasaremos a deberle al banco $ 105 en total: los $ 100 que nos cubrió,
   más el 5% adicional sobre el descubierto otorgado.*/

public class CuentaCorriente extends CuentaSueldo {
	private double girarDescubierto;
	private  double comisionBanco;
	//private double deudaConBanco;
	
	public CuentaCorriente (Double cuenta,Double cantidadExtraParaGirar )
	{
		super(cuenta);
		this.girarDescubierto = cantidadExtraParaGirar;
		this.comisionBanco = 0.05;
		this.deudaConBanco = 0.00;
	}
	
	
	
	
	public void setPosibleExtraerExtra (Double retiroDinero)
	{
		 if( retiroDinero > cuenta){
			 retiroDinero= retiroDinero-cuenta;
			if(retiroDinero<=girarDescubierto)
			 deudaConBanco=retiroDinero*comisionBanco;
		 }
		
	}
	
	public Double deudaBanco()
	{
		
		return deudaConBanco;
	}
	
	
	
	
}
