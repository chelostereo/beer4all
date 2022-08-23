package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;

import beer4all.Carrito;
import beer4all.CarritoProducto;
import beer4all.UserContainer;

public class RemoveProductosAction extends Action {

	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response)
									throws Exception 
	{
		
		String forward = "failure";	;	
		
		HttpSession session = request.getSession(false);
		UserContainer userContainer = (UserContainer) session.getAttribute("userContainer");
		if (userContainer!=null) {	
			forward = "success";	
			userContainer.getCarrito().removeProductos();
			//session.removeAttribute("listaCarrito");		
			session.setAttribute("userContainer", userContainer);
		}
		return (mapping.findForward(forward));
  	}
}
