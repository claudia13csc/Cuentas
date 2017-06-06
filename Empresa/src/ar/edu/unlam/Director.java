package ar.edu.unlam;

public class Director extends Empleados
{
	
	private Double extraCoche;

	
	
	public Director ( String nombre, String apellido, Double sueldo, int diaNacimiento, int mesNacimiento, int anioNacimiento,Double extra,String coche)
	{
		super( nombre,apellido, sueldo,  diaNacimiento,  mesNacimiento,  anioNacimiento);//llama al contructor de la clase padre
		
		this.extraCoche = extra;
		
		
	}

	//métodos
	public Double getExtraCoche() {
		return extraCoche + salario ;
	}

	public void setExtraCoche(Double extraCoche) {
		this.extraCoche = extraCoche;
	}

		
	
}
