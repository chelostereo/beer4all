package beer4all.services;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.ArrayList;

import beer4all.Producto;
import beer4all.Usuario;

public class ConnectionService {
	
	private static DBConnector dbConnector = null;

   	public ConnectionService() throws Exception{
		dbConnector = DBConnector.getInstance("jdbc:mysql://localhost/beer4all?autoReconnect=true", "", "");
		//dbConnector = DBConnector.getInstance("jdbc:mysql://s43.eatj.com/chelostereo?autoReconnect=true", "chelostereo", "nolose");
	}
	
	public ArrayList getListaProductos() throws Exception{
		Connection conn = null;
		Statement stmt=null;
		ResultSet results = null;
		ArrayList listaProductos = new ArrayList();
		Producto producto = null;
		
		try {
			conn = dbConnector.getConnection();
			
			// CREATE STATEMENT 
			stmt = conn.createStatement(); 
		
			// EXECUTE QUERY
			results = stmt.executeQuery("select * from productos ORDER BY nombre"); 
			
			// GET ALL RESULTS 
			while (results.next()){
				producto = new Producto();
				producto.setId(results.getInt("id"));
				producto.setNombre(results.getString("nombre"));
				producto.setDescripcion(results.getString("descripcion"));
				producto.setPrecioUnitario(results.getDouble("precio"));
				producto.setImagenURL((results.getString("imagenURL")));
				listaProductos.add(producto);
			}
			results.close();
		}
		catch(Exception e) {}
		finally {
			stmt.close();
			conn.close();
		}		
		return (listaProductos);
  	}
	
  	public Producto getDetalleProducto(int productoID) throws Exception{
		Connection conn = null;
		Statement stmt=null;
		ResultSet results = null;
		Producto producto = null;
		
		try {
			conn = dbConnector.getConnection();
			
			// CREATE STATEMENT 
			stmt = conn.createStatement();
		
			// EXECUTE QUERY
			String id = java.lang.Integer.toString(productoID);
			String query = "select * from productos where id = " + id;
			results = stmt.executeQuery(query); 

			// GET ALL RESULTS 
			while (results.next()){
				producto = new Producto();
				producto.setId(results.getInt("id"));
				producto.setNombre(results.getString("nombre"));
				producto.setDescripcion(results.getString("descripcion"));
				producto.setPrecioUnitario(results.getDouble("precio"));
				producto.setImagenURL(results.getString("imagenURL"));				
			}
			results.close();
		}
		catch (Exception e) {}
		finally {
			stmt.close();
			conn.close();
		}
		return (producto);
  	}
	
  	public ArrayList searchProducto(String nombre) throws Exception{
		Connection conn = null;
		Statement stmt = null;
		ResultSet results = null;
		ArrayList lista = new ArrayList();		
		Producto producto = null;
		
		try {
			conn = dbConnector.getConnection();
		
			// CREATE STATEMENT 
			stmt = conn.createStatement(); 
		
			// EXECUTE QUERY
			String query = "SELECT * FROM productos where nombre like '%"+nombre+"%' ORDER BY nombre";
			results = stmt.executeQuery(query); 
	
			// GET ALL RESULTS 
			while (results.next()){
				producto = new Producto();
				producto.setId(results.getInt("id"));
				producto.setNombre(results.getString("nombre"));
				producto.setDescripcion(results.getString("descripcion"));
				producto.setPrecioUnitario(results.getDouble("precio"));
				producto.setImagenURL((results.getString("imagenURL")));
				lista.add(producto);
			}
			results.close();
		}
		catch (Exception e) {}
		finally {
			stmt.close();
			conn.close();
		}
		return (lista);
	}
	
	public Usuario authenticateUsuario(String username, String password) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet results = null;
		Usuario usuario = null;		
		
		try {
			conn = dbConnector.getConnection();
			
			// CREATE STATEMENT 
			String query = "SELECT * FROM USUARIOS WHERE username = ? AND PASSWORD = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
		 
			// EXECUTE QUERY
			results = ps.executeQuery();
			
			// GET ALL RESULTS 
			if (results.next()){
				usuario = new Usuario();
				usuario.setUsername(results.getString("username"));
				usuario.setPassword(results.getString("password"));
				usuario.setEmail(results.getString("email"));
				usuario.setCantidad(results.getInt("cantidad"));
				usuario.setConsumo(results.getDouble("consumo"));
				//if (!password.equals(usuario.getPassword())) {usuario = null;}
			}
			results.close();
		}
		catch (Exception e) {}
		finally {
			ps.close();
			conn.close();
		}
		return (usuario);
	}

	public int registerUsuario(Usuario usuario) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet results = null;
		int resultado = 0;
		
		try {
			conn = dbConnector.getConnection();
			
			// CREATE STATEMENT 
			String update = "insert into usuarios values (?,?,?,?,?)";
			ps = conn.prepareStatement(update);
			ps.setString(1, usuario.getUsername());
			ps.setString(2, usuario.getPassword());
			ps.setString(3, usuario.getEmail());
			ps.setInt(4, 0);
			ps.setDouble(5, 0);
	
			// EXECUTE UPDATE 
			resultado = ps.executeUpdate();
		} 
		catch (SQLException e){if (e.getErrorCode() == 1062) {resultado = -1;}}
		finally {
			ps.close();
			conn.close();
		}
		return (resultado);
	}

	public void updateUsuario(String username, int cantidad, double consumo) throws Exception{

		Connection conn = null;
		ResultSet results = null;
		PreparedStatement prepstmt = null;
		
		try {
			conn = dbConnector.getConnection();
			
			// CREATE PREPARED STATEMENT 
			prepstmt = conn.prepareStatement("UPDATE usuarios SET cantidad=?, consumo=? WHERE username=?");
		
			// SET PARAMETERS
			prepstmt.setInt(1, cantidad); 
			prepstmt.setDouble(2, consumo); 
			prepstmt.setString(3, username); 

			// EXECUTE PREPARED SQL 
			boolean ret = false; 
			int updateCount = 0; 

			ret = prepstmt.execute(); 
			if (ret == true) {results = prepstmt.getResultSet(); } 
			else {updateCount = prepstmt.getUpdateCount();}
		}
		catch (Exception e) {}
		finally {
			prepstmt.close();
			conn.close();
		}
	}
}
		