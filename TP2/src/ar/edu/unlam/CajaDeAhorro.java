package ar.edu.unlam;
/*Caja de Ahorros
	Similar a la anterior, pero se pide que luego de la quinta
 	extracción de dinero se cobre un costo adicional por extracción de $ 6
 	
 	*/

public class CajaDeAhorro extends CuentaSueldo {
	private double adicional;
	private Integer limiteExtracciones;
	private Integer cantidadExtracciones;
	
	public CajaDeAhorro (double cuenta)
	{
		super(cuenta);
		this.adicional=6;
		this.limiteExtracciones = 5 ;
		this.cantidadExtracciones = 0;
	}
	
	public void getExtraer(double retiroDinero)
	{
		
		
			 
			 if(retiroDinero<= cuenta)
			{
				cantidadExtracciones++;
				cuenta= cuenta - retiroDinero;
							
			}
			
			if(cantidadExtracciones>=limiteExtracciones)
				{
					cuenta= cuenta - adicional;
				}
			
		
		}
		
		
	
	
	public Double saberAdicional()
	{
	 return cuenta; 
	}
	
}
