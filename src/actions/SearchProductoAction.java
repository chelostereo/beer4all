package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
//import org.apache.struts.action.DynaActionForm;
import org.apache.struts.action.ActionForward;

import java.util.ArrayList;

// Imports de clases propias de la aplicación.
import beer4all.services.ConnectionService;

public class SearchProductoAction extends Action {

	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response)
									throws Exception 
	{
		
		String forward="success";
		String nombre = (String)request.getParameter("nombre");

		if (!nombre.equals("")) {
			ConnectionService connectionService = new ConnectionService();
			ArrayList listaProductos = connectionService.searchProducto(nombre);
			//connectionService.destroy();

			request.setAttribute("listaProductos", listaProductos);
		}
		return (mapping.findForward(forward));
  	}
}
