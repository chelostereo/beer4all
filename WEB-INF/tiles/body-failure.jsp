<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<table class="menu" width="100%" border="0" cellspacing="0" cellpadding="3" valign="middle">
  <tr>
    <td align="center">
			<font color="red">
				<bean:message key="failure.title"/>
			</font>
		</td>
  </tr>
	<tr>
		<td class="menu" align="center">
			<html:link action="/action/logout">
				<bean:message key="link.continue"/>
			</html:link>
		</td>
	</tr>
</table>


