<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:form action="/action/login" focus="username">
<p class="black" align="center">
<font color="red">
	<b><bean:write name="userForm" property="warning" filter="false"/></b>
</font>
</p>

<table class="black" border="0" cellspacing="0" cellpadding="5" align="center" valign="middle">
	<tr>
		<td><bean:message key="user.username"/></td>
		<td><html:text property="username"/></td>
		<td></td>
		<td><html:errors property="usernameMissing" /></td>
	</tr>
	<tr>
		<td><bean:message key="user.password"/></td>
		<td><html:password property="password" redisplay="false"/></td>
		<td></td>
		<td><html:errors property="passwordMissing" /></td>
	</tr>
	<TR align="right">
		<td colspan="2">
			<html:submit>
				<bean:message key="login.buttonCaption"/>
			</html:submit>
		</td>
	</TR>
	<tr>
		<td colspan="2"><html:hidden property="email" value="notRequired"/></td>
	</tr>
</table>
</html:form>

<center class="black">
<bean:message key="login.whitoutAccount"/>
<p class="menu">
	<html:link action="/forward/register"> 
		<bean:message key="login.signinFree"/>
	</html:link>
</p>
</p>
</center>
