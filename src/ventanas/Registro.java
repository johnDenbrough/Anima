package ventanas;

public class Registro implements java.io.Serializable{
	protected String nombre;
	protected int codigo;
	
	public Registro(String nombre, int codigo){
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getCodigo(){
		return codigo;
	}
}