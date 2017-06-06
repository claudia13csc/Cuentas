package ar.edu.unlam;


public class Empleados
{
	protected String nombre;
	protected String apellido;
	public Double salario;
	private Integer dia;
	private Integer mes;
	private Integer anyo;
	
	
	public Empleados(String nombre,String apellido, Double sueldo, int diaNacimiento, int mesNacimiento, int anioNacimiento)
	{
		this.nombre = nombre;
		this.salario= sueldo;
		this.dia=diaNacimiento;
		this.mes=mesNacimiento;
		this.anyo=anioNacimiento;
		this.apellido=apellido;
		
	}


	
	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	




	public String brindarDatos() {
		return "Empleados [nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", dia=" + dia
				+ ", mes=" + mes + ", anyo=" + anyo + "]";
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
	}



	public Integer getDia() {
		return dia;
	}



	public void setDia(Integer dia) {
		this.dia = dia;
	}



	public Integer getMes() {
		return mes;
	}



	public void setMes(Integer mes) {
		this.mes = mes;
	}



	public Integer getAnyo() {
		return anyo;
	}



	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}


		
	
	
	


	
}

