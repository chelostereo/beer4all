<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<TABLE class="black" width="100%" border="0" cellspacing="0" cellpadding="3" valign="middle">
    <TR>
		<td > 
			<p align="justify">
			<bean:message key="welcome.topText"/>
			</p>
			<p align="right">
			<html:link action="/forward/login">
				<strong>
				<bean:message key="link.loginHere"/>
				</strong>
			</html:link>
			</p>
		</td>
	</TR>
</table>
<br>
<TABLE class="black" width="100%" border="0" cellspacing="0" cellpadding="5" valign="middle">
	<TR valign="top">
		<TD id="breadcrumbs" class="menu" width="100%">
			<bean:message key="welcome.exampleBeers"/>
		</TD>
	</TR>
	</table>
<TABLE class="black" width="100%" border="0" cellspacing="0" cellpadding="5" valign="middle">	
	<TR valign="top">
		<logic:iterate id = "producto" name="listaProductos">
			<TD align="center" width="100">
				<html:link action="/action/viewdetalleproducto" paramId="id" paramName="producto" paramProperty="id">
					<img src="/beer4all/beer_images/<bean:write name="producto" property="imagenURL"/>.gif"/>
				</html:link>
			</TD>
		</logic:iterate>
	</TR>
	<TR valign="top">
		<logic:iterate id = "producto" name="listaProductos">
			<TD width="100" align="center">
				<html:link action="/viewdetalleproducto" paramId="id" paramName="producto" paramProperty="id">
					<b><bean:write name= "producto" property="nombre"/></b>
				</html:link>
			</TD>
		</logic:iterate>
	</TR>
	<tr><td colspan="6" width="100%"></td></tr>
	<TR valign="top">
		<TD colspan="6" width="100%">
			<bean:message key="welcome.middleText" />
		</TD>
	</TR>
	<TR valign="top">
		<TD colspan="6" align="right">
			<bean:message key="welcome.bottomText"/>
		</TD>
	</TR>
</TABLE>




