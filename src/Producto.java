package beer4all;

public class Producto extends Object implements java.io.Serializable {

	private int id;
  	private String nombre;
	private String descripcion;
	private double precioUnitario;
	private String imagenURL;
	

  	// métodos GET -------------------------------------------------------------------
	public int getId() {return id;}
  	public String getNombre() {return nombre;}
  	public String getDescripcion() {return descripcion;}
  	public double getPrecioUnitario() {return precioUnitario;}
	public String getImagenURL() {return imagenURL;}
	
	// métodos SET -------------------------------------------------------------------
	public void setId(int id) {this.id = id;}
	public void setNombre(String nombre) {this.nombre = nombre;}
  	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
	public void setPrecioUnitario(double precioUnitario) {this.precioUnitario = precioUnitario;}
	public void setImagenURL(String imagenURL) {this.imagenURL = imagenURL;}
}