<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<table width="100%" border="0" cellspacing="0" cellpadding="5" valign="middle">
<tr align="right">
	<td id="breadcrumbs" class="menu">
		<bean:message key="whoslogged.title" />
		<logic:empty name = "userContainer">
			<em><bean:message key="whoslogged.user" /></em>
		</logic:empty>
		<logic:notEmpty name="userContainer">
			<b><bean:write name="userContainer" property="usuario.username" scope="session"/></b>
		</logic:notEmpty>
	</td>
</tr>
</table>