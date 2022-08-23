package beer4all;

// Clase que representa a un usuario.
public class Usuario extends Object implements java.io.Serializable{
	
	// atributos ---------------------------------------------------------------------
	private String username;
	private String password;
	private String email;
	private int cantidad;
	private double consumo;
	
	// métodos GET -------------------------------------------------------------------
	public String getUsername() {return username;}
  	public String getPassword() {return password;}
	public String getEmail() {return email;}
	public int getCantidad() {return cantidad;}
	public double getConsumo() {return consumo;}
	
	// métodos SET -------------------------------------------------------------------
	public void setUsername(String username) {this.username = username;}
	public void setPassword(String password) {this.password = password;}
  	public void setEmail(String email) {this.email = email;}
	public void setCantidad(int cantidad) {this.cantidad = cantidad;}
	public void setConsumo(double consumo) {this.consumo = consumo;}
}
