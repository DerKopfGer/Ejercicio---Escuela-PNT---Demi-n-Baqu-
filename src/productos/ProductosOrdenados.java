
package productos;

import java.util.ArrayList;
import java.util.Collections;

public class ProductosOrdenados {

	ArrayList<Productos> productos = new ArrayList<>();
	
	public ProductosOrdenados(ArrayList<Productos> productos) {
		this.productos = productos;
	}
	
	 public ArrayList<Productos> getProductosPorPrecio() {         
		    Collections.sort(productos);         
		    return productos;     
		  } 
}
