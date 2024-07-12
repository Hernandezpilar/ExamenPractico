package mx.com.cuh;

public class Producto {
	
	
	//definimos nuestros atributos de nuestra clase
	private int identificadorProducto;
	private String nombre;
	private double precio;
	private int existencias;
	
	
	//Creamos nuestro constructor
	public Producto (int identificadorProducto, String nombre, double precio, int existencias) {
		this.identificadorProducto = identificadorProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.existencias = existencias;
	}

	
	//metodos para mostrar los atributos
	public String mostrarNombre() {
		return this.nombre;
	}
	
	public double mostrarPrecio() {
		return this.precio;
	}
	
	public int mostrarExistencias() {
		return this.existencias;
	}

	
	
	
	//metodos get y set para acceder y modificar los atributos
	public int getIdentificadorProducto() {
		return identificadorProducto;
	}


	public void setIdentificadorProducto(int identificadorProducto) {
		this.identificadorProducto = identificadorProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getExistencias() {
		return existencias;
	}


	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

}
