package main;

import java.util.ArrayList;
import productos.Productos;
import productos.Otros;
import productos.Bebidas;
import productos.ProductosOrdenados;

public class Principal{
	
	public static ArrayList<Productos> items = new ArrayList<Productos>();
	
	public static void main(String[] args) {
		
		System.out.println("");

		Productos cocaZero = new Bebidas("Coca-Cola Zero","Litros: 1.5",20);
		Productos coca = new Bebidas("Coca-Cola","Litros: 1.5",18);
		Productos sedal = new Bebidas("Shampoo Sedal","Contenido: 500ml",19);
		Productos frutilla = new Otros("Frutilla",64,"kilo");
	
		items.add(cocaZero);
		items.add(coca);
		items.add(sedal);
		items.add(frutilla);
		
		for (Productos item : items) {
			System.out.println(item.toString());
		}
	
		ProductosOrdenados ordenarProductos = new ProductosOrdenados(items);
		ArrayList <Productos> productosOrdenados = ordenarProductos.getProductosPorPrecio();
		
		System.out.println("=============================");

		System.out.println("Producto más caro: "+productosOrdenados.get(productosOrdenados.size()-1).getNombre()+"\n"
				+ "Producto más barato: "+productosOrdenados.get(0).getNombre());
		
		System.out.println("");

		
	}
}