package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;

import beer4all.services.ConnectionService;
import beer4all.forms.UserForm;
import beer4all.Usuario;
import beer4all.UserContainer;


public class BuyProductosAction extends Action 
{

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
			String username = userContainer.getUsuario().getUsername();
			int cantidad = userContainer.getUsuario().getCantidad();
			int cantidadTotalCarrito = userContainer.getCarrito().getCantidadTotalCarrito();
			cantidad = cantidad + cantidadTotalCarrito;
			
			double consumo = userContainer.getUsuario().getConsumo();
			double precioTotalCarrito = userContainer.getCarrito().getPrecioTotalCarrito();
			consumo = consumo + precioTotalCarrito;
			
			ConnectionService connectionService = new ConnectionService();
			connectionService.updateUsuario(username, cantidad, consumo);
			//connectionService.destroy();
		
			userContainer.getCarrito().removeProductos();
			session.setAttribute("userContainer", userContainer);
		}
		
		return (mapping.findForward(forward));
  	}
}