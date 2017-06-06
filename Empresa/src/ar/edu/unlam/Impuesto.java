package ar.edu.unlam;

public class Impuesto {

	public Impuesto(){
		
	}
	
	public Double obtenerImpuesto(Empleados empleado){
		if(empleado.salario>50000.00)return empleado.salario-3000.00;
		else if(empleado.salario>35000.00)return empleado.salario-1500.00;
		else if (empleado.salario>20000.00)return  empleado.salario-1000.00;
		else return empleado.salario ;
	}
}
