package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;

import beer4all.services.*;
import beer4all.*;

public class ViewDetalleProductoAction extends Action {

	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response)
									throws Exception 
	{
		// atributos -----------------------------------------------------------------
		String forward = "failure";	
		
		int productoId = java.lang.Integer.valueOf((String)request.getParameter("id"));
	
		ConnectionService connectionService = new ConnectionService();
		Producto producto = connectionService.getDetalleProducto(productoId);
		//connectionService.destroy();

		if (producto!=null) {
			forward="success";

			HttpSession session = request.getSession(false);
			session.setAttribute("producto", producto);

		}
		return (mapping.findForward(forward));
  	}
}
