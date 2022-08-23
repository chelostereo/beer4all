package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.action.ActionForward;

import java.util.ArrayList;

// Imports de clases propias de la aplicación.
import beer4all.services.ConnectionService;
import beer4all.UserContainer;
import beer4all.Producto;
import beer4all.Utils;

public class WelcomeAction extends Action {

	private final int CANTIDAD_PRODUCTOS = 6;
	
	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response)
									throws Exception 
	{
		
		String forward = "success";	
		
		HttpSession session = request.getSession(false);
		UserContainer userContainer = (UserContainer)session.getAttribute("userContainer");
		
		if (userContainer==null) {
			// no existe el user Container en la sesion
			ConnectionService connectionService = new ConnectionService();
			ArrayList listaProductos = connectionService.getListaProductos();
			//connectionService.destroy();
			
			ArrayList lista = Utils.getRandomProductos(listaProductos, CANTIDAD_PRODUCTOS);
			request.setAttribute("listaProductos", lista);
		}
		else {
			// el userContainer ya existe en la sesion, forward a viewperfil.
			forward="on-session";}
		return (mapping.findForward(forward));
  	}

}
