<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<table border="0" cellspacing="0" cellpadding="5">	
	<tr>
		<td colspan=2>
			<html:img page="/images/banner2.gif"/>
		</td>
	</tr>
	<TR cellpadding="1">
		<td class="menu" align="right">
			<%= new java.util.Date() %>
		</td>
		<html:form action="/action/searchproducto">
		<TD class="menu" align="right">
			<bean:message key="search.title"/>
			<html:text property="nombre"/>
			<html:submit>
				<bean:message key="search.buttonCaption"/>
			</html:submit>
		</TD>
		</html:form>
	</TR>
</table>
<hr size=2>
