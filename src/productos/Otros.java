package productos;

public class Otros extends Productos{
		
	public Otros() {
		super();
	}
		
	public Otros(String nombre, int precio, String contenido) {
		super(nombre,contenido,precio);
	}
	
	public String toString() {
		return "Nombre: "+nombre+" // "+"Precio: $"+precio+" // Unidad de venta: "+contenido;
	}
}
