package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.action.ActionForward;

import beer4all.services.ConnectionService;
import beer4all.forms.UserForm;
import beer4all.Usuario;
import beer4all.UserContainer;


public class RegisterAction extends Action 
{
	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form, 
									HttpServletRequest request, 
									HttpServletResponse response) 
									throws Exception 
	{
		// atributos -----------------------------------------------------------------
		String forward = "failure";
		
		UserForm userForm = (UserForm) form;
		Usuario usuario = new Usuario();
		
		usuario.setUsername(userForm.getUsername());
		usuario.setPassword(userForm.getPassword());
		usuario.setEmail(userForm.getEmail());
		
		ConnectionService connectionService = new ConnectionService();
		int resultado = connectionService.registerUsuario(usuario);
		//connectionService.destroy();
		
		
		if (resultado == 1) {
			forward="success";
			HttpSession session = request.getSession(false);
			session.setAttribute("usuario", usuario);
		}
		else 
		if (resultado == -1) {
			forward="bad-username";
			userForm.setWarning("Nombre de usuario existente. Pruebe otro");
		}
		return (mapping.findForward(forward));
	}
}

			
	