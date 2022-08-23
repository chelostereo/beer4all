package beer4all.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;

public class LogoutAction extends Action 
{

  	public ActionForward execute(	ActionMapping mapping, 
									ActionForm form,
									HttpServletRequest request, 
									HttpServletResponse response)
									throws Exception
	{
		// atributos -----------------------------------------------------------------
		String forward = "success";

		HttpSession session = request.getSession(false);
		session.invalidate();
		return (mapping.findForward(forward));
  	}
}