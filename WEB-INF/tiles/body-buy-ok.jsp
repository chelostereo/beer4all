<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<table width="100%" border="1" cellspacing="0" cellpadding="5" class="black" valign="top">
	<tr>
		<td id="breadcrumbs" class="menu">
			<bean:message key="buyOk.congratulations"/>
		</td>
	</tr>    
	<tr>
		<td align="justify">
			<bean:message key="buyOk.text"/>
		</td>
	</tr>	
		
	<tr class="black">
		<td align="center">
			<html:link href="http://www.pagina.com">Papas fritas</html:link>
			<html:link href="http://www.pagina.com">Aceitunas</html:link>
			<html:link href="http://www.pagina.com">Pickles</html:link>
			<html:link href="http://www.pagina.com">Maníes</html:link>
		</td>
	</tr>	
</table>

<p class="menu" align="center">
	<bean:message key="buyOk.thanks"/><br><br>
	<html:img page="/images/ApuGP3_thumb.gif"/><br><br>
	<html:link action="/action/viewperfil">
		<bean:message key="link.continue"/>
	</html:link>
	
</p>

