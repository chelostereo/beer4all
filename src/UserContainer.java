package beer4all;

import beer4all.Usuario;
import beer4all.Carrito;

// Almacena la información del usuario en su sesión.
public class UserContainer {
	private Carrito carrito = null;
  	private Usuario usuario = null;
  
	public UserContainer() {
		carrito = new Carrito();
		usuario = new Usuario();
	}

  	public Carrito getCarrito() {return carrito;}
	public Usuario getUsuario() {return usuario;}
	
  	public void setCarrito(Carrito carrito) {this.carrito = carrito;}
  	public void setUsuario(Usuario usuario) {this.usuario = usuario;}

}
