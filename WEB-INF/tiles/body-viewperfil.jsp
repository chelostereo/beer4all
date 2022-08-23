<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<table width="100%" border="1" cellspacing="0" cellpadding="5" class="black" valign="middle">
	<tr align="left">
		<td colspan="2" id="breadcrumbs" class="menu">
				<bean:message key="user.userDataTitle"/>
			</td>
	</tr>
	<tr align="left">	
		<td width="25%">
			<bean:message key="user.username"/>
		</td>
		<td align="center">
			<b><bean:write name= "userContainer" property="usuario.username"/></b>
		</td>
	</tr>
	<tr align="left">	
		<td width="25%">
			<bean:message key="user.password"/>
		</td>
		<td align="center"><b><bean:write name= "userContainer" property="usuario.password"/></b></td>
	</tr>
	<tr align="left">	
		<td width="25%">
			<bean:message key="user.email"/>
		</td>
		<td align="center">
		<b><bean:write name= "userContainer" property="usuario.email"/></b>
		</td>
	</tr>
</table>
<br>

<table width="100%" border="1" cellspacing="0" cellpadding="5" class="black" valign="middle">
	<tr> 
		<td colspan="2" id="breadcrumbs" class="menu">
			<bean:message key="perfil.summaryTitle"/>
		</td>
	</tr>    
	<tr>
		<td width="25%">
			<bean:message key="user.beersQuantityTitle"/>
		</td>
		<td align="center">
		<bean:write name="userContainer" property="usuario.cantidad"/>
		</td>
	</tr>
	<tr>
		<td width="25%">
			<bean:message key="user.beersTotalPrice"/>
		</td>
		<td align="center">
			<bean:write name="userContainer" format="$ 0.00" property="usuario.consumo" />
		</td>	
	</tr>
</table>

