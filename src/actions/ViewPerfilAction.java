package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;

import beer4all.Usuario;
import beer4all.UserContainer;
import beer4all.services.ConnectionService;


public class ViewPerfilAction extends Action 
{
  	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response)
									throws Exception
	{
	
		// atributos -----------------------------------------------------------------
		String forward = "failure";
		
		HttpSession session = request.getSession(false);
		UserContainer userContainer = (UserContainer) session.getAttribute("userContainer");
		
		if (userContainer!=null) {
			forward = "success";
			String username = userContainer.getUsuario().getUsername();
			String password = userContainer.getUsuario().getPassword();
			
			ConnectionService connectionService = new ConnectionService();
			Usuario usuario = connectionService.authenticateUsuario(username, password);
			//connectionService.destroy();
			
			userContainer.setUsuario(usuario);
			session.setAttribute("userContainer", userContainer);
		}
		return (mapping.findForward(forward));
		
  	}
}