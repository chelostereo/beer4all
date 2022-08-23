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
import beer4all.Producto;

public class LoginAction extends Action 
{

  	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response)
									throws Exception
	{
		// atributos -----------------------------------------------------------------
		String forward = "failure";
		UserForm userForm = (UserForm)form;
		
		String username = userForm.getUsername();
		String password = userForm.getPassword();

		ConnectionService connectionService = new ConnectionService();
		Usuario usuario = connectionService.authenticateUsuario(username, password);
		//connectionService.destroy();

		HttpSession session = request.getSession();
		session.removeAttribute("usuario");		
		
		if (usuario!=null) {
			Producto producto = (Producto)session.getAttribute("producto");
			if (producto==null) {forward="success";}
			else {forward="success-producto";}				
			UserContainer userContainer = null;
			userContainer = (UserContainer) session.getAttribute("userContainer");
			if 	((userContainer == null)){
				userContainer = new UserContainer();
				userContainer.setUsuario(usuario);
				session.setAttribute("userContainer", userContainer);
			}
		}
		else {
			userForm.setWarning("Nombre de usuario o password incorrectos");
			forward="bad-username";
		}
		return (mapping.findForward(forward));
  	}
}