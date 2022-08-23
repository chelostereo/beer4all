package beer4all;

import beer4all.Producto;

public class CarritoProducto {

	private Producto producto = null;
	private int cantidad = 0;
	// precioTotal es el precio unitario * cantidad.
  	private double precioTotal = 0.0;
  	
	/*
	private int id;
	private String nombre;
	private double precioUnitario;
	private String imagenURL;
	*/
  	public CarritoProducto(Producto producto, int cantidad, double precioTotal) {
	    this.producto = producto;
	    this.cantidad = cantidad;
		this.precioTotal = precioTotal;
  	}
	
	public Producto getProducto() {return producto;}
	public int getCantidad() {return cantidad;}
  	public double getPrecioTotal() {return precioTotal;}

	
	// metodos para obtener la info del producto unitario
  	public int getId() 	{return producto.getId();}
	public String getNombre() {return producto.getNombre();}
	//public String getDescripcion() {return producto.getDescripcion();}
  	public double getPrecioUnitario() {return producto.getPrecioUnitario();}
	public String getImagenURL() {return producto.getImagenURL();}

}
