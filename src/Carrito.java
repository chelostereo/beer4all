package beer4all;

import java.util.ArrayList;
import beer4all.Producto;
import beer4all.CarritoProducto;

// Clase que implementa un carrito en memoria (no es persistente).
public class Carrito {

	private ArrayList listaProductos = null;
	private int cantidadTotalCarrito;
	private double precioTotalCarrito;

	
  	public Carrito() {
		listaProductos = new ArrayList();
		cantidadTotalCarrito=0;
		precioTotalCarrito=0;
  	}
	public ArrayList getListaProductos() {return listaProductos;}
	public int getCantidadTotalCarrito() {return cantidadTotalCarrito;}
	public double getPrecioTotalCarrito() {return precioTotalCarrito;}
	
	public void setListaProductos(ArrayList listaProductos) {this.listaProductos.addAll(listaProductos);}
	public void setCantidadTotalCarrito(int cantidadTotalCarrito) {this.cantidadTotalCarrito=cantidadTotalCarrito;}
	public void setPrecioTotalCarrito(double precioTotalCarrito) {this.precioTotalCarrito  = precioTotalCarrito;}
	
	
	public void addProducto(Producto producto, int cantidad){
		int size = listaProductos.size();
		int cantidadNew = 0;
		int cantidadOld = 0;
		double precioTotalNew = 0;
		double precioTotalOld = 0;
		
		if (cantidad <= 0) {cantidad=0;}
		CarritoProducto cartProducto = null;
		for (int i=0; i<size; i++){
			cartProducto = (CarritoProducto)(listaProductos.get(i)); 
			if (cartProducto.getId() == producto.getId()) {
				cantidadOld = cartProducto.getCantidad();
				precioTotalOld = cartProducto.getPrecioTotal();
				listaProductos.remove(i);
				break;
			}
		}
		cantidadNew = cantidadOld + cantidad;
		precioTotalNew = cantidadNew * producto.getPrecioUnitario();
		
		cantidadTotalCarrito = cantidadTotalCarrito + cantidad;
		precioTotalCarrito = precioTotalCarrito + (cantidad*producto.getPrecioUnitario());
		listaProductos.add(new CarritoProducto(producto, cantidadNew, precioTotalNew));
	}
	
	public void removeProductos(){
			listaProductos.clear();
			cantidadTotalCarrito=0;
			precioTotalCarrito=0;
	}
}
