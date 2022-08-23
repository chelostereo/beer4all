package beer4all.forms;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

public class UserForm extends ActionForm {

	// atributos -------------------------------------------------------------------
	private String username="";
	private String password="";
	private String email="";
	
	// métodos GET -----------------------------------------------------------------
	public String getUsername() {return (username);}
	public String getPassword()	{return (password);}
	public String getEmail() {return (email);}
	
	// métodos SET -----------------------------------------------------------------
	public void setUsername (String username) {this.username = username;}
	public void setPassword (String password) {this.password = password;}
	public void setEmail (String email) {this.email = email;}
	
	
	// Manually validation input. cuando ocurre un login de usuario inexistente
	// o una registración de usuario existente.
	private String warning ="";
	public String getWarning() {return warning;}
	public void setWarning(String warning) {this.warning = warning;}
	
	// -----------------------------------------------------------------------
	public ActionErrors validate (	ActionMapping mapping, 
									HttpServletRequest request) 
	{
		ActionErrors errors = new ActionErrors();
		if (isMissing(getUsername())) {
			errors.add("usernameMissing", new ActionMessage("username.required"));
		}
		if (isMissing(getPassword())) {
			errors.add("passwordMissing", new ActionMessage("password.required"));
		}
		if (isMissing(getEmail())) {
			errors.add("emailMissing", new ActionMessage("email.required"));
		}
		return (errors);
	}
	
	private boolean isMissing(String value) {
		return ((value==null)||(value.trim().equals("")));
	}
	
}