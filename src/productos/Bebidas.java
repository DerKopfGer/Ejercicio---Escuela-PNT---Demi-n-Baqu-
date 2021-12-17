package productos;

public class Bebidas extends Productos {

	public Bebidas() {
		super();
	}
	
	public Bebidas(String nombre, String contenido, int precio) {
		super(nombre,contenido,precio);		
	}
	
	public String toString() {
		return "Nombre: "+nombre+" // "+contenido+" // "+"Precio: $"+precio;
	}
}
