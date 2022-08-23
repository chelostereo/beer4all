<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<p class="black"> <bean:message key="signinOk.title"/> </p>
<table width="100%" border="1" cellspacing="0" cellpadding="3" class="black">
	<tr align="left">
		<td colspan="2" id="breadcrumbs" class="menu">
			<bean:message key="user.userDataTitle"/>
		</td>
	</tr>
	<tr align="left">	
		<td width="25%"><bean:message key="user.username"/></td>
		<td align="center"><b><bean:write name="usuario" property="username"/></b></td>
	</tr>
	<tr>
		<td width="25%"><bean:message key="user.password"/></td>
		<td align="center"><b><bean:write name="usuario" property="password"/></b></td>
	</tr>
	<tr>
		<td width="25%"><bean:message key="user.email"/></td>
		<td align="center"><b><bean:write name="usuario" property="email"/></b></td>
	</tr>
</table>
<p class="menu" align="center">
	<html:link action="/forward/login">
		<bean:message key="link.continue"/>
	</html:link>
</p>
