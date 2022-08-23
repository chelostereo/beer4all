package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.action.ActionForward;

import beer4all.UserContainer;
import beer4all.Carrito;
import beer4all.Producto;


public class AddProductoAction extends Action 
{
  	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response)
									throws Exception
	{
		// atributos -----------------------------------------------------------------
		String forward = "failure";

		UserContainer userContainer = null;
		HttpSession session = request.getSession(false);
		userContainer = (UserContainer) session.getAttribute("userContainer");
		if (userContainer!=null) {
			forward = "success";
			Carrito carrito = userContainer.getCarrito();

			int cantidad = java.lang.Integer.valueOf((String)request.getParameter("cantidad"));
			Producto producto = (Producto)session.getAttribute("producto");
			
			if (producto!=null) {
				carrito.addProducto(producto, cantidad);			
				userContainer.setCarrito(carrito);
			
				session.setAttribute("userContainer", userContainer);
				session.removeAttribute("producto");
			}
		}
		else {forward="not-session";}
		return (mapping.findForward(forward));
  	}
}