package mx.com.cuh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creamos las instancias para la clase Producto con valores aleatorios
		Producto producto1 = new Producto (1, "Despensa", 10.99, 100);
		
		Producto producto2 = new Producto (2, "Verduras", 19.75, 63);
		
		Producto producto3 = new Producto (3, "Cosas Personales", 342.8, 45);
		

		//mandamos a llamar los metodos y atributos que declaramos en nuestra clase Producto
		System.out.println("Nombre del producto 1: " + producto1.mostrarNombre());
		
		System.out.println("Precio del producto 2: $" + producto2.mostrarPrecio());
		
		System.out.println("Existencias del producto 3: " + producto3.mostrarExistencias());
		
		
	}

}
