<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<table width="100%" border="0"  align="left" class="black">
	<tr>
		<td rowspan="9" width="10%">
			<img src="/beer4all/beer_images/<bean:write name="producto" property="imagenURL"/>.jpg" border="1"/>
		</td>
	</tr>
	<tr>	
		<td id="breadcrumbs" class="menu">
				<bean:message key="beer.name"/>
		</td>
	</tr>
	<tr><td><bean:write name= "producto" property="nombre"/></td></tr>
	<tr><td><br></td></tr>
	
	<tr>
		<td id="breadcrumbs" class="menu" align="justify">
			<bean:message key="beer.description"/>
		</td>
	</tr>
	<tr><td><bean:write name= "producto" property="descripcion"/></td></tr>
	<tr><td><br></td></tr>
	
	<tr>
		<td id="breadcrumbs" class="menu">
			<bean:message key="beer.price"/>
		</td>
	</tr>	
	<tr><td  align="right"><bean:write name= "producto" format="$ 0.00" property="precioUnitario"/></td></tr>
	
	<tr colspan="2">
		<td class="menu" align="center">
			<html:form action="/action/addproducto" focus="cantidad">
				<bean:message key="beer.quantity"/> 
				<html:text property="cantidad" maxlength="4" size="4"/><br>
				<html:submit>
					<bean:message key="beer.buttonCaption"/>
				</html:submit> 
			</html:form>
		</td>
	</tr>
</table>


