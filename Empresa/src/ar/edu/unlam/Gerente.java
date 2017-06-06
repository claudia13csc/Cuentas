package ar.edu.unlam;

public class Gerente extends Empleados 
{
	
	private String cochera;

	public Gerente  ( String nombre, String apellido, Double sueldo, int diaNacimiento, int mesNacimiento, int anioNacimiento,String coche)
	{
		super( nombre, apellido, sueldo, diaNacimiento,  mesNacimiento,  anioNacimiento);//llama al contructor de la clase padre
		
		this.cochera= coche;
	}

	public String getCochera()
	{
	 return this.cochera; 	
	}

	
	
}
