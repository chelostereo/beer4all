<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<logic:notPresent name="userContainer" scope="session">
	<tiles:insert page="/WEB-INF/tiles/body-failure.jsp"/>
</logic:notPresent>

<logic:present name="userContainer" scope="session">
	<logic:empty 	name = "userContainer" 
					property="carrito.listaProductos" scope="session">
		<center class="black">
		<	bean:message key="cart.empty"/>
		</center>
	</logic:empty>

	<logic:notEmpty name="userContainer" 
					property="carrito.listaProductos" scope="session">
		<p align="left" valign="top">
			<display:table 	name="sessionScope.userContainer.carrito.listaProductos"
							id="item" 
							requestURI="" 
							class="carrito" 
							pagesize="5" 
							defaultsort="2" 
							decorator="org.displaytag.decorator.TotalTableDecorator">
							
				<display:column href="/beer4all/action/viewdetalleproducto.do" 
								paramId="id" 
								paramProperty="id" 
								class="imagen" >
					<img src="/beer4all/beer_images/<bean:write name="item" property="producto.imagenURL"/>.gif"/>
				</display:column>						
				
				<display:column property="producto.nombre" 
								title="Nombre" 
								class="nombre"
								href="/beer4all/action/viewdetalleproducto.do" 
								paramId="id" 
								paramProperty="id"/>
				
				<display:column property="producto.precioUnitario" 
								title="Precio Unitario" 
								format="$ {0,number,0.00}" 
								class="precio" />
								
				<display:column property="cantidad" 
								title="Cantidad" 
								format="{0,number,0}" 
								class="precio" 
								total="true"/>
								
				<display:column property="precioTotal" 
								title="Precio Total" 
								format="$ {0,number,0.00}" 
								headerClass="precio" class="precio"
								total="true"/>
			</display:table>
		</p>
		
		<table width="100%" border="1" cellspacing="0" cellpadding="5"  class="black">
			<tr>
				<td id="breadcrumbs" width="30%">
					<bean:message key="user.beersQuantityTitle"/>
				</td>
				<td class="menu" width="20%" align="center">
					<bean:write name="userContainer" property="carrito.cantidadTotalCarrito" /></td>
				<td rowspan="2" class="menu" width="25%" align="center" >
					<html:link action="/action/removeproductos">
						<bean:message key="link.emptyCart"/>
					</html:link>
				</td>
				<td rowspan="2" class="menu" width="25%" align="center" >
					<html:link action="/action/buyproductos">
						<bean:message key="link.buyCart"/>
					</html:link>
				</td>
			</tr>
			<tr>
				<td id="breadcrumbs" width="30%">
					<bean:message key="user.beersTotalPrice"/>
				</td>
				<td class="menu" width="20%" align="center" >
					<bean:write name="userContainer" property="carrito.precioTotalCarrito" format="$ 0.00" /></td>
			</tr>
		</table>
		
	</logic:notEmpty>
</logic:present>