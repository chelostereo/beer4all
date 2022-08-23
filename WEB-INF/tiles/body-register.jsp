<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:form action="/action/register" focus="username">

<p class="black" align="center">
	<font color="red">
		<b><bean:write name="userForm" property="warning"/></b>
	</font>
</p>

<TABLE align="middle" class="black" valign="middle">
    <TR>
		<td><bean:message key="user.username"/></td>
		<td><html:text property="username"/></td>
		<td><html:errors property="usernameMissing" /></td>
	</TR>
	<TR>
		<td><bean:message key="user.password"/></td>
		<td><html:password property="password" redisplay="false"/></td>
		<td><html:errors property="passwordMissing" /></td>
    </TR>
	<TR>
	  <td><bean:message key="user.email"/></td>
	  <td><html:text property="email"/></td>
	  <td><html:errors property="emailMissing" /></td>
    </TR>
	<TR align="right">
		<td colspan="2">
			<html:submit>
				<bean:message key="signin.buttonCaption"/>
			</html:submit>
		</td>
	</TR>
 </TABLE>
</html:form>

